public class PrimeNumber {

    public static void main(String[] args) {

        int countPrime = 0;

        for (int i = 1; i < 99 ; i++) {
            if (isPrime(i)) {
                countPrime++;
                System.out.println(i + " is a prime number.");
            }

            if (countPrime == 10) {
                System.out.println("");
                System.out.println(countPrime + " prime numbers found!");
                break;
            }
        }

    }

    public static boolean isPrime (int n) {

        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
