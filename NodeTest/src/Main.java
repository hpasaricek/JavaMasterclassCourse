public class Main {
    public static void main(String[] args) {
        ItemInfoList list = new ItemInfoList();
        for (int i = 1; i <= 10; i++) {
            list.addBack(new ItemInfo("name-"+i, "rfd"+i, i, String.valueOf(i)));

        }

        System.out.println(list.getSize());
        /*while (list.getSize() > 0){
            System.out.println(list.removeFront().getName());
        }*/
    }
}
