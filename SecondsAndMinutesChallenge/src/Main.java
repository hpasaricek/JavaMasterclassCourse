public class Main {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";


    public static void main(String[] args) {
        System.out.println(getDurationString(65, 5));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-41));
    }

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || ((seconds < 0) || (seconds > 59))) {
            return INVALID_VALUE_MESSAGE;
        }

        int hour = minutes / 60;
        int remainingMinutes = minutes % 60;

        String hourString = convertTimeToString(hour,"h");
        String minuteString = convertTimeToString(remainingMinutes,"m");
        String secondsString = convertTimeToString(seconds,"s");

        return hourString + " " + minuteString + " " + secondsString;

        /*String hourString = hour + "h";
        if (hour < 10) {
            hourString = "0" + hourString;
        }

        String minutesString = remainingMinutes + "m";
        if (remainingMinutes < 10) {
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "s";
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }
        return hourString + " " + minutesString + " " + secondsString;*/
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }

    public static String convertTimeToString(int time, String suffix) {
        String convertedString = time + suffix;
        if (time < 10) {
            convertedString = "0" + convertedString;
        }

        return convertedString;
    }
}
