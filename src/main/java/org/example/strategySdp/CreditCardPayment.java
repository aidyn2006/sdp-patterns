package org.example.strategySdp;

public class CreditCardPayment implements PaymentStrategy{


    @Override
    public void pay(Integer amount) {
        System.out.println("Pays "+ amount + " by Credit Card");
    }
}
