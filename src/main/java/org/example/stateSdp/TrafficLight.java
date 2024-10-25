package org.example.stateSdp;

public interface TrafficLight {
    void showCurrentState();
    TrafficLight nextState();
}
