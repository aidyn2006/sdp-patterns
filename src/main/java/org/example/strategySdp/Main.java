package org.example.strategySdp;

public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart=new ShoppingCart();

        shoppingCart.setPaymentStrategy(new CreditCardPayment());
        shoppingCart.checkout(100);

        shoppingCart.setPaymentStrategy(new BankTranferPayment());
        shoppingCart.checkout(150);

        shoppingCart.setPaymentStrategy(new PayPalPayment());
        shoppingCart.checkout(200);
    }
}
