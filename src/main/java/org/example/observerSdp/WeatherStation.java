package org.example.observerSdp;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private List<WeatherObserver> weatherObserver=new ArrayList<>();

    public void addObserver(WeatherObserver message){
        this.weatherObserver.add(message);
    }
    public void removeObserver(WeatherObserver message){
        this.weatherObserver.remove(message);
    }
    public void notifyObservers(String message){
        for (WeatherObserver weatherObserver1 : weatherObserver){
            weatherObserver1.update(message);
        }
    }
    public void changes(String newState){
        System.out.println("Changes message: "+ newState);
        notifyObservers(newState);
    }

}
