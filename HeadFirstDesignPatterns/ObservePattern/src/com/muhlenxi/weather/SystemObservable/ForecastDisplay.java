package com.muhlenxi.weather.SystemObservable;

import com.muhlenxi.weather.Custome.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
    private  Observable observable;
    private float lastPressure;
    private float currentPressure = 29.92f;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();

            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Pressure: " + currentPressure);
    }
}
