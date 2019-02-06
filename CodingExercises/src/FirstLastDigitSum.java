public class FirstLastDigitSum {

    public static void main(String[] args) {
        int number = 252;
        System.out.println("Sum of the first and the last digit of number " + number + " is = " + sumFirstAndLastDigit(number));

        number = 257;
        System.out.println("Sum of the first and the last digit of number " + number + " is = " + sumFirstAndLastDigit(number));

        number = 0;
        System.out.println("Sum of the first and the last digit of number " + number + " is = " + sumFirstAndLastDigit(number));

        number = 5;
        System.out.println("Sum of the first and the last digit of number " + number + " is = " + sumFirstAndLastDigit(number));

        number = -10;
        System.out.println("Sum of the first and the last digit of number " + number + " is = " + sumFirstAndLastDigit(number));
    }

    private static int sumFirstAndLastDigit (int number) {
        if (number < 0) {
            return -1;
        }

        int firstDigit = 0;
        int lastDigit = number % 10;

        do {
            number /= 10;
        } while (number / 10 > 0);

        firstDigit = number;

        return (firstDigit + lastDigit);
    }

}
