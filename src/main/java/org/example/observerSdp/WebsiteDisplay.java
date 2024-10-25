package org.example.observerSdp;

public class WebsiteDisplay implements WeatherObserver{

    @Override
    public void update(String message) {
        System.out.println("WebsiteDisplay recieved message: "+ message);
    }
}
