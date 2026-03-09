import java.util.Stack;

class PalindromeChecker {

    public boolean checkPalindrome(String str) {

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        // Compare characters
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        PalindromeChecker pc = new PalindromeChecker();

        String input = "madam";

        boolean result = pc.checkPalindrome(input);

        if (result) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }
    }
}