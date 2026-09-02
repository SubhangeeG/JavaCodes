// Find if a number given by user is even or odd.
import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        var num = sc.nextInt();
        if(num%2 == 0) System.out.println(num+" is "+"even.");
        else System.out.println(num+" is "+"odd.");
        sc.close();
    }
}

/*
Another way: using bitwise operator

public class EvenOdd {
    public static boolean isEven(int n) {
        // Odd numbers end with 1 and even with 0 as the least significant digit
        return (n & 1) == 0;
    }

    public static void main(String[] args) {
        int num = 7;
        if (isEven(num)) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }
}

Time Complexity: $O(1) constant time.
Space Complexity: $O(1) constant space.
*/
