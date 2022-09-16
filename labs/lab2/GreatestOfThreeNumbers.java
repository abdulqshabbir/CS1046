import java.util.Scanner;

// Program computes and displays greatest of three numbers

public class GreatestOfThreeNumbers {
    public static void main(String[] args) {
        int num1, num2, num3;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the values of num1, num2 and num2: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("The largest number is " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The largest number is " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("The largest number is " + num3);
        } else {
            System.out.println("There is no largest number");
        }

        input.close();
    }
}
