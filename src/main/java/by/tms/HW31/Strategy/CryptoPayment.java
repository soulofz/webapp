package by.tms.HW31.Strategy;

public class CryptoPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Payment " + amount + " by Crypto");
    }
}
