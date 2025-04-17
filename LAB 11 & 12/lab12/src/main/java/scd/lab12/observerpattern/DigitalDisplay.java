
package scd.lab12.observerpattern;

public class DigitalDisplay implements Observer {
    public void update(float temperature, float humidity) {
        System.out.println("Digital Display -> Temp: " + temperature + ", Humidity: " + humidity);
    }
}
