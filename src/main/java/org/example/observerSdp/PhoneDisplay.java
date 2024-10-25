package org.example.observerSdp;

public class PhoneDisplay implements WeatherObserver{


    @Override
    public void update(String message) {
        System.out.println("PhoneDisplay recieved message: "+ message);
    }
}
