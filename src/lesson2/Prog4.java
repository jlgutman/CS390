package lesson2;

public class Prog4 {
    static void main() {
        int n = 5;
        int posNeg= 1;
        double sum = 0;
        int j = 1;
        // A: 1 – 1/3 + 1/5 – 1/7 + 1/9 - …..
        IO.println("Problem a--------------------------------------");
        for(int i=1; j<=n; i=i+2){
            double term = (double) posNeg/i;
            sum +=term;
            IO.println("Term "+j+": " + posNeg +"/"+i+"="+ term);
            posNeg = posNeg * -1;
            j++;
        }
        System.out.printf("Sum = %.3f%n", sum);

        IO.println("Problem b--------------------------------------");
        posNeg= 1;
        sum = 0;
        j = 1;
        // B: 1/2 - 2/4 + 3/8 – 4/16 + 5/32 - ...
        for(int i=2; j<=n; i=i*2){
            double term = (double) (posNeg*j)/i;
            sum +=term;
            IO.println("Term "+j+": " + (posNeg*j) +"/"+i+"="+ term);
            posNeg = posNeg * -1;
            j++;
        }
        System.out.printf("Sum = %.3f%n", sum);
    }
}
