import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=== Palindrome Checker App (UC7 - Deque Based) ===");

        Scanner scanner = new Scanner(System.in);

        // Step 1: Get input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Step 2: Create Deque
        Deque<Character> deque = new ArrayDeque<>();

        // Step 3: Insert characters
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        // Step 4: Compare front and rear
        boolean isPalindrome = true;

        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Step 5: Display result
        if (isPalindrome) {
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }

        scanner.close();
        System.out.println("Program Ended.");
    }
}
