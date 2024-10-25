package org.example.stateSdp;

public class Main {
    public static void main(String[] args) {
        Control control=new Control();
        control.setTrafficLight(new GreenLightState());

        control.showCurrentState();
        control.nextState();
        control.showCurrentState();

    }
}
