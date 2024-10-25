package org.example.observerSdp;

public class TVDisplay implements WeatherObserver{

    @Override
    public void update(String message) {
        System.out.println("TvDisplay recieved message: "+ message);
    }
}
