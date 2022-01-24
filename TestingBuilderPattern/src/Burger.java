public class Burger {

    public static class Builder {
        private String burgerName;
        private String meatType;
        private String bunType;

        public Builder(String burgerName) {
            this.burgerName = burgerName;
        }

        public Builder meat(String meatType) {
            this.meatType = meatType;
            return this;
        }

        public Builder bun(String bunType) {
            this.bunType = bunType;
            return this;
        }

        public Burger build() {
            Burger burger = new Burger();
            burger.burgerName = this.burgerName;
            burger.meatType = this.meatType;
            burger.bunType = this.bunType;

            return burger;
        }
    }

    private String burgerName;
    private String meatType;
    private String bunType;

    private Burger() {

    }

    public String getBurgerName() {
        return burgerName;
    }

    public String getMeatType() {
        return meatType;
    }

    public String getBunType() {
        return bunType;
    }
}
