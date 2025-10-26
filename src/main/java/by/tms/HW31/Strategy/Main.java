package by.tms.HW31.Strategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.checkout(100);

        shoppingCart.setPaymentStrategy(new CardPayment());
        shoppingCart.checkout(200);

        shoppingCart.setPaymentStrategy(new ApplePayPayment());
        shoppingCart.checkout(300);

        shoppingCart.setPaymentStrategy(new CryptoPayment());
        shoppingCart.checkout(400);
    }
}
