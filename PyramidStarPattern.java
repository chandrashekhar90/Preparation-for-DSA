import java.util.Scanner;

public class PyramidStarPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to Pyramid Star Pattern!\n");
        System.out.print("Enter rows number: ");
        int rows = input.nextInt();
        pyramidStarPattern(rows);
    }

    public static void pyramidStarPattern(int rows) {
        int i = 1;
        while (i <= rows) {

            // inner loop for print spaces.
            int k = 1;
            while (k <= rows - i) {
                System.out.print(" ");
                k++;
            }

            // another loop for print stars.
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            
            System.out.println();
            i++;
        }
    }
}
