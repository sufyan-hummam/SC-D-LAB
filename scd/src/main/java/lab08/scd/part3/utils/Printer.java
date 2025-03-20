package lab08.scd.part3.utils;

public class Printer {
    private static Printer instance;

    private Printer() {}  // Private constructor to prevent instantiation

    public static Printer getInstance() {
        if (instance == null) {
            instance = new Printer();
        }
        return instance;
    }

    public void printMessage(String message) {
        System.out.println("Printing: " + message);
    }
}

