package com.eipe;

public class Main {

    public static void main(String[] args) {
        Printer printer1 = new Printer(80, "Laser", true);

        printer1.fillUpToner(5);
        System.out.println("Filled up toner, new toner level is : " + printer1.getToner_level());

        printer1.printPage(9);
        System.out.println("New pages printed, total number of printed pages is: " + printer1.getPrintedPage());

        Printer printer2 = new Printer(80, "Laser", false);

        printer2.fillUpToner(5);
        System.out.println("Filled up toner, new toner level is : " + printer2.getToner_level());

        printer2.printPage(9);
        System.out.println("New pages printed, total number of printed pages is: " + printer2.getPrintedPage());
    }
}
