public class SecondsAndMinutes {
    public static void main(String[] args) {
        getDurationString(70779);

    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println("You didn't enter enough seconds to calculate!");
            return ("You didn't enter enough seconds to calculate!");
        }
        else {
            int secondsToMinutes = seconds / 60;
            int secondsRemaining = seconds % 60;
            return getDurationString(secondsToMinutes, secondsRemaining);
        }
    }

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || ((seconds < 0) || (seconds > 60))) {
            System.out.println("You entered too many (or not enough)!");
            return ("You entered too many (or not enough)!");
        }
        else {
            int hours = (minutes / 60);
            int minutesCalculated = minutes % 60;
            System.out.println(hours + "h " + minutesCalculated + "m " + seconds + "s");
            return (hours + "h " + minutesCalculated + "m " + seconds + "s");
        }
    }
}
