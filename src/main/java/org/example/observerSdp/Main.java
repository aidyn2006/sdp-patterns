package org.example.observerSdp;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation=new WeatherStation();

        WeatherObserver phone=new PhoneDisplay();
        WeatherObserver tv=new TVDisplay();
        WeatherObserver website=new WebsiteDisplay();

        weatherStation.addObserver(phone);
        weatherStation.addObserver(tv);
        weatherStation.addObserver(website);

        weatherStation.changes("New state1");
        weatherStation.changes("New state2");

    }
}
