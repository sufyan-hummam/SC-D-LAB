package lab08.scd.part3.main;
import lab08.scd.part3.utils.Printer;

public class SingletonPrinterMain {
    public static void main(String[] args) {
        Printer printer1 = Printer.getInstance();
        printer1.printMessage("Hello, Singleton Printer!");

        Printer printer2 = Printer.getInstance();

        // Checking if both instances are the same
        System.out.println("Are both instances same? " + (printer1 == printer2)); // Output: true
    }
}
