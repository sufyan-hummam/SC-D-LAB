import java.util.Scanner;

public class InchesToMeters {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter length in inches: ");
    double inches = scanner.nextDouble();
    double meters = inches * 0.0254;
    System.out.println("Length in meters: " + meters);
}
}
