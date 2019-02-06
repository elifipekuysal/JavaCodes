public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int first;
        int second;

        first = 25; second = 15;
        System.out.println("First number = " + first + ", second number = " + second + ". GCD = " + getGreatestCommonDivisor(first, second));

        first = 12; second = 30;
        System.out.println("First number = " + first + ", second number = " + second + ". GCD = " + getGreatestCommonDivisor(first, second));

        first = 9; second = 18;
        System.out.println("First number = " + first + ", second number = " + second + ". GCD = " + getGreatestCommonDivisor(first, second));

        first = 81; second = 153;
        System.out.println("First number = " + first + ", second number = " + second + ". GCD = " + getGreatestCommonDivisor(first, second));
    }

    private static int getGreatestCommonDivisor (int first, int second) {
        if ((first < 10) || (second < 10)) {
            return -1;
        }

        int max;
        if (first < second) {
            max = first;
        }
        else {
            max = second;
        }


        int gcd = 1;

        for (int i = 1; i <= max; i++) {
            if ((first % i == 0) && (second % i == 0)) {
                gcd = i;
            }
        }

        return gcd;
    }
}
