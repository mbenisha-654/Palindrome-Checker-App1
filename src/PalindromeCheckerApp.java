import java.util.*;
public class PalindromeCheckerApp {

    // Stack method
    public static boolean stackPalindrome(String str) {

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // Reverse string method
    public static boolean reversePalindrome(String str) {

        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static void main(String[] args) {

        String input = "racecar";

        // Stack timing
        long start1 = System.nanoTime();
        boolean result1 = stackPalindrome(input);
        long end1 = System.nanoTime();

        // Reverse timing
        long start2 = System.nanoTime();
        boolean result2 = reversePalindrome(input);
        long end2 = System.nanoTime();

        System.out.println("Input String: " + input);
        System.out.println("Stack Method Result: " + result1);
        System.out.println("Stack Execution Time: " + (end1 - start1) + " ns");

        System.out.println("Reverse Method Result: " + result2);
        System.out.println("Reverse Execution Time: " + (end2 - start2) + " ns");
    }
}