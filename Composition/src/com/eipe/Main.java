package com.eipe;

public class Main {

    public static void main(String[] args) {
        Bed bed = new Bed("Modern", 4, 3);

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Lamp lamp = new Lamp("Classic", true, 60);

        Bedroom bedroom = new Bedroom("Ipek's", bed, wall1, wall2, wall3, wall4, lamp);

        bedroom.makeBed();
        bedroom.getLamp().turnOn();
    }
}
