package services.payment;
public class OnSitePayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Payment On Site recorded: " + amount + " (Payment is pending until check-out)"); 
    }
}