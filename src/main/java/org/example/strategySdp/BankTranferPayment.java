package org.example.strategySdp;

public class BankTranferPayment implements PaymentStrategy{
    @Override
    public void pay(Integer amount) {
        System.out.println("Pays "+ amount + " by Bank Transfer");
    }
}
