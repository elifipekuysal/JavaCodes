package com.eipe;

                //inheriting from Animal
public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {

        // Must be the first statement in each constructor
        super(name, 1, 1, size, weight);  // Call the constructor which is implemented in Animal super class
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    public void chew () {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();  // Animal class
    }

    public void walk () {
        System.out.println("Dog.walk() called");
        super.move(5);  // Call the method which is implemented in extended class Animal
    }

    public void run () {
        System.out.println("Dog.run() called");
        move(20);  // Call the method which is implemented in this class
    }

    public void moveLegs (int speed) {
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        //super.move(speed);
    }
}
