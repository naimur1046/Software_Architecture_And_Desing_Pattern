public class Client {
    public static void main(String[] args) {
        Burger burger = new Burger.BurgerBuilder().meat(3).cheese(2).build();

        System.out.println("Chese : " + burger.getChese());
        System.out.println("Meat : " + burger.getMeat());
        System.out.println("LetusLeaf : " + burger.getletusLeaf());
        System.out.println("Cost of the burger: " + burger.getCost());
    }
}
