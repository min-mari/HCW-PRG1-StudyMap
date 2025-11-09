package homeworks.hm4;

import homeworks.hm4.Car;
import homeworks.hm4.ParkingGarage;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // test your implementation here

        /*
        // Beispielhafte Vorgehensweise:

        ParkingGarage garage = new ParkingGarage("Millennium Park Garage", 42);
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Menu ---");
            System.out.println("1: Park a new car");
            System.out.println("2: Remove a car");
            System.out.println("3: Show garage");
            System.out.println("4: Exit");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            // Auswahl auswerten und entsprechende Aktionen setzen...
            // TODO
        }
        */

        ParkingGarage garage = new ParkingGarage("Donauzentrum VIP", 10);
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println();
            System.out.println("--- Menu ---");
            System.out.println("1: Park a new car");
            System.out.println("2: Remove a car");
            System.out.println("3: Show garage");
            System.out.println("4: Exit");
            System.out.print("Choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("License plate: ");
                String plate = scanner.nextLine();

                System.out.print("Color: ");
                String color = scanner.nextLine();

                Car car = new Car(plate, color);
                boolean parked = garage.parkCar(car);

                if (parked) {
                    System.out.println("Car parked: " + car.toString());
                } else {
                    System.out.println("Garage is full! Please redirect to our other parking facilities.");
                }
            } else if (choice == 2) {
                System.out.print("License plate to remove: ");
                String plate = scanner.nextLine();

                boolean removed = garage.removeCar(plate);

                if (removed) {
                    System.out.println("Car removed.");
                } else {
                    System.out.println("No such car with this plate was found in the system.");
                }
            } else if (choice == 3) {
                garage.showGarage();
            } else if (choice == 4) {
                running = false;
                System.out.println("Goodbye and until next time!");
            } else {
                System.out.println("Invalid choice!");
            }
        }
    }
}