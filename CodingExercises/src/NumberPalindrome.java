public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    private static boolean isPalindrome (int number) {
        int reverseNum = 0;
        int numFlag = number;

        while (numFlag != 0) {
            reverseNum += numFlag % 10;

            numFlag /= 10;

            if (numFlag == 0) {
                break;
            }

            reverseNum *= 10;
        }

        if (reverseNum == number) {
            return true;
        }

        return false;
    }

}
