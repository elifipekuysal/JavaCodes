import java.util.Scanner;

public class SumOfTheNumberInputs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Boolean hasNextInt;
        int count = 1;
        int sum = 0;

        while (count <= 10) {
            System.out.print("Enter number #" + count + ": ");
            hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();  // Handle end of line (enter key)
        }
        scanner.close();

        System.out.println("Sum of the number inputs is: " + sum);
    }
}
