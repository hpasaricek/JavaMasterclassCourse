public class Main {
    public static void main(String[] args) {
        System.out.println(canPack(2, 1, 6));

//        if (((bigCount * 5) + (smallCount)) < goal) {
//            return false;
//        }
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }

        while (bigCount > 0) {
            if (goal >= (bigCount * 5)) {
                goal -= 5;
            }
            bigCount--;
        }

        while (smallCount > 0) {
            if (goal > 0) {
                goal -= 1;
            }
            smallCount--;
        }

        return goal == 0;

    }
}
