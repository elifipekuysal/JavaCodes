public class FlourPacker {

    public static void main(String[] args) {
        int bigCount, smallCount, goal;

        bigCount = 1;  smallCount = 0;  goal = 4;
        System.out.println("bigCount = " + bigCount + ", smallCount = " + smallCount + " can pack goal = " + goal + " kilos : " + canPack(bigCount, smallCount, goal));

        bigCount = 1;  smallCount = 0;  goal = 5;
        System.out.println("bigCount = " + bigCount + ", smallCount = " + smallCount + " can pack goal = " + goal + " kilos : " + canPack(bigCount, smallCount, goal));

        bigCount = 0;  smallCount = 5;  goal = 4;
        System.out.println("bigCount = " + bigCount + ", smallCount = " + smallCount + " can pack goal = " + goal + " kilos : " + canPack(bigCount, smallCount, goal));

        bigCount = 2;  smallCount = 2;  goal = 12;
        System.out.println("bigCount = " + bigCount + ", smallCount = " + smallCount + " can pack goal = " + goal + " kilos : " + canPack(bigCount, smallCount, goal));

        bigCount = -3;  smallCount = 2;  goal = 12;
        System.out.println("bigCount = " + bigCount + ", smallCount = " + smallCount + " can pack goal = " + goal + " kilos : " + canPack(bigCount, smallCount, goal));

        bigCount = 0;  smallCount = 5;  goal = 6;
        System.out.println("bigCount = " + bigCount + ", smallCount = " + smallCount + " can pack goal = " + goal + " kilos : " + canPack(bigCount, smallCount, goal));

        bigCount = 2;  smallCount = 10;  goal = 18;
        System.out.println("bigCount = " + bigCount + ", smallCount = " + smallCount + " can pack goal = " + goal + " kilos : " + canPack(bigCount, smallCount, goal));
    }

                                    // 5 kilos      // 1 kilo
    public static boolean canPack (int bigCount, int smallCount, int goal) {
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }

        while (bigCount != 0) {
            if (goal >= 5) {
                bigCount--;
                goal -= 5;
            }

            if (goal / 5 == 0) {
                break;
            }
        }

        while (smallCount != 0) {
            if (goal >= 1) {
                smallCount--;
                goal -= 1;
            }

            if (goal == 0) {
                break;
            }
        }

        return (goal == 0);
    }
}
