package by.tms.HW31.Strategy;

public class ApplePayPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Payment " + amount + " by ApplePay");
    }
}
