package lesson2;

public class Prog5 {
    static void main() {
        secondMin(new int[]{2, 21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22});
        secondMin(new int[]{-3, -10, 7, 2, -10, -3, -2});
        secondMin(new int[]{100, 1});
    }

    public static void secondMin(int[] arrayOfInts){
        int min       = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < arrayOfInts.length; i++) {
            int current = arrayOfInts[i];

            if (current < min) {
                secondMin = min;
                min = current;
            } else if (current < secondMin && current != min) {
                secondMin = current;
            }
        }
        IO.println("Second Minimum is: " + secondMin);
    }
}
