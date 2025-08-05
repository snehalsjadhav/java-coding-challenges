/**
 * A class that provides functionality to check if a string is a palindrome.
 */
public class PalindromeChecker {
    
    /**
     * Checks if a string is a palindrome (reads the same forward and backward).
     * Case-insensitive and ignores non-alphanumeric characters.
     * 
     * @param str The string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        
        // Remove non-alphanumeric characters and convert to lowercase
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        if (cleanStr.isEmpty()) {
            return true; // Empty string is considered a palindrome
        }
        
        int left = 0;
        int right = cleanStr.length() - 1;
        
        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
    
    /**
     * Demonstrates the palindrome checking functionality.
     */
    public static void main(String[] args) {
        String[] testStrings = {
            "racecar",
            "A man, a plan, a canal: Panama",
            "hello",
            "Madam, I'm Adam",
            "12321",
            "Not a palindrome"
        };
        
        System.out.println("Palindrome Check Results:");
        for (String str : testStrings) {
            boolean result = isPalindrome(str);
            System.out.printf("\"%s\" is %sa palindrome%n", 
                              str, 
                              result ? "" : "not ");
        }
    }
}