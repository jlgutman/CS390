package lesson4;

public class Problem3 {
    static void main() {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(102));
        System.out.println(isPalindrome(0));
        System.out.println(isPalindrome(1));
        System.out.println(isPalindrome(11));
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(100));
        System.out.println(isPalindrome(99));
        System.out.println(isPalindrome(10));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;

        return x == palindromeHelper(x, 0);
    }

    private static int palindromeHelper(int x, int result) {
        if (x == 0) return result;
        int mod = x % 10;
        result = result * 10 + mod;

        return palindromeHelper(x / 10, result);
    }
}
