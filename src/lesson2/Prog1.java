package lesson2;

import java.util.Random;

public class Prog1 {
    static void main() {
        Random rd = new Random();
        int p = rd.nextInt(5000, 25000);
        int n = rd.nextInt(6, 36);
        double apr = rd.nextDouble(3.5, 11.5);
        double r = apr / 12 / 100;
        double emi = (p*r*Math.pow(1+r, n))/(Math.pow(1+r, n)-1);
        double total_payment = (emi * n);
        double total_interest =(total_payment - p);

        IO.println("-----------Quick EMI Quote Calculator-----------");
        System.out.printf ("Principal (P)    : $%,12.2f \n", (double) p);
        System.out.printf ("Tenure (n)       : %-1d months \n", n);
        System.out.printf ("Annual Rate (APR): %-1.1f%% \n", apr);
        System.out.printf ("Monthly Rate (r) : %-1.6f \n", r);
        System.out.printf ("EMI (exact)      : $%,12.2f \n", emi);
        System.out.printf ("EMI (cast to int): $%,12d \n", (int)emi);
        System.out.printf ("EMI (Math.round) : $%,12d \n", Math.round(emi));
        System.out.printf ("Total Payment    : $%,12.2f \n", total_payment);
        System.out.printf ("Total Interest   : $%,12.2f \n", total_interest);
        IO.println("------------jgutierrezmamani------------");
    }
}
