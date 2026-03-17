package PalindroneCheckerApp;
import java.util.*;

public class UC6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== UC6: Queue + Stack Based Palindrome Checker =====");
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Remove spaces and convert to lowercase
        input = input.replaceAll("\\s+", "").toLowerCase();

        // Create Queue and Stack
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Step 1: Enqueue characters & Push to stack
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);      // Enqueue (FIFO)
            stack.push(ch);     // Push (LIFO)
        }

        // Step 2: Compare dequeue vs pop
        boolean isPalindrome = true;

        while (!queue.isEmpty()) {
            char fromQueue = queue.remove();   // Dequeue
            char fromStack = stack.pop();      // Pop

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Step 3: Display Result
        if (isPalindrome) {
            System.out.println("Result: The given string is a PALINDROME.");
        } else {
            System.out.println("Result: The given string is NOT a palindrome.");
        }

        sc.close();
    }
}

    
