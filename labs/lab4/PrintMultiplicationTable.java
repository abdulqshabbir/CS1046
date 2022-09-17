import java.util.Scanner;

public class PrintMultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        int x = input.nextInt();
        input.close();

        System.out.println("\nMultiplication Table: \n");

        for (int i = 1; i <= 12; i++) {
            System.out.printf("%5s", i);
        }

        System.out.println("");
        for (int i = 1; i <= 12; i++) {
            System.out.printf("%5d", i * x);
        }

        System.out.println("");
    }
}