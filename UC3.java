package PalindroneCheckerApp;
public class UC3 {

    public static void main(String[] args) {

        // Original String
        String original = "madam";

        // Variable to store reversed string
        String reversed = "";

        // Step 1: Reverse the string using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Step 2: Compare original and reversed using equals()
        if (original.equals(reversed)) {
            System.out.println("Original String: " + original);
            System.out.println("Reversed String: " + reversed);
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Original String: " + original);
            System.out.println("Reversed String: " + reversed);
            System.out.println("Result: It is NOT a Palindrome.");
        }
    }
}
