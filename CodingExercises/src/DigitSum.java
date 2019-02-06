public class DigitSum {

    public static void main(String[] args) {
        int number = 357;
        System.out.println("Sum of the digits of the number " + number + " is = " + sumDigits(number));

        number = -357;
        System.out.println("Sum of the digits of the number " + number + " is = " + sumDigits(number));  // -1 invalid

        number = 9;
        System.out.println("Sum of the digits of the number " + number + " is = " + sumDigits(number));   // -1 invalid

        number = 10;
        System.out.println("Sum of the digits of the number " + number + " is = " + sumDigits(number));
    }

    private static int sumDigits (int number) {
        if (number < 10) {
            System.out.println("Invalid value");
            return -1;
        }

        int sum = 0;
        int numFlag = number;

        while(numFlag > 0) {
            sum += numFlag % 10;
            numFlag /= 10;
        }

        return sum;
    }

}
