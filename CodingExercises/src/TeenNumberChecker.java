public class TeenNumberChecker {

    public static void main(String[] args) {
        hasTeen(9, 99, 19);
        hasTeen(23, 15, 42);
        hasTeen(22, 23, 34);
    }

    public static boolean hasTeen (int var1, int var2, int var3) {
        if(13<=var1 && var1<=19)
            return true;
        else if(13<=var2 && var2<=19)
            return true;
        else if(13<=var3 && var3<=19)
            return true;
        else
            return false;
    }
}