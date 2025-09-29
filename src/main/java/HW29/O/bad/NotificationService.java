package HW29.O.bad;

public class NotificationService {
    public void sendNotification(String message, String type) {
        if("email".equals(type)) {
            //логика отправки email
        }
        else if("phone".equals(type)) {
            //логика отправки обычного смс
        }else {
            throw new IllegalArgumentException("Invalid type");
        }
    }
}
