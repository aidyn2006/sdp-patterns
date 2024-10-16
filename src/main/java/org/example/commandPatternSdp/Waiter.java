package org.example.commandPatternSdp;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
    private List<Command> orderList = new ArrayList<>();

    public void takeOrder(Command command) {
        orderList.add(command);
    }

    public void placeOrders() {
        for (Command command : orderList) {
            command.execute();
        }
        orderList.clear();
    }
}
