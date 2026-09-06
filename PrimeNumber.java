// Check if a given number is prime or not
import java.util.*;

public class PrimeNumber {

    public static boolean checkPrime(int num) {
        if (num<=1) return false;
        else if (num == 2) return true;
        else if (num%2 == 0) return false;
        else {
            for (int i = 3; i <= num/2; i+=2) {
                if (num % i == 0) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (checkPrime(num))
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
        sc.close();
    }
}

// Better time complexity 
/*
import java.util.Scanner;

public class PrimeNumber {

    public static boolean checkPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        // Check odd numbers up to sqrt(num)
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (checkPrime(num))
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");

        sc.close();
    }
}
*/
