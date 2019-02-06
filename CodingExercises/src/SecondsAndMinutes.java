public class SecondsAndMinutes {

    public static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));  // 01h 05m 45s
        System.out.println(getDurationString(3945));  // 01h 05m 45s
        System.out.println(getDurationString(-99));  // Invalid value
    }

    public static String getDurationString (int minutes, int seconds) {

        if (minutes >= 0 && 0 <= seconds && seconds <= 59) {
            int hours = minutes / 60;
            minutes = minutes % 60;

            String hoursString = hours + "h";
            if(hours < 10) {
                hoursString = "0" + hoursString;
            }

            String minutesString = minutes + "m";
            if(minutes < 10) {
                minutesString = "0" + minutesString;
            }

            String secondsString = seconds + "s";
            if(seconds < 10) {
                secondsString = "0" + secondsString;
            }

            return (hoursString + " " + minutesString + " " + secondsString);
        }

        return INVALID_VALUE_MESSAGE;
    }

    public static String getDurationString (int seconds) {

        if (seconds >= 0) {
            int minutes = seconds / 60;
            seconds = seconds % 60;

            return getDurationString(minutes, seconds);
        }

        return INVALID_VALUE_MESSAGE;
    }

}
