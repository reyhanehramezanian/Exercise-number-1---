package services.payment;
public class CardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Payment by Card processed: " + amount);
    }
}