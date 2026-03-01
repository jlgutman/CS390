package lesson4;

import java.util.Arrays;

public class Problem2 {
    static void main() {
        System.out.println(Arrays.toString(reverse(new int[]{1, 3, 5, 7, 9, 13})));
        System.out.println(Arrays.toString(reverse(new int[]{42, 7, 19, 3, 88, 55, 1})));
        System.out.println(Arrays.toString(reverse(new int[]{99})));
        System.out.println(Arrays.toString(reverse(new int[]{10, 20})));
        System.out.println(Arrays.toString(reverse(new int[]{})));
        System.out.println(Arrays.toString(reverse(null)));
    }

    public static int[] reverse(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }
        return reverseHelper(arr, 0, arr.length - 1);
    }

    private static int[] reverseHelper(int[] arr, int left, int right) {
        if (left > right) return arr;
        int leftTemp = arr[left];
        arr[left] = arr[right];
        arr[right] = leftTemp;
        return reverseHelper(arr, left + 1, right - 1);
    }
}
