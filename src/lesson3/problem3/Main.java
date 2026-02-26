package lesson3.problem3;

import java.util.Scanner;

public class Main {
    static void main() {
        do {
            IO.println("Enter F for Flight Booking\n" +
                    "Enter H for Hotel Booking\n" +
                    "Enter C for Car Rental");
            Scanner sc = new Scanner(System.in);
            String bookingType = sc.nextLine();

            switch (bookingType) {
                case "F": {
                    IO.print("Enter origin: ");
                    String origin = sc.nextLine();
                    IO.print("Enter destination: ");
                    String destination = sc.nextLine();
                    IO.print("Enter distance in km: ");
                    int distance = sc.nextInt();
                    IO.print("Enter average speed (km/h): ");
                    int averageSpeed = sc.nextInt();
                    FlightBooking flight = new FlightBooking(origin, destination, distance);
                    System.out.printf("Estimated Flight Time: %.2f hours\n", flight.computeFlightTime(averageSpeed));
                    break;
                }
                case "H": {
                    IO.print("Enter hotel name: ");
                    String hotelName = sc.nextLine();
                    IO.print("Enter number of nights: ");
                    int nights = sc.nextInt();
                    IO.print("Enter price per night: ");
                    int pricePerNight = sc.nextInt();
                    HotelBooking hotel = new HotelBooking(hotelName, nights, pricePerNight);
                    System.out.printf("Total Hotel Cost: %.2f\n", hotel.totalCost());
                    break;
                }
                case "C": {
                    IO.print("Enter car model: ");
                    String model = sc.nextLine();
                    IO.print("Enter number of days: ");
                    int days = sc.nextInt();
                    IO.print("Enter rate per day: ");
                    int rate = sc.nextInt();
                    IO.print("Enter miles per day: ");
                    int miles = sc.nextInt();
                    CarRental car = new CarRental(model, days, rate, miles);
                    System.out.printf("Total Rental Cost: %.2f\n", car.totalRentalCost());
                    System.out.printf("Total Miles Allowed: %.2f\n", car.totalMilesAllowed());
                    break;
                }
                default : IO.println("Booking type not supported.");
            }
            IO.print("Do you want to continue (y/n): ");
            String yesNo = sc.next();
            IO.println("");
            if (yesNo.equalsIgnoreCase("n")) break;
        } while (true);
    }
}
