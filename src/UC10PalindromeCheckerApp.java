public class UC10PalindromeCheckerApp {

    /**
     * Application entry point for UC10.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Original input
        String input = "A man a plan a canal Panama";

        // Normalize string: remove non-alphanumeric + convert to lowercase
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Compare characters from both ends
        for (int i = 0; i < normalized.length() / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
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