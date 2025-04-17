
package scd.lab12.observerpattern;

public class MobileAlertSystem implements Observer {
    public void update(float temperature, float humidity) {
        System.out.println("Mobile Alert: Weather updated -> Temp: " + temperature + ", Humidity: " + humidity);
    }
}
