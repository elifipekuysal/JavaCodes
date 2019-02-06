public class Sum3and5 {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i + " can be divided with both 3 and 5.");
                sum += i;
                count++;
            }

            if (count == 5) {
                System.out.println("Found 5 numbers which can be divided with both 3 and 5.");
                break;
            }
        }

        System.out.println("Sum of these 5 numbers is: " + sum);
    }

}
