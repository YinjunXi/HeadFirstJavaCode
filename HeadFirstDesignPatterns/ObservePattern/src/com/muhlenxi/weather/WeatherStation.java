package com.muhlenxi.weather;

import com.muhlenxi.weather.SystemObservable.CurrentConditionDisplay;
import com.muhlenxi.weather.SystemObservable.ForecastDisplay;
import com.muhlenxi.weather.SystemObservable.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
