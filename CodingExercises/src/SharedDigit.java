public class SharedDigit {

    public static void main(String[] args) {
        int fistNum;
        int secondNum;

        fistNum = 12; secondNum =23;
        System.out.println("First number = " + fistNum + ", second number = " + secondNum + " : " + hasSharedDigit(fistNum, secondNum));

        fistNum = 9; secondNum =99;
        System.out.println("First number = " + fistNum + ", second number = " + secondNum + " : " + hasSharedDigit(fistNum, secondNum));

        fistNum = 15; secondNum =55;
        System.out.println("First number = " + fistNum + ", second number = " + secondNum + " : " + hasSharedDigit(fistNum, secondNum));

        fistNum = 17; secondNum =28;
        System.out.println("First number = " + fistNum + ", second number = " + secondNum + " : " + hasSharedDigit(fistNum, secondNum));
    }

    private static boolean hasSharedDigit (int firstNum, int secondNum) {
        if ((firstNum < 10 || firstNum > 99) || (secondNum < 10 || secondNum > 99)) {
            System.out.println("Numbers should be greater than 10 and less than 99!");
            return false;
        }

        int digit1;
        int digit2;
        int tempSecondNum;

        for (int i = 0; i < 2; i++) {
            digit1 = firstNum % 10;
            tempSecondNum = secondNum;

            for (int j = 0; j < 2; j++) {
                digit2 = tempSecondNum % 10;

                if (digit1 == digit2) {
                    return true;
                }

                tempSecondNum /= 10;
            }

            firstNum /= 10;
        }

        return false;
    }

}
