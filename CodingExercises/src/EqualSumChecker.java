public class EqualSumChecker {

    public static void main(String[] args) {
        hasEqualSum(1, 1, 1);
        hasEqualSum(1, 1, 2);
    }

    public static boolean hasEqualSum (int var1, int var2, int var3) {
        if((var1 + var2) == var3)
            return true;
        return false;
    }
}