public class Solution {
    public static int getGreatestCommonDivisor(int first, int second){
        int greatestDivisor = 0;

        if((first < 10) || (second < 10)){
            return -1;
        }else {
            int min = 0;
            if (first < second) {
                min = first;
            } else {
                min = second;
            }

            for (int i = 1; i <= min; i++) {
                if ((first % i == 0) && (second % i == 0)) {
                    greatestDivisor = i;
                }
            }
        }
        return greatestDivisor;

    }
}
