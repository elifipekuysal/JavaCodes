import java.util.Scanner;

public class MinAndMaxInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Boolean isAnInt;

        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Enter number: ");
            isAnInt = scanner.hasNextInt();

            if (!isAnInt) {
                break;
            }

            int number = scanner.nextInt();

            if (number > maxNum) {
                maxNum = number;
            }

            if (number < minNum) {
                minNum = number;
            }

            scanner.nextLine();
        }
        System.out.println("Min number: " + minNum + ", Max number: " + maxNum);
        scanner.close();

    }
}
