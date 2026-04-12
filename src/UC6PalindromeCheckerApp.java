import java.util.*;

public class UC6PalindromeCheckerApp {

    /**
     * Application entry point for UC6.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Define the input string
        String input = "civic";

        // Create Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Create Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // Insert characters into both queue and stack
        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Compare until queue is empty
        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
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