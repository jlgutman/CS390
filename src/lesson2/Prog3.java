package lesson2;

import java.util.Arrays;

public class Prog3 {
    static void main() {
        String[] animals = {"horse", "dog", "cat", "horse", "dog"};
        String[] uniqueAnimals = new String[animals.length];
        int count = 0;

        for (String a : animals) {
            boolean exists = false;
            for (int i = 0; i < count; i++) {
                if (uniqueAnimals[i].equals(a)) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                uniqueAnimals[count++] = a;
            }
        }

        String[] result = new String[count];
        for (int i = 0; i < count; i++) {
            result[i] = uniqueAnimals[i];
        }

        System.out.println(Arrays.toString(result));
    }
}
