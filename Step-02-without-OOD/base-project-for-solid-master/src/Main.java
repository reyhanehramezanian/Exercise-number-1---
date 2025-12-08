import models.Customer;
import models.LuxuryRoom;
import models.Room;
import services.Reservation;
import services.ReservationService;

import services.payment.PayPalPayment; 
import services.payment.PaymentMethod;
import services.notification.EmailSender; 
import services.notification.Notifier;

public class Main {
    public static void main(String[] args){
        Customer customer = new Customer("Ali", "ali@example.com","09124483765", "Paris");
        Room room = new LuxuryRoom("203", 150);
        Reservation res = new Reservation(room, customer, 2);

        ReservationService service = new ReservationService();
        
        System.out.println("--- Scenario 1: PayPal and Email ---");
        PaymentMethod paypalMethod = new PayPalPayment(); 
        Notifier emailNotifier = new EmailSender(); 
        service.makeReservation(res, paypalMethod, emailNotifier);
        
        System.out.println("\n--- Scenario 2: OnSite Payment and SMS (New Feature) ---");
        PaymentMethod newPayment = new services.payment.OnSitePayment();
        Notifier newNotifier = new services.notification.SmsSender();
        
        service.makeReservation(res, newPayment, newNotifier);
    }
}