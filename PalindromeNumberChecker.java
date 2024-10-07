import java.util.Scanner;

/**
 * PalindromeChecker
 */
public class PalindromeNumberChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to Palindrome Number Checker!\n");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        if (isPalindrome(num)) {
            System.out.println(num + " is a Palindrome Number");
        } else {
            System.out.println(num + " not a Palindrome Number");
        }
    }

    public static boolean isPalindrome(int num) {
        return num == reverse(num); // check input number is equal to reversed number
    }

    public static int reverse(int num) {
        // let newNum for storing reversed number
        int newNum = 0;
        while (num > 0) {
            int digits = num % 10; // example -1214 -> 4, 121 -> 1, 12 -> 2, 1 -> 1
            newNum = newNum * 10 + digits; // 0*10+4= 4, 4*10+1= 41, 41*10+2= 412, 412*10+1= 4121
            num /= 10; // 1214 -> 121, 121 -> 12, 12 -> 1, 1 -> 0
        }
        return newNum;  // return reversed number
    }
}