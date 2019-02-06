public class MegaBytesConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2050);
        printMegaBytesAndKiloBytes(-1);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes >= 0) {
            int MB = kiloBytes / 1024;
            int remainingKB = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + MB + " MB and " + remainingKB + " KB");
        } else {
            System.out.println("Invalid Value");

        }
    }
}
