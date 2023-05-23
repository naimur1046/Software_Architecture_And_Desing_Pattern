package creational_design_patterns.builder;

public class Pizza
{
    private final String size;
    private final boolean cheese;
    private final boolean pepperoni;
    private final boolean mushrooms;
    private final boolean onions;
    
    
    private Pizza(PizzaBuilder pizza)
    {
        this.size=pizza.size;
        this.cheese=pizza.cheese;
        this.pepperoni=pizza.pepperoni;
        this.mushrooms=pizza.mushrooms;
        this.onions=pizza.onions;
    }

    public String getSize()
    {
        return size;
    }

    public boolean isCheese()
    {
        return cheese;
    }

    public boolean isPepperoni()
    {
        return pepperoni;
    }

    public boolean isMushrooms()
    {
        return mushrooms;
    }

    public boolean isOnions()
    {
        return onions;
    }

    public static class PizzaBuilder
    {
        public String size;
        public boolean cheese;
        public boolean onions;
        public boolean mushrooms;
        public boolean pepperoni;

        PizzaBuilder(String size)
        {
            this.size=size;
        }
        public PizzaBuilder Cheese(Boolean cheese)
        {
            this.cheese=cheese;
            return this;
        }
        public PizzaBuilder Peeperoni(Boolean pepperoni)
        {
            this.pepperoni=pepperoni;
            return this;
        }
        public PizzaBuilder Mushrooms(Boolean mushrooms)
        {
            this.mushrooms=mushrooms;
            return this;
        }
        public PizzaBuilder Onions(Boolean onions)
        {
            this.onions=onions;
            return this;
        }

        public Pizza Build()
        {
            return new Pizza(this);
        }
    }
}
