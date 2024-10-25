package org.example.stateSdp;

public class YellowLightState implements TrafficLight {


    @Override
    public void showCurrentState() {
        System.out.println("Yellow");
    }

    @Override
    public TrafficLight nextState() {
        return new RedLightState();
    }
}
