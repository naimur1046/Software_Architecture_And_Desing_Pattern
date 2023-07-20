package Design_Pattern.Behavioural_Design_Pattern.Command_Design_Pattern;

public class SellStock implements Order
{
    private Stock ABCstock;
    public SellStock(Stock ABCstock)
    {
        this.ABCstock=ABCstock;
    }

    @Override
    public void execute()
    {
        ABCstock.sell();

    }
}
