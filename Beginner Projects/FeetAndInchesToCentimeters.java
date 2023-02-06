public class FeetAndInchesToCentimeters {
    public static void main(String[] args) {
        convertToCentimeters(5, 11);

    }

    public static double convertToCentimeters(int heightInInches) {
        return (heightInInches * 2.54);
    }

    public static double convertToCentimeters(int heightInFeet, int heightInInches) {
        double centimeterHeight = convertToCentimeters((heightInFeet * 12) + heightInInches);
        System.out.println(centimeterHeight);
        return centimeterHeight;
    }
}
