import java.util.Scanner;

public class MetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance in meters: ");
        double meters = scanner.nextDouble();
        double kilometers = meters / 1000;
        System.out.println("Distance in kilometers: " + kilometers);
    }
}
