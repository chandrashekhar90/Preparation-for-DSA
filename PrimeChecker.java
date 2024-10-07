import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n Welcome to Prime Number Checker! \n");
        System.out.print("Please enter a number to check: ");
        int num = input.nextInt();
        if (isPrime(num)) {
            System.out.println(num + " is a Prime number.");
        } else {
            System.out.println(num + " is not a Prime number.");
        }

    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // number less than or equal to 1 are not prime.
        }
        int i = 2;
        while (i <= Math.sqrt(number)) { // Math.sqrt() -> calculate square root of a number.
            if (number % i == 0) {
                return false; // number is not prime.
            }
            i++;
        }
        return true; // number is prime.
    }
}
