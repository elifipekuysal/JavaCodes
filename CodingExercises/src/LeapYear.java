public class LeapYear {

    public static void main(String[] args) {
        isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(2019);
        isLeapYear(2000);
    }

    public static boolean isLeapYear(int year) {
        if (year>=1 && year<=9999) {
            if(year%4==0 && year%100!=0) {
                return true;
            }
            else if(year%400==0) {
                return true;
            }
        }
        return false;
    }
}