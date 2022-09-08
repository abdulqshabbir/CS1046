package practice;

/*
Convert distanceInMiles and h, m, s to speedInKilometersPerHour
*/
public class CalculateSpeed {
    public static void main(String[] args) {
        int distanceInMiles = 24;
        int h = 1;
        int m = 40;
        int s = 35;
        final float KILOMETERS_PER_MILE = 1.6f;
        float distanceInKilometers = distanceInMiles * KILOMETERS_PER_MILE;
        float numberOfHours = h + m / 60f + s / (60 * 60f);

        System.out.println(distanceInKilometers / numberOfHours);
    }
}
