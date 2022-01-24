public class Solution {

    public static boolean hasSharedDigit(int a, int b){
        int a1 = 0;
        int a2 = 0;
        int b1 = 0;
        int b2 = 0;

        if((a <= 10 || a >= 99) || (b <= 10 || b >= 99)){
            return false;
        }

        a1 = a % 10;
        a2 = (a / 10) % 10;
        b1 = b % 10;
        b2 = (b / 10) % 10;

        if(a1 == b1 || a1 == b2 || a2 == b1 || a2 == b2){
            return true;
        }else{
            return false;
        }
    }
}
