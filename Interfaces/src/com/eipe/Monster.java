package com.eipe;

import java.util.*;

public class Monster implements ISaveable {

    private String name;
    private int healthPoint;
    private int hitPoint;

    public Monster(String name, int healthPoint, int hitPoint) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.hitPoint = hitPoint;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    @Override
    public String toString() {
        return "Monster: " + this.name + " -> " + " HP: " + this.healthPoint + " Hit Point: "  + this.hitPoint;
    }

    @Override
    public List save() {
        List<String> monster = new ArrayList<>();
        monster.add(0, this.name);
        monster.add(1, "" + this.healthPoint);
        monster.add(2, "" + this.hitPoint);

        System.out.println(this.toString() + " is saved.");

        return monster;
    }

    @Override
    public void read(List<String> list) {
        if(list != null && list.size() > 0) {
            this.name = list.get(0);
            this.healthPoint = Integer.parseInt(list.get(1));
            this.hitPoint = Integer.parseInt(list.get(2));
        }
    }
}
