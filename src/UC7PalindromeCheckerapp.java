import java.util.*;

public class UC7PalindromeCheckerapp {

    /**
     * Application entry point for UC7.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Define input string
        String input = "refer";

        // Create a Deque (Double Ended Queue)
        Deque<Character> deque = new ArrayDeque<>();

        // Add characters to deque
        for (char c : input.toCharArray()) {
            deque.add(c);
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Compare from both ends
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}