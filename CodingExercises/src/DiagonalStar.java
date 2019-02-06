public class DiagonalStar {

    public static void main(String[] args) {
        int number;

        number = 5;
        System.out.println("Square star of the number " + number + " is : ");
        printSquareStar(number);

        System.out.println();

        number = 8;
        System.out.println("Square star of the number " + number + " is : ");
        printSquareStar(number);

        System.out.println();

        number = 2;
        System.out.println("Square star of the number " + number + " is : ");
        printSquareStar(number);
    }

    private static void printSquareStar (int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        }
        else {
            for (int i = 1; i <= number; i++) {

                for (int j = 1; j <= number; j++) {

                    if (i == 1 || i == number || j == 1 || j == number || i == j || j == (number - i + 1)) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }
        }
    }
}
