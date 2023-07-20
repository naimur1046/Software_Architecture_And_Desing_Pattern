package Design_Pattern.Behavioural_Design_Pattern.Command_Design_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Broker
{
    private List<Order> orderList = new ArrayList<Order>();
    public void takeOrder(Order order)
    {
        orderList.add(order);
    }
    public void placeOrder()
    {
        for(Order o:orderList)
        {
            o.execute();
        }
        orderList.clear();
    }
}
