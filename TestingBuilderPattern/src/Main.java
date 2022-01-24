public class Main {
    public static void main(String[] args) {
        Burger burger = new Burger.Builder("Classic burger")
                .meat("Beef")
                .bun("White bread")
                .build();

       // Ili se može i ovako napraviti

        Burger.Builder builder = new Burger.Builder("Classic burger");
        builder.meat("Beef");
        builder.bun("White bread");
        Burger burger2 = builder.build(); 
    }


}
