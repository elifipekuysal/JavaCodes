package com.eipe;

public class Printer {
    private int toner_level;
    private String type;
    private boolean duplex;
    private int printedPage;

    public void fillUpToner(int add) {
        if (0 <= toner_level && toner_level <= 100) {
            if (this.toner_level + add <= 100) {
                this.toner_level = this.toner_level + add;
            }
            else {
                this.toner_level = -1;
            }
        }
    }

    public void printPage(int numPage) {
        if (this.duplex) {
            this.printedPage = this.printedPage + (numPage / 2) + (numPage % 2);
            System.out.println("Printing in duplex mode.");
        }
        else {
            this.printedPage = this.printedPage + numPage;
            System.out.println("Printing in single mode.");
        }
    }

    public Printer(int toner_level, String type, boolean duplex) {
        if (0 <= toner_level && toner_level <= 100) {
            this.toner_level = toner_level;
        }
        else {
            this.toner_level = -1;
        }

        this.type = type;
        this.duplex = duplex;

        this.printedPage = 0;
    }

    public int getToner_level() {
        return toner_level;
    }


    public int getPrintedPage() {
        return printedPage;
    }
}
