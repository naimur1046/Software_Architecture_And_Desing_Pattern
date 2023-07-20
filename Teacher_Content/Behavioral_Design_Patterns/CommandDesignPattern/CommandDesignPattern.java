package Design_Pattern.Behavioural_Design_Pattern.Command_Design_Pattern;

public class CommandDesignPattern
{
    public static void main(String[] args)
    {
        Stock ABCstock = new Stock();

        BuyStock buyStock = new BuyStock(ABCstock);
        SellStock sellStock = new SellStock(ABCstock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);
        broker.placeOrder();
    }
}
