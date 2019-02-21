package com.eipe;

import java.util.*;

public class Player implements ISaveable {
    private String name;
    private int healthPoint;
    private int hitPoint;
    private String weapon;

    public Player(String name, int healthPoint, int hitPoint) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.hitPoint = hitPoint;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player: " + this.name + " -> " + " HP: " + this.healthPoint + " HitPoint: "  + this.hitPoint + " Weapon: " + weapon;
    }

    @Override
    public List save() {
        List<String> player = new ArrayList<>();
        player.add(0, this.name);
        player.add(1, "" + this.healthPoint);
        player.add(2, "" + this.hitPoint);
        player.add(3, this.weapon);

        // System.out.println(this.toString() + " is saved.");

        return player;
    }

    @Override
    public void read(List<String> list) {
        if(list != null && list.size() > 0) {
            this.name = list.get(0);
            this.healthPoint = Integer.parseInt(list.get(1));
            this.hitPoint = Integer.parseInt(list.get(2));
            this.weapon = list.get(3);
        }
    }
}
