import java.text.DecimalFormat;
import java.util.Scanner;

public class AverageAcceleration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter v0, v1, and t: ");

        float initialVelocityInMetresPerSecond = input.nextFloat();
        float finalVelocityInMetresPerSecond = input.nextFloat();
        float timeInSeconds = input.nextFloat();

        input.close();

        double averageAcceleration = (finalVelocityInMetresPerSecond - initialVelocityInMetresPerSecond)
                / timeInSeconds;

        DecimalFormat decimalFormat = new DecimalFormat("#.####");

        System.out.println("The average acceleration is " + decimalFormat.format(averageAcceleration));
    }
}
