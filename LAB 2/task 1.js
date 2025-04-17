import java.util.Scanner;

class TrafficLight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter traffic light number (1-Red, 2-Yellow, 3-Green): ");         int light = scanner.nextInt();         switch (light) {             case 1:
                System.out.println("Stop");                 break;             case 2:
                System.out.println("Get Ready");                 break;             case 3:
                System.out.println("Go");                 break;             default:
                System.out.println("Invalid input");
        }
        scanner.close();
    }
}

