package services.payment;
public class CashPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Payment by Cash processed: " + amount);
    }
}