package scd.lab12.observerpattern;

public class WeatherSystemTest {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        Observer display = new DigitalDisplay();
        Observer stats = new StatisticsBoard();
        Observer alert = new MobileAlertSystem();

        station.registerObserver(display);
        station.registerObserver(stats);
        station.registerObserver(alert);

        System.out.println("\n--- Weather changed to 25°C, 60% ---");
        station.setMeasurements(25f, 60f);

        System.out.println("\n--- News Channel Subscribed ---");
        Observer news = new NewsChannel();
        station.registerObserver(news);

        System.out.println("\n--- Weather changed to 30°C, 40% ---");
        station.setMeasurements(30f, 40f);
    }
}
