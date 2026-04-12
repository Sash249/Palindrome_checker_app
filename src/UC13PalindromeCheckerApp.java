public class UC13PalindromeCheckerApp {

    /**
     * Application entry point for UC13.
     */
    public static void main(String[] args) {

        String input = "madam";

        // Use renamed strategy (to avoid duplicate conflict)
        PalindromeStrategy13 strategy = new StackStrategy13();

        // Start time
        long startTime = System.nanoTime();

        // Execute palindrome check
        boolean result = strategy.check(input);

        // End time
        long endTime = System.nanoTime();

        // Calculate duration
        long duration = endTime - startTime;

        // Display result
        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        // Display performance
        System.out.println("Execution Time: " + duration + " ns");
    }
}

/**
 * INTERFACE - PalindromeStrategy13
 */
interface PalindromeStrategy13 {
    boolean check(String input);
}

/**
 * CLASS - StackStrategy13
 */
class StackStrategy13 implements PalindromeStrategy13 {

    public boolean check(String input) {

        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push characters
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}