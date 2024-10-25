package org.example.stateSdp;

public class Control {
    private TrafficLight trafficLight;

    public void setTrafficLight(TrafficLight trafficLight){
        this.trafficLight=trafficLight;
    }

    public void nextState() {
        trafficLight = trafficLight.nextState();
    }

    public void showCurrentState(){
        trafficLight.showCurrentState();
    }
}
