
package scd.lab12.observerpattern;

public class NewsChannel implements Observer {
    public void update(float temperature, float humidity) {
        System.out.println("News Channel reports Temp: " + temperature + ", Humidity: " + humidity);
    }
}
