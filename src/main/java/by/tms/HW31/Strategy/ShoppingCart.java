package by.tms.HW31.Strategy;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount) {
        if (paymentStrategy == null){
            System.out.println("Payment strategy is not chosen.");
        } else if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero.");
        }else {
            paymentStrategy.pay(amount);
        }
    }
}
