package com.eipe;

public class Car extends Vehicle {

    private int currentGear;
    private int gears;
    private int doors;
    private int wheels;
    private boolean isManual;
    private String color;

    public Car(String name, String size, int gears, int doors, int wheels, boolean isManual, String color) {
        super(name, size);
        this.currentGear = 1;
        this.gears = gears;
        this.doors = doors;
        this.wheels = wheels;
        this.isManual = isManual;
        this.color = color;
    }

    public void changeGear (int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.changeCurrentGear(): Current gear changed to " + this.currentGear + " gear.");
    }

    public void changeVelocity (int speed, int direction) {
        move(speed, direction);
        System.out.println("Velocity = " + speed + ", direction = " + direction)    ;
    }
}
