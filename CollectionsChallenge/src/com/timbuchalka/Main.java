package com.timbuchalka;

import java.util.FormatFlagsConversionMismatchException;
import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
	    StockItem temp = new StockItem("Bread", 1.2, 5);
        stockList.addStock(temp);

        temp = new StockItem("Cake", 5.5, 2);
        stockList.addStock(temp);

        temp = new StockItem("Chair", 60.5, 20);
        stockList.addStock(temp);

        temp = new StockItem("Cup", 0.50, 50);
        stockList.addStock(temp);

        temp = new StockItem("Juice", 0.75, 8);
        stockList.addStock(temp);

        temp = new StockItem("Towel", 2.55, 15);
        stockList.addStock(temp);

        temp = new StockItem("Vase", 4.25, 20);
        stockList.addStock(temp);

        System.out.println(stockList);

        System.out.println("///////////////////////////////////////////////////////");

        Basket timsBasket = new Basket("Tim");
        sellItem(timsBasket, "Cake", 1);
        sellItem(timsBasket, "Juice", 2);
        sellItem(timsBasket, "Cup", 10);
        sellItem(timsBasket, "Bread", 2);
        System.out.println(timsBasket);

        System.out.println("///////////////////////////////////////////////////////");

        unreserveItem(timsBasket,"Juice",1);
//        finishBasket(timsBasket);

        System.out.println(timsBasket);
                finishBasket(timsBasket);
        System.out.println(stockList);


    }

    public static int sellItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(stockList.sellStock(item, quantity) != 0) {
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;
    }

    public static void finishBasket(Basket basket) {
        for (Map.Entry<StockItem, Integer> item : basket.Items().entrySet()) {
            item.getKey().sellStock();
        }
        System.out.println("Succesfully checked out!");
        basket.Items().clear();
    }

    public static void unreserveItem(Basket basket, String item, int quantity) {
        StockItem stockItem = null;
        int itemQuantity = 0;
        for (Map.Entry<StockItem, Integer> items : basket.Items().entrySet()) {
            if (items.getKey().getName().equals(item)) {
                stockItem = items.getKey();
                itemQuantity = items.getValue() - quantity;
            }
        }
        if(stockItem == null) {
            System.out.println("You don't have " + item + " in your basket.");
            return;
        }

        stockItem.unreserveStock(quantity);
        basket.Items().replace(stockItem, itemQuantity);
    }
}
