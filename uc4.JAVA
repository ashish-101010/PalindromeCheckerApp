package PalindroneCheckerApp;
public class UC4 {
    public static void main(String[] args) {
  
        String word = "madam";
       
        char[] charArray = word.toCharArray();
       
        int start = 0;
        int end = charArray.length - 1;
        boolean isPalindrome = true;
        while (start < end) {
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println("Input String: " + word);
        if (isPalindrome) {
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }
    }
}
