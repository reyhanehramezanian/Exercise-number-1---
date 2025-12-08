package services;

import services.payment.PaymentMethod; 
import services.notification.Notifier;

public class ReservationService {
 
    public void makeReservation(
        Reservation res, 
        PaymentMethod paymentMethod,   
        Notifier notifier           
    ){
        System.out.println("Processing reservation for " + res.customer.name);

        if(res.customer.city.equals("Paris")){
            System.out.println("Apply city discount for Paris!");
            res.room.price *= 0.9;
        }
        paymentMethod.pay(res.totalPrice()); 

        System.out.println("----- INVOICE -----");
        System.out.println("Customer: " + res.customer.name);
        System.out.println("Room: " + res.room.number + " (" + res.room.type + ")");
        System.out.println("Total: " + res.totalPrice());
        System.out.println("-------------------");

        notifier.sendNotification(res.customer.email, "Your reservation confirmed!");
    }
}