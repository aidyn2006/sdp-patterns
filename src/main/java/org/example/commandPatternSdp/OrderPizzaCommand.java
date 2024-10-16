package org.example.commandPatternSdp;


public class OrderPizzaCommand implements Command {
    private Chef chef;

    public OrderPizzaCommand(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.preparePizza();
    }
}
