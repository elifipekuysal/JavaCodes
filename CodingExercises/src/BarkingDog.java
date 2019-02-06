public class BarkingDog {

    public static void main(String[] args) {
        bark(true, 1);
        bark(false, 2);
        bark(true, 8);
        bark(true, -1);
    }
    public static boolean bark(boolean barking, int hourOfDay) {
        if (barking) {
            if (hourOfDay<0 || hourOfDay>23) {
                return false;
            }
            else if (hourOfDay<8 || hourOfDay>22) {
                return true;
            }
        }
        return false;
    }
}