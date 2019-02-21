package com.eipe;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> player = new ArrayList<>();
        List<String> monster = new ArrayList<>();

        ISaveable eipeys = new Player("eipeys", 100, 10);
        saveObject(eipeys);
        System.out.println(eipeys);

        ((Player) eipeys).setWeapon("Long Sword");    // Casting
        ((Player) eipeys).setHitPoint(15);
        System.out.println(eipeys);

        saveObject(eipeys);
        loadObject(eipeys);
        System.out.println(eipeys);

        Monster boss = new Monster("Boss", 500, 20);;
        saveObject(boss);
        System.out.println(boss);

        boss.setHitPoint(30);
        System.out.println(boss);

        saveObject(boss);
        loadObject(boss);
    }

    private static void saveObject(ISaveable object) {
        for(int i = 0; i < object.save().size(); i++) {
            System.out.println("Saving " + object.save().get(i) + " to storage device.");
        }
    }

    private static void loadObject(ISaveable object) {
        ArrayList<String> list = readValues();
        object.read(list);
    }

    public void printList(List list) {
        for(int i = 0; i < list.size(); i++) {
            System.out.println((i+1) + ". " + list.get(i).toString());
        }
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
}
