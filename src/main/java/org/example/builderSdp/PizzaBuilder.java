package org.example.builderSdp;

public class PizzaBuilder implements Builder<Pizza> {
    protected String size;
    protected String crustType;
    protected String topping;

    public PizzaBuilder setSize(String size){
        this.size=size;
        return this;
    }

    public PizzaBuilder setCrustType(String crustType){
        this.crustType=crustType;
        return this;
    }
    public PizzaBuilder setTopping(String topping){
        this.topping=topping;
        return this;
    }


    @Override
    public Pizza build() {
        return new Pizza(size,crustType,topping);
    }
}
