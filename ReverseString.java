// Reverse a string given by user.

import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine();
        // StringBuilder is for mutable strings, otherwise strings are immutable
        String reverse = new StringBuilder(original).reverse().toString();
        System.out.println("Reverse of "+original+" is "+reverse);
        sc.close();
    }
}
