public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays (long minutes) {
        if (minutes >= 0) {
            long years;
            long days;

            days = (minutes / 60) / 24;  // (hours) / 24 = days
            years = days / 365;
            days = days % 365;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
        else {
            System.out.println("Invalid Value");
        }
    }

}
