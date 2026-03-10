import java.util.Scanner;

public class PalindromeCheck { // Added the class declaration

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check: ");
        String userInput = scanner.nextLine();

        // Optional: Clean the string (remove spaces/lowercase) for a better UX
        String cleanedInput = userInput.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (cleanedInput.isEmpty()) {
            System.out.println("Please enter a valid alphanumeric string.");
        } else {
            // Calling the recursive function
            boolean isPalindrome = checkPalindrome(cleanedInput, 0, cleanedInput.length() - 1);
            
            System.out.println("\n--- Result ---");
            System.out.println("Original: " + userInput);
            System.out.println("Is Palindrome: " + isPalindrome);
        }

        scanner.close(); // Fixed from 'sc.close()' to match your variable name
    }

    /**
     * UC9: Recursive Palindrome Checker logic
     */
    public static boolean checkPalindrome(String str, int start, int end) {
        // Base Case: If pointers meet or cross, we've checked everything
        if (start >= end) {
            return true;
        }

        // Comparison Logic: If characters don't match, it's not a palindrome
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive Call: Shrink the problem by moving indices inward
        return checkPalindrome(str, start + 1, end - 1);
    }
}