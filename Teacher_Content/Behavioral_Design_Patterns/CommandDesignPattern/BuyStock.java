package Design_Pattern.Behavioural_Design_Pattern.Command_Design_Pattern;

public class BuyStock implements Order
{
    Stock ABCstock;

    public BuyStock(Stock ABCstock) {
        this.ABCstock = ABCstock;
    }

    @Override
    public void execute() {
        ABCstock.buy();

    }
}
