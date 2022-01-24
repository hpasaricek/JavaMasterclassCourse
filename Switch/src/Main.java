public class Main {
    public static void main(String[] args) {
       /* int value = 2;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was not 1 or 2");
        }*/

        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Actually it was " + switchValue);
                break;
            default:
                System.out.println("Value was not 1 or 2");
                break;
        }

        char switchChar = 'G';

        switch(switchChar) {
            case 'A':
                System.out.println("Found A");
                break;
            case 'B':
                System.out.println("Found B");
                break;
            case 'C':
                System.out.println("Found C");
                break;
            case 'D':
                System.out.println("Found D");
                break;
            case 'E':
                System.out.println("Found E");
                break;
            default:
                System.out.println("Not found!");
                break;
        }

        String s = "Jura";

        switch (s.toLowerCase()) {
            case "jura":
                System.out.println("Found Hrvac");
                break;
            default:
                System.out.println("Gdje gdje gdje je Jura?");
                break;
        }
    }
}
