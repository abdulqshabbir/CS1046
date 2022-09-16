import java.util.Scanner;

// Program computes and displays the greater of two numbers

public class GreaterNumber {
    public static void main(String[] args) {
        int num1, num2;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the values of num1 and num2:");
        num1 = input.nextInt();
        num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println("The larger number is " + num1);
        } else if (num2 > num1) {
            System.out.println("The larger number is " + num2);
        } else {
            System.out.println("There is no greater number.");
        }

        input.close();
    }
}
