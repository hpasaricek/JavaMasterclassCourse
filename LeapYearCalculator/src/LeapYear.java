public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(1924));

    }

    public static boolean isLeapYear(int year) {
        if (year <= 0 || year > 9999) {
            return false;
        } else {
           if ((year % 4 == 0) && (year % 400 == 0) && (year % 100 == 0)) {
               return true;
               // drugi način rješavanja problema
           } else {
               return ((year % 4 == 0) && (year % 100 !=0));
           }

           // Drugi način rješavanja gornjeg dijela
//           } else if ( (year % 4 == 0) && (year % 100 != 0)){
//               return true;
//           } else {
//               return false;
//           }
        }
    }
}
