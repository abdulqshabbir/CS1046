package lab1;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
/// Program computes the average acceleration using the initial velcity, final velocity and time from console input.
*/

public class AverageAcceleration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter v0, v1, and t: ");

        float initialVelocity = input.nextFloat();
        float finalVelocity = input.nextFloat();
        float time = input.nextFloat();

        input.close();

        double acceleration = (finalVelocity - initialVelocity) / time;

        DecimalFormat decimalFormat = new DecimalFormat("#.####");

        System.out.println("The average acceleration is " + decimalFormat.format(acceleration));
    }
}
