package Design_Pattern.Behavioural_Design_Pattern.Chain_Of_Responsibility;

public class PayPalPaymentHandler extends PaymentHandler
{
    @Override
    public void handlePayment(double amount) {
        if(amount<5000)
        {
            System.out.println("The amount is paid by paypal "+amount);
        }
        else
        {
            next.handlePayment(amount);
        }
    }
}
