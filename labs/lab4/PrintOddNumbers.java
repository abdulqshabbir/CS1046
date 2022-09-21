import java.util.Scanner;

public class PrintOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        input.close();

        if (n < 1) {
            System.out.println("Sorry you must enter a positive integer.");
            return;
        }

        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            System.out.println(i);
            sum += i;
        }

        System.out.println("Sum is: " + sum);
    }
}
