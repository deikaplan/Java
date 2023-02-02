// converts km/h to mph

public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(10);
    }
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        else {
            long rounded = Math.round(kilometersPerHour / 1.609);
            return rounded;
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour == 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mph");
        }
    }
}
