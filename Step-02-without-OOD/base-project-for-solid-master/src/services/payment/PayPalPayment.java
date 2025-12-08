package services.payment;
public class PayPalPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Payment by PayPal processed: " + amount);
    }
}