package creational_design_patterns.builder;

public class Client
{
    public static void main(String[] args) {
        Pizza pizza = new Pizza.PizzaBuilder("Large").Cheese(true).Peeperoni(true).Mushrooms(true).Onions(true).Build();


        System.out.println(pizza.getSize());
        System.out.println(pizza.isCheese());
        System.out.println(pizza.isPepperoni());
        System.out.println(pizza.isMushrooms());
        System.out.println(pizza.isOnions());
    }
}
