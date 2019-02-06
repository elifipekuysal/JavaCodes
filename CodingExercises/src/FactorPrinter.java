public class FactorPrinter {

    public static void main(String[] args) {
        int number;

        number = 6;
        System.out.print("Factors of the number " + number + " is : ");
        printFactors(number);

        number = 32;
        System.out.print("Factors of the number " + number + " is : ");

        printFactors(number);

        number = 10;
        System.out.print("Factors of the number " + number + " is : ");

        printFactors(number);

        number = -1;
        System.out.print("Factors of the number " + number + " is : ");
        printFactors(number);
    }

    private static void printFactors (int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");

    }


}
