import java.util.Scanner;

/**
 * ArmstrongChecker
 */
public class ArmstrongChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to Armstrong Number Checker!\n");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if (isArmstrong) {
            System.out.println(num + " is Armstrong Number");
        } else {
            System.out.println(num + " is not Armstrong Number");
        }
    }

    public static boolean isArmstrong(int num) {
        int noOfDigits = noOfDigits(num);
        int numCopy = num;
        
        int finalNumber = 0;
        while (num > 0) {
            int lastDigit = num % 10; // digit me last value save ho jayegi devide hoke mtlb rem.
            num /= 10; // or vo last number hat ta jayega
            finalNumber += power(lastDigit, noOfDigits); // exp -> 153 -> 3 -> 3^3 = 9 <- finalNumber
        }
       
        return finalNumber == numCopy;
    }

    // power function
    public static int power(int num1, int num2) {
        int result = 1;
        int i = 0;
        while (i < num2) {
            result *= num1;
            i++;
        }
       
        return result;
    }

    // method for count and return total no of digits in a given integer num.
    public static int noOfDigits(int num) {
        int digits = 0; // initially digits 0 maan li
        while (num > 0) { // jab tak num 0 se bda hai mtlb ki humara no 0 nhi ho jata
            digits++; // digits badh gya ya nhi pta chal gya ki 1 no to hai ese he ek ek badhta rahega
                      // to pta chalta jayega ki kitni digits hain.
            num /= 10; // Remove the last digit from the number -> / return only int value not decimal
                       // value so last wali digit hat ti jayegi
        }
        return digits; // Return the total number of digits
    }
}