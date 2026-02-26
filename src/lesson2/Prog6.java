package lesson2;

import java.util.Scanner;

public class Prog6 {
    static void main() {
        String yesNo = "n";
        do{
            Scanner sc = new Scanner(System.in);
            IO.println("Enter user type (R/C/I): ");
            String userType = sc.next();
            IO.println("Enter units consumed: ");
            int units = sc.nextInt();
            double bill = 0.0;

            switch (userType){
                case "R" -> bill = units * 0.12;
                case "C" -> bill = units * 0.20;
                case "I" -> bill = units * 0.35;
                default -> bill = units * 0.0;
            }
            IO.println("=== Electricity Bill ===");
            IO.println("User Type: "+userType);
            IO.println("Units: "+units);
            System.out.printf ("Bill Amount: $%.2f \n", bill);

            IO.println("Do you want to calculate another bill? (y/n): ");
            yesNo = sc.next().toLowerCase();
        } while(yesNo.equals("y"));
        IO.println("Goodbye! Thanks for using the Electricity Bill Generator.");
    }
}
