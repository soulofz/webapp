package by.tms.HW29.O.bad;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification("Привет", "email");
        notificationService.sendNotification("Пока", "phone");
    }
}
