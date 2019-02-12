package com.eipe;

public class HealthyBurger extends Hamburger {
    private boolean broccoli;
    private boolean olive;

    public HealthyBurger(String meat, double price) {
        super("HealthyBurger", "Brown Rye", meat);
    }

    public double priceTotal () {

        double totalPrice = this.priceTotal();

        if (broccoli) {
            System.out.println("Broccoli added: +1.00");
            totalPrice += 1.00;
        }
        if (olive) {
            System.out.println("Olive added: +0.50");
            totalPrice += 0.50;
        }

        return totalPrice;
    }
}
