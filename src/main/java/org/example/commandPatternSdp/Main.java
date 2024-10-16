package org.example.commandPatternSdp;

public class Main {
    public static void main(String[] args) {
        Chef chef = new Chef();

        Command orderPizza = new OrderPizzaCommand(chef);
        Command orderPasta = new OrderPastaCommand(chef);
        Command orderSalad = new OrderSaladCommand(chef);

        Waiter waiter = new Waiter();

        waiter.takeOrder(orderPizza);
        waiter.takeOrder(orderPasta);
        waiter.takeOrder(orderSalad);

        System.out.println("Waiter is placing orders to the kitchen:");
        waiter.placeOrders();
    }
}
