
package scd.lab12.observerpattern;

public class StatisticsBoard implements Observer {
    public void update(float temperature, float humidity) {
        System.out.println("Statistics Board -> Avg Temp & Humidity being calculated...");
    }
}
