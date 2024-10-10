import java.util.*;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Factorial Calculator!\n");

        System.out.print("Please enter your number: ");
        int num = input.nextInt();

        long fact = factorial(num);
        System.out.println("Factorial is: " + fact);

    }

    public static long factorial(int num) {
        if (num < 2) {
            return 1; // Factorial of 0 and 1 is defined as 1, so if num is 0 or 1, the method
                      // directly returns 1
        }
        long fact = 1;
        int i = 2;
        while (i <= num) {
            fact *= i; // fact = 1 * 2 = 2 , let num = 5 -> 120
            i++;
        }
        return fact;
    }
}