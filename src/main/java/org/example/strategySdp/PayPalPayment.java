package org.example.strategySdp;

public class PayPalPayment implements PaymentStrategy{
    @Override
    public void pay(Integer amount) {
        System.out.println("Pays "+ amount + " by PayPal");
    }
}
