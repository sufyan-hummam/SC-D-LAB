
package scd.lab12.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private float temperature;
    private float humidity;

    public void setMeasurements(float temp, float hum) {
        this.temperature = temp;
        this.humidity = hum;
        notifyObservers();
    }

    public void registerObserver(Observer o) { observers.add(o); }
    public void removeObserver(Observer o) { observers.remove(o); }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature, humidity);
        }
    }
}
