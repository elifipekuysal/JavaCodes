public class NumberToWords {
    public static void main(String[] args) {
        int number;

        number = 123;
        System.out.print(number + " numberToWords: ");
        numberToWords(number);
        System.out.println("");

        number = 1010;
        System.out.print(number + " numberToWords: ");
        numberToWords(number);
        System.out.println("");

        number = 1000;
        System.out.print(number + " numberToWords: ");
        numberToWords(number);
        System.out.println("");

        number = -12;
        System.out.print(number + " numberToWords: ");
        numberToWords(number);
        System.out.println("");
    }

    private static void numberToWords (int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        }
        else {
            int digitNum = getDigitCount(number);

            number = reverse(number);
            int reverseDigitNum = getDigitCount(number);


            int select;
            while (number > 0) {
                select = number % 10;

                switch (select) {
                    case 0:
                        System.out.print("Zero");
                        break;
                    case 1:
                        System.out.print("One");
                        break;
                    case 2:
                        System.out.print("Two");
                        break;
                    case 3:
                        System.out.print("Three");
                        break;
                    case 4:
                        System.out.print("Four");
                        break;
                    case 5:
                        System.out.print("Five");
                        break;
                    case 6:
                        System.out.print("Six");
                        break;
                    case 7:
                        System.out.print("Seven");
                        break;
                    case 8:
                        System.out.print("Eight");
                        break;
                    case 9:
                        System.out.print("Nine");
                        break;
                }
                System.out.print(" ");

                number /= 10;
            }

            for (int i = 0; i < (digitNum - reverseDigitNum); i++) {
                System.out.print("Zero");
                System.out.print(" ");
            }

        }
    }

    private static int reverse (int number) {
        int reverseNum = 0;

        while (number != 0) {
            reverseNum += number % 10;
            number /= 10;

            if (number != 0) {
                reverseNum *= 10;
            }
        }

        return reverseNum;
    }

    private static int getDigitCount (int number) {
        if (number < 0) {
            return -1;
        }

        int digitNum = 0;
        do {
            number /= 10;
            digitNum++;
        } while (number != 0);

        return digitNum;
    }
}
