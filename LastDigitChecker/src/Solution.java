public class Solution {
    public static boolean hasSameLastDigit(int a, int b, int c){

        if((a < 10) || (a > 1000) || (b < 10) || (b > 1000) || (c < 10) || (c > 1000)){
            return false;
        }

        int digitA = a % 10;
        int digitB = b % 10;
        int digitC = c % 10;

        if(digitA == digitB || digitB == digitC || digitC == digitA){
            return true;
        }else{
            return false;
        }

    }
}
