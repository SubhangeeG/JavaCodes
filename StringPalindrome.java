// Check if an input string is palindrome or not.
import java.util.*;

public class StringPalindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine();
        String reverse = new StringBuilder(original).reverse().toString();
        if(original.equals(reverse)) System.out.println(original+" is palindrome.");
        else System.out.println(original+" is not a palindrome.");
        sc.close();
    }
}

// using two pointers approach for space complexity of O(1) instead of O(n) 
/*
import java.util.Scanner;

public class StringPalindrome {
    
    // Helper method: returns true if palindrome, false otherwise
    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            // Case-insensitive comparison
            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false; // Early return on mismatch
            }
            left++;
            right--;
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String original = sc.nextLine();
        
        if (isPalindrome(original)) {
            System.out.println("\"" + original + "\" is a palindrome.");
        } else {
            System.out.println("\"" + original + "\" is not a palindrome.");
        }
        
        sc.close();
    }
}
*/
