public class Solution {
    public static boolean isPerfectNumber(int number){
        int sumOfDivisors = 0;

        if(number < 1){
            return false;
        }else{
            for(int i=1; i<number; i++ ){
                if((number % i) == 0){
                    sumOfDivisors += i;
                }
            }
        }
        if(sumOfDivisors == number){
            return true;
        }else{
            return false;
        }
    }
}
