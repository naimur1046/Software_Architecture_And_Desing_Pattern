package Design_Pattern.Behavioural_Design_Pattern.Chain_Of_Responsibility;

public class ChainOfResponsibility
{
    public static void main(String[] args) {
        PaymentHandler bank = new BankPaymentHandler();
        PaymentHandler credit_card = new CreditCardPaymentHandler();
        PaymentHandler paypal = new PayPalPaymentHandler();
        bank.setNext(credit_card);
        credit_card.setNext(paypal);
        bank.handlePayment(300);
        bank.handlePayment(700);
        bank.handlePayment(4000);
    }
}
