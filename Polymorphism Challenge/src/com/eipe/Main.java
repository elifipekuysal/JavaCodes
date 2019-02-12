package com.eipe;


class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public String startEngine () {
        return "Engine started.";
    }

    public String accelerate () {
        return "Car is accelerating.";
    }

    public String brake () {
        return "Pressed to brake.";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}

class Ferrari extends Car {
    public Ferrari() {
        super("Ferrari", 4);
    }

    @Override
    public String startEngine() {
        return "Ferrari's engine started.";
    }

    @Override
    public String accelerate() {
        return "Ferrari is accelerating.";
    }

    @Override
    public String brake() {
        return "Ferrari is stopping.";
    }
}

class Porsche extends Car {
    public Porsche() {
        super("Porsche", 2);
    }

    @Override
    public String startEngine() {
        return "Porsche's engine started.";
    }

    @Override
    public String accelerate() {
        return "Porsche is accelerating.";
    }

    @Override
    public String brake() {
        return "Porsche is stopping.";
    }
}

class Tesla extends Car {
    public Tesla() {
        super("Tesla", 0);
    }
    @Override
    public String startEngine() {
        return "Tesla's engine started.";
    }

    @Override
    public String accelerate() {
        return "Tesla is accelerating.";
    }

    @Override
    public String brake() {
        return "Tesla is stopping.";
    }
}

class None extends Car {
    public None() {
        super("None", 0);
    }
}

public class Main {

    public static void main(String[] args) {
        Car car = randomCar();
        System.out.println(car.getName() + ".startEngine = " + car.startEngine());
        System.out.println(car.getName() + ".accelerate = " + car.accelerate());
        System.out.println(car.getName() + ".brake = " + car.brake());
    }

    private static Car randomCar () {
        int rand = (int) (Math.random() * 4 + 1);

        switch (rand) {
            case 1:
                return (new Ferrari());
            case 2:
                return (new Porsche());
            case 3:
                return (new Tesla());
            case 4:
                return (new None());
            default:
                return null;
        }
    }
}
