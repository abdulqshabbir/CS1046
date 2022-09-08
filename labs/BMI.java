import java.util.Scanner;
import java.text.DecimalFormat;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double kilogramsPerPound = 0.45359237;
        final double metersPerInch = 0.0254;

        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double heightInInches = input.nextDouble();

        input.close();

        double weightInKilograms = weightInPounds * kilogramsPerPound;
        double heightInMetres = heightInInches * metersPerInch;

        double bodyMassIndex = weightInKilograms / (heightInMetres * heightInMetres);

        DecimalFormat decimalFormat = new DecimalFormat("#.####");

        System.out.println("BMI is " + decimalFormat.format(bodyMassIndex));
    }
}
