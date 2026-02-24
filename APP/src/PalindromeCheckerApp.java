import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=== Palindrome Checker App (UC3) ===");

        Scanner scanner = new Scanner(System.in);

        // Step 1: Get input from user
        System.out.print("Enter a string: ");
        String original = scanner.nextLine();

        // Step 2: Reverse the string using loop
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        // Step 3: Compare original and reversed
        if (original.equals(reversed)) {
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }

        scanner.close();
        System.out.println("Program Ended.");
    }
}
