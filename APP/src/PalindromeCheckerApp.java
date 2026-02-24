import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=== Palindrome Checker App (UC5 - Stack Based) ===");

        Scanner scanner = new Scanner(System.in);

        // Step 1: Get user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Step 2: Create Stack
        Stack<Character> stack = new Stack<>();

        // Step 3: Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Step 4: Pop and compare
        boolean isPalindrome = true;

        for (int i = 0; i < input.length(); i++) {
            char poppedChar = stack.pop();

            if (input.charAt(i) != poppedChar) {
                isPalindrome = false;
                break;
            }
        }

        // Step 5: Print result
        if (isPalindrome) {
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }

        scanner.close();
        System.out.println("Program Ended.");
    }
}

