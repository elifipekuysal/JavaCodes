package com.eipe;

public class Ferrari extends Car {

    private String turboEngine;

    public Ferrari(String color, String turboEngine) {
        super("Ferrari", "4WD", 6, 2, 4, false, color);
        this.turboEngine = turboEngine;
    }

    public void accelerate (int rate) {
        int newVelocity = getCurrentVelocity() + rate;

        if (newVelocity == 0) {
            stop();
            changeGear(1);
        } else if (0 < newVelocity && newVelocity <= 100) {
            changeGear(1);
        } else if (100 < newVelocity && newVelocity <= 200) {
            changeGear(2);
        } else if (200 < newVelocity && newVelocity <= 300) {
            changeGear(3);
        } else if (300 < newVelocity && newVelocity <= 400) {
            changeGear(4);
        }

        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
