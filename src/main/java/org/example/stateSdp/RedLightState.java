package org.example.stateSdp;

public class RedLightState implements TrafficLight{


    @Override
    public void showCurrentState() {
        System.out.println("Red");
    }

    @Override
    public TrafficLight nextState() {
        return new GreenLightState();
    }
}
