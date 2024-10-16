package org.example.commandPatternSdp;

public class OrderPastaCommand implements Command {
    private Chef chef;

    public OrderPastaCommand(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.preparePasta();
    }
}
