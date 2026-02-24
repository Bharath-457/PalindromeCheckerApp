import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=== Palindrome Checker App (UC4) ===");

        Scanner scanner = new Scanner(System.in);

        // Step 1: Get input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Step 2: Convert to character array
        char[] characters = input.toCharArray();

        // Step 3: Two-pointer comparison
        int start = 0;
        int end = characters.length - 1;
        boolean isPalindrome = true;

        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Step 4: Display result
        if (isPalindrome) {
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }

        scanner.close();
        System.out.println("Program Ended.");
    }
}
