public class LargestPrime {

    public static void main(String[] args) {
        int number;

        number = 21;
        System.out.println("Largest prime factor of the number " + number + " is : " + getLargestPrime(number));

        number = 217;
        System.out.println("Largest prime factor of the number " + number + " is : " + getLargestPrime(number));

        number = 0;
        System.out.println("Largest prime factor of the number " + number + " is : " + getLargestPrime(number));

        number = 45;
        System.out.println("Largest prime factor of the number " + number + " is : " + getLargestPrime(number));

        number = -1;
        System.out.println("Largest prime factor of the number " + number + " is : " + getLargestPrime(number));

        number = 1;
        System.out.println("Largest prime factor of the number " + number + " is : " + getLargestPrime(number));
    }

    private static int getLargestPrime (int number) {
        if (number < 0) {
            return -1;
        }

        int maxPrime = -1;
        for (int factor = 2; factor <= number; factor++) {

            if (number % factor == 0) {

                boolean isFactorPrime = true;

                for (int j = 2; j <= factor/2; j++) {

                    if (factor % j == 0) {
                        isFactorPrime = false;
                    }
                }

                if(isFactorPrime) {
                    maxPrime = factor;
                }
            }
        }

        return maxPrime;

    }

}
