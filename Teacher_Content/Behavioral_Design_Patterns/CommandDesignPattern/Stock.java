package Design_Pattern.Behavioural_Design_Pattern.Command_Design_Pattern;

public class Stock
{
    private String name="ABCstock";
    private int quantity=10;
    public void buy()
    {
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
    }
    public void sell()
    {
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
    }
}
