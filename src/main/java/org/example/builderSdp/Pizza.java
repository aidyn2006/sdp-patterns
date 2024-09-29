package org.example.builderSdp;

public class Pizza {
    private String size;
    private String crustType;
    private String topping;

    public Pizza(String size, String crustType, String topping) {
        this.size = size;
        this.crustType = crustType;
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", crustType='" + crustType + '\'' +
                ", topping='" + topping + '\'' +
                '}';
    }
}
