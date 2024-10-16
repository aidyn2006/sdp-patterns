package org.example.commandPatternSdp;

public class OrderSaladCommand implements Command {
    private Chef chef;

    public OrderSaladCommand(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.prepareSalad();
    }
}
