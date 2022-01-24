public class Main {
    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(5, 11));
        System.out.println(calcFeetAndInchesToCentimeters(75));
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            return -1;
        } else {
            return (inches * 2.54) + ((feet * 12) * 2.54);
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        } else {
            double feet = (int) inches / 12;
            inches = (int) inches % 12;
            return calcFeetAndInchesToCentimeters(feet, inches);
        }
    }
}

