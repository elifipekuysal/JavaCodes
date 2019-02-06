public class PerfectNumber {

    public static void main(String[] args) {
        int number;

        number = 6;
        System.out.println(number + " is a perfect number? : " + isPerfectNumber(number));

        number = 28;
        System.out.println(number + " is a perfect number? : " + isPerfectNumber(number));

        number = 5;
        System.out.println(number + " is a perfect number? : " + isPerfectNumber(number));

        number = -1;
        System.out.println(number + " is a perfect number? : " + isPerfectNumber(number));
    }

    private static boolean isPerfectNumber (int number) {
        if (number < 1) {
            return false;
        }

        int sum = 0;
        for (int i = 1; i <= (number / 2); i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        /*
        if (sum == number) {
            return true;
        }
        return false;
        */

        return (sum == number);
    }
}
