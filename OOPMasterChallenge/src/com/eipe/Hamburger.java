package com.eipe;

public class Hamburger {
    private String name;

    private String breadRollType;
    private String meat;

    // Additions
    private boolean mushroom;
    private boolean blueCheese;
    private boolean cheddar;
    private boolean pineapple;

    // Price of the selected hamburger
    private double price;

    public Hamburger(String name, String breadRollType, String meat) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = 7.00;
    }

    public double priceTotal () {
        double totalPrice = 0;

        if (!(this.name.equals("DeluxeBurger"))) {
            if (mushroom) {
                System.out.println("Mushroom added: +1.30");
                totalPrice += 1.30;
            }
            if (blueCheese) {
                System.out.println("Blue Cheese added: +3.50");
                totalPrice += 3.50;
            }
            if (cheddar) {
                System.out.println("Cheddar added: +3.00");
                totalPrice += 3.00;
            }
            if (pineapple) {
                System.out.println("Pineapple added: +2.00");
                totalPrice += 2.00;
            }
        }

        totalPrice += this.price;

        return totalPrice;
    }
}
