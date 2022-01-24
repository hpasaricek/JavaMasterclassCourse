public class TeenNumberChecker {
    public static void main(String[] args) {

    }

    public static boolean hasTeen(int teen1, int teen2, int teen3) {
        return (isTeen(teen1) || isTeen(teen2) || isTeen(teen3));
    }

    public static boolean isTeen(int teen) {
        return (teen >= 13 && teen <= 19);
    }
}
