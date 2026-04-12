public class UC12PalindromeCheckerApp {

    /**
     * Application entry point for UC12.
     */
    public static void main(String[] args) {

        String input = "madam";

        // Inject strategy at runtime
        PalindromeStrategy strategy = new StackStrategy();

        // Execute selected strategy
        boolean result = strategy.check(input);

        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}

/**
 * INTERFACE - PalindromeStrategy
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * CLASS - StackStrategy
 */
class StackStrategy implements PalindromeStrategy {

    /**
     * Implements palindrome check using Stack
     */
    public boolean check(String input) {

        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push all characters
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare with popped elements
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}