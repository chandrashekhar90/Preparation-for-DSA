import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n Welcome to Leap Year Checker! \n");
        System.out.print("Enter year to check: ");
        int year = input.nextInt();
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0); // in conditions ka result true or false me
                                                                        // hoga, because of boolean data types.
    }
}
