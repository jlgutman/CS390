package lesson4;

public class Problem4 {
    static void main() {
        System.out.println(findMaxValue(new int[]{5, -3, 6, 1, 9, 4}));
        System.out.println(findMaxValue(new int[]{7}));
        System.out.println(findMaxValue(new int[]{0}));
        System.out.println(findMaxValue(new int[]{}));
        System.out.println(findMaxValue(new int[]{-10, -3, -7, -1}));
        System.out.println(findMaxValue(new int[]{1, 2, 3, 4, 5}));
        System.out.println(findMaxValue(new int[]{5, 4, 3, 2, 1}));
    }

    public static int findMaxValue(int[] values) {
        if (values == null || values.length == 0) {
            return 0;
        }
        return findMaxValueHelper(values, 0);
    }

    private static int findMaxValueHelper(int[] values, int index) {
        if (index == values.length - 1) return values[index];

        int next = findMaxValueHelper(values, index + 1);

        return values[index] > next ? values[index] : next;
    }


}
