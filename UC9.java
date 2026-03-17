package PalindroneCheckerApp;
import java.util.*;

public class UC9 {

    // Recursive function
    public static boolean isPalindrome(String str, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // If characters do not match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== UC9: Recursive Palindrome Checker =====");
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Remove spaces and convert to lowercase
        input = input.replaceAll("\\s+", "").toLowerCase();

        boolean result = isPalindrome(input, 0, input.length() - 1);

        if (result) {
            System.out.println("Result: The given string is a PALINDROME.");
        } else {
            System.out.println("Result: The given string is NOT a palindrome.");
        }

        sc.close();
    }
}
