package by.tms.HW29.O.good;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();

        Notification email = new EmailService();
        Notification phone = new PhoneService();

        notificationService.send("Привет", email);
        notificationService.send("Пока", phone);
    }
}
