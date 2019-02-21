package com.eipe;

public class Bedroom {
    private String name;
    private Bed bed;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Lamp lamp;

    public Bedroom(String name, Bed bed, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Lamp lamp) {
        this.name = name;
        this.bed = bed;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.lamp = lamp;
    }

    public void makeBed () {
        System.out.println("Bedroom -> Making bed");
        bed.make();
    }

    public String getName() {
        return name;
    }

    public Bed getBed() {
        return bed;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Lamp getLamp() {
        return lamp;
    }
}
