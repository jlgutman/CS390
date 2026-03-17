package lesson12.prob1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean validNumber = false;
        while (!validNumber) {
            try {
                System.out.print("Enter quantity of items to add (1-50): ");
                int quantity = sc.nextInt();
                if (quantity < 1 || quantity > 50) {
                    throw new IllegalArgumentException("Invalid range, allowed only from 1 to 50");
                }
                System.out.println("Successfully added " + quantity + " items to your cart!");
                validNumber = true;
            } catch (InputMismatchException e) {
                System.out.println("ERROR: Please enter a valid numeric value");
                sc.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}