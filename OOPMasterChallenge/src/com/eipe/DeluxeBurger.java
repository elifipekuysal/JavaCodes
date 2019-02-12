package com.eipe;

public class DeluxeBurger extends Hamburger {
    private boolean chips;
    private boolean drinks;

    public DeluxeBurger(String breadRollType, String meat, boolean chips, boolean drinks) {
        super("DeluxeBurger", breadRollType, meat);
        this.chips = chips;
        this.drinks = drinks;
    }

    public double priceTotal () {

        double totalPrice = this.priceTotal();

        if (chips) {
            System.out.println("Chips added: +3.00");
            totalPrice += 1.00;
        }
        if (drinks) {
            System.out.println("Drink added: +2.00");
            totalPrice += 3.00;
        }

        return totalPrice;
    }
}
