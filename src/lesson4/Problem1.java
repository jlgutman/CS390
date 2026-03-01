package lesson4;

public class Problem1 {
    static void main() {
        System.out.println(findMinimumCharacter("akel"));
        System.out.println(findMinimumCharacter("keal"));
        System.out.println(findMinimumCharacter("jose"));
        System.out.println(findMinimumCharacter("luis"));
        System.out.println(findMinimumCharacter("zebra"));
        System.out.println(findMinimumCharacter("hello"));
        System.out.println(findMinimumCharacter("z"));
        System.out.println(findMinimumCharacter(null));
    }

    public static String findMinimumCharacter(String str){
        if (str == null || str.isEmpty()){
            return null;
        }
        if (str.length() == 1) return str;

        String prev = str.substring(0, 1);
        String next = findMinimumCharacter(str.substring(1));
        return prev.compareTo(next) <= 0 ? prev : next;
    }
}
