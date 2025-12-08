package services.notification;

public interface Notifier {
    void sendNotification(String recipient, String message);
}