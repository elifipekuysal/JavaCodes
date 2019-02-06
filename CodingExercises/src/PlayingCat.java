public class PlayingCat {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));  // false
        System.out.println(isCatPlaying(false, 36));  // false
        System.out.println(isCatPlaying(false, 35));  // true
    }

    public static boolean isCatPlaying (boolean summer, int temperature) {
        if (summer) {

            if (25 <= temperature && temperature <= 45) {
                return true;
            }

            return false;
        }
        else {

            if (25 <= temperature && temperature <= 35) {
                return true;
            }

            return false;
        }
    }
}
