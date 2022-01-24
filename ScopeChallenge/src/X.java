public class X {
    private int x;

    public X(int x) {
        this.x = x;
    }

    public void x() {
        System.out.println("Times table from 1 to 12 for number " + x + " is:");
        for (int x = 1; x < 13; x++) {
            System.out.println(this.x + " * " + x + " = " + (this.x * x));
        }
    }
}
