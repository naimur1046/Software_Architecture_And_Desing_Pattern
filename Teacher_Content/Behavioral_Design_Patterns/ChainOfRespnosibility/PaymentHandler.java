package Design_Pattern.Behavioural_Design_Pattern.Chain_Of_Responsibility;

public abstract class PaymentHandler {
        protected PaymentHandler next;
        public void setNext(PaymentHandler next)
        {
            this.next=next;
        }
        public abstract void handlePayment(double amount);
}


