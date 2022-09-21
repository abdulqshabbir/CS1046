import java.util.Scanner;

public class PrintMultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\nPlease enter an integer: ");
        int x = input.nextInt();
        input.close();

        System.out.println("\nMultiples for the number " + x + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i * x);
        }
    }
}