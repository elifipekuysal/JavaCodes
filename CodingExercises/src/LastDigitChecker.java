public class LastDigitChecker {

    public static void main(String[] args) {
        int firstNum, secondNum, thirdNum;

        firstNum = 41; secondNum = 22; thirdNum = 71;
        System.out.println("First number = "+ firstNum + ", second number = " + secondNum + ", third number = " + thirdNum + " " + hasSameLastDigit(firstNum, secondNum, thirdNum));

        firstNum = 23; secondNum = 32; thirdNum = 42;
        System.out.println("First number = "+ firstNum + ", second number = " + secondNum + ", third number = " + thirdNum + " " + hasSameLastDigit(firstNum, secondNum, thirdNum));

        firstNum = 9; secondNum = 99; thirdNum = 999;
        System.out.println("First number = "+ firstNum + ", second number = " + secondNum + ", third number = " + thirdNum + " " + hasSameLastDigit(firstNum, secondNum, thirdNum));

        firstNum = 72; secondNum = 234; thirdNum = 613;
        System.out.println("First number = "+ firstNum + ", second number = " + secondNum + ", third number = " + thirdNum + " " + hasSameLastDigit(firstNum, secondNum, thirdNum));
    }

    private static boolean hasSameLastDigit (int firstNum, int secondNum, int thirdNum) {
        if ((firstNum < 10 || firstNum > 1000) || (secondNum < 10 || secondNum > 1000) || (thirdNum < 10 || thirdNum > 1000)) {
            return false;
        }

        int lastDigit1 = firstNum % 10;
        int lastDigit2 = secondNum % 10;
        int lastDigit3 = thirdNum % 10;

        if ((lastDigit1 == lastDigit2) || (lastDigit2 == lastDigit3) || (lastDigit1 == lastDigit3)) {
            return true;
        }

        return false;
    }
}
