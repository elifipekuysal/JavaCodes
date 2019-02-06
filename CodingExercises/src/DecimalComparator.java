public class DecimalComparator{

    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(3.175, 3.176);
        areEqualByThreeDecimalPlaces(3.0, 3.0);
        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
    }

    public static boolean areEqualByThreeDecimalPlaces (double doubleVal1, double doubleVal2) {
        if((int) (doubleVal1 * 1000) == (int) (doubleVal2 * 1000)) {
            return true;
        }
        return false;
    }
}