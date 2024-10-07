import java.util.Scanner;

public class OddEvenChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n Welcome to Odd Even Checker! \n");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        isOddEven(num);
    }

    public static void isOddEven(int number) {
        if (number % 2 == 0) {
            System.out.println("Your number is Even.");
        } else {
            System.out.println("Your number is Odd.");
        }
    }
}