package Design_Pattern.Behavioural_Design_Pattern.Chain_Of_Responsibility;

public class BankPaymentHandler extends PaymentHandler {
    @Override
    public void handlePayment(double amount)
    {
        if(amount<500)
        {
            System.out.println("Paid The amount using Bnak "+amount);
        }
        else
        {
            next.handlePayment(amount);
        }

    }
}
