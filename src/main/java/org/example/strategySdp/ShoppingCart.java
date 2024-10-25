package org.example.strategySdp;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void checkout(Integer amount){
        this.paymentStrategy.pay(amount);
    }
}
