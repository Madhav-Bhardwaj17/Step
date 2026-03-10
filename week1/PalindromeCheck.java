import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a phrase (e.g., 'A man, a plan, a canal: Panama'): ");
        String userInput = scanner.nextLine();

        // UC10 Logic: Normalization
        // 1. Convert to lowercase
        // 2. Replace all non-alphanumeric characters with an empty string
        String cleanedInput = userInput.toLowerCase().replaceAll("[^a-z0-9]", "");

        if (cleanedInput.isEmpty()) {
            System.out.println("No valid characters found to check.");
        } else {
            boolean result = isPalindrome(cleanedInput, 0, cleanedInput.length() - 1);
            
            System.out.println("\n--- Normalization Details ---");
            System.out.println("Cleaned version: " + cleanedInput);
            System.out.println("Is Palindrome: " + result);
        }

        scanner.close();
    }

    // Recursive logic from UC9
    public static boolean isPalindrome(String str, int low, int high) {
        if (low >= high) return true;
        if (str.charAt(low) != str.charAt(high)) return false;
        return isPalindrome(str, low + 1, high - 1);
    }
}