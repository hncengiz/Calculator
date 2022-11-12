import java.util.Scanner;

public class CalculatorSwitchCase {
    public static void main(String[] args) {

        // Declare integer variables
        int n1, n2, select;

        // Create a new object
        Scanner input = new Scanner(System.in);

        // Prompt the user to input variables
        System.out.print(" Enter first number : ");
        n1 = input.nextInt();
        System.out.print(" Enter second number : ");
        n2 = input.nextInt();

        // Prompt the operations
        System.out.println(" 1 - Addition \n 2 - Subtraction \n 3 - Multiplication \n 4 - Division ");
        System.out.print(" Select : ");
        select = input.nextInt();

        // Check the operations and display result
        switch (select) {
            case 1:
                System.out.println(" Addition : " + (n1 + n2));
                break;
            case 2:
                System.out.println(" Subtraction : " + (n1 - n2));
                break;
            case 3:
                System.out.println(" Multiplication : " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println(" Division : " + (n1 / n2));
                } else {
                    System.out.println(" Any number cannot divide by zero! ");
                }
                break;
            default:
                System.out.println(" Oops wrong choice! Try again. ");
                break;
        }
    }
}

