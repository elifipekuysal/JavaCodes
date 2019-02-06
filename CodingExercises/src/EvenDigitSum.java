public class EvenDigitSum {

    public static void main(String[] args) {
        int number = 123456789;
        System.out.println("Sum of the number " + number + " is = " + getEvenDigitSum(number));

        number = 252;
        System.out.println("Sum of the number " + number + " is = " + getEvenDigitSum(number));

        number = -22;
        System.out.println("Sum of the number " + number + " is = " + getEvenDigitSum(number));
    }

    private static int getEvenDigitSum (int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        int digit;

        while (number > 0) {
            digit = number % 10;

            if (digit % 2 == 0) {
                sum += digit;
            }

            number /= 10;
        }

        return sum;
    }

}
