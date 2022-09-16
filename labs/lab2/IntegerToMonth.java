import java.util.Scanner;

// Program computes and displays the Month name from its integer representation

public class IntegerToMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int monthInteger = -1;

        while (!(monthInteger >= 1 && monthInteger <= 12)) {
            System.out.print("Enter an integer between 1 and 12: ");
            monthInteger = input.nextInt();
            if (monthInteger < 1 || monthInteger > 12) {
                System.out.println("Sorry the number you entered is not an integer between 1 and 12.");
                System.out.println("Please try again.");
            }
        }

        input.close();

        switch (monthInteger) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("Februrary");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }
    }
}
