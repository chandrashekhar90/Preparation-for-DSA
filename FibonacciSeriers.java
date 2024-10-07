import java.util.Scanner;

public class FibonacciSeriers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nWelcome to Fibonacci Series!\n");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        System.out.println("Fibonacci series up to " + num + ":");
        fibonacciSeries(num);
    }

    // It follows the Fibonacci pattern, where each number is the sum of the
    // previous two.
    public static void fibonacciSeries(int num) {
        if (num < 0) {
            System.out.println("Fibonacci series is not defined for negative numbers.");
            return;
        }
        if (num == 0) {
            System.out.println("0");
            return;
        }
        int first = 0, second = 1;
        System.out.print(first + " " + second + " ");
        while (first + second <= num) {
            int third = first + second; // third = 0 + 1 , third = 1 + 1 = 2 , third = 1 + 2 , third = 2 + 3
            System.out.print(third + " "); // 1 , 2 , 3, 5
            first = second;
            second = third;
        }
    }
}