public class Burger {
    private final double cost;
    private final int letusLeaf;
    private final int meat;
    private final int cheese;

    private static final int cheesePrice = 120;
    private static final int meatPrice = 70;
    private static final int letusLeafPrice = 15;

    private Burger(BurgerBuilder builder) {
        this.cost = builder.getCost();
        this.letusLeaf = builder.letusLeaf;
        this.meat = builder.meat;
        this.cheese = builder.cheese;
    }

    public double getCost() {
        return cost;
    }

    public int getletusLeaf() {
        return letusLeaf;
    }

    public int getMeat() {
        return meat;
    }

    public int getChese() {
        return cheese;
    }

    public static class BurgerBuilder {

        private int cheese = 0;
        private int meat = 0;
        private int letusLeaf = 0;

        public BurgerBuilder() {
        }

        public double getCost() {
            return cheese * cheesePrice + meat * meatPrice + letusLeaf * letusLeafPrice;
        }

        public BurgerBuilder cheese(int cheese) {
            this.cheese += cheese;
            return this;
        }

        public BurgerBuilder letusLeaf(int letusLeaf) {
            this.letusLeaf += letusLeaf;
            return this;
        }

        public BurgerBuilder meat(int meat) {
            this.meat += meat;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
}
