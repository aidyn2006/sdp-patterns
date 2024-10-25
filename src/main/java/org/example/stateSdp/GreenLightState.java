package org.example.stateSdp;

public class GreenLightState implements TrafficLight{


    @Override
    public void showCurrentState() {
        System.out.println("Green");
    }

    @Override
    public TrafficLight nextState() {
        return new YellowLightState();
    }
}
