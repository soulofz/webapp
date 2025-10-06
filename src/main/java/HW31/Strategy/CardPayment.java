package HW31.Strategy;

public class CardPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Payment " + amount + " by Card");
    }
}
