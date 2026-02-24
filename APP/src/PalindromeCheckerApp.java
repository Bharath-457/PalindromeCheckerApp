public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=== Palindrome Checker App ===");

        // Step 1: Hardcoded string
        String text = "madam";

        // Step 2: Reverse the string
        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        // Step 3: Check palindrome
        if (text.equals(reversed)) {
            System.out.println(text + " is a Palindrome.");
        } else {
            System.out.println(text + " is NOT a Palindrome.");
        }

        System.out.println("Program Ended.");
    }
}
