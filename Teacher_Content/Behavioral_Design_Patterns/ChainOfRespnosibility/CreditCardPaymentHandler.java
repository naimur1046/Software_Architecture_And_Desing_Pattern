package Design_Pattern.Behavioural_Design_Pattern.Chain_Of_Responsibility;

public class CreditCardPaymentHandler extends PaymentHandler{
    @Override
    public void handlePayment(double amount) {
        if(amount<=1000)
        {
            System.out.println("The amount is paid by credit card "+amount);
        }
        else
        {
            next.handlePayment(amount);
        }
    }
}
