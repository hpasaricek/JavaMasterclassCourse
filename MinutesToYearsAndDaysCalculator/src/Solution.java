public class Solution {

    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        }
        else{
            long days = minutes / (24 * 60);
            long years = minutes / (365 * 24 * 60);
            System.out.println(minutes + " min = " + years + " y and " + (days % 365) + " d");
        }
    }
}
