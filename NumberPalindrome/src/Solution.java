public class Solution {

    public static boolean isPalindrome(int number) {
        int reverseNumber = 0;
        int remainder = 0;
        int originalNumber = number;

        while (number != 0) {
            remainder = number % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            number /= 10;
        }

        if (originalNumber == reverseNumber) {
            return true;
        } else {
            return false;
        }
    }
}
