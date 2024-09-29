package org.example.builderSdp;

public class Main {
    public static void main(String[] args) {
        Pizza pizza=new PizzaBuilder()
                .setCrustType("Thin")
                .setSize("30cm")
                .setTopping("Cheese")
                .build();
        System.out.println(pizza);
    }
    
}
