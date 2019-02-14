package com.eipe;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice;

        printInstructions();

        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    private static void printInstructions() {
        System.out.println("\n Press:");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the grocery list.");
        System.out.println("\t 2 - To add an item to the grocery list.");
        System.out.println("\t 3 - To modify an item in the grocery list.");
        System.out.println("\t 4 - To remove an item from the grocery list.");
        System.out.println("\t 5 - To search for an item in the grocery list.");
        System.out.println("\t 6 - To quit.");
    }

    private static void addItem() {
        System.out.print("Add new item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    private static void modifyItem() {
        System.out.print("Enter the name of the grocery item: ");
        String item = scanner.nextLine();

        System.out.print("Enter a new name of the grocery item: ");
        String newItem = scanner.nextLine();

        groceryList.modifyGroceryItem(item, newItem);
    }

    private static void removeItem() {
        System.out.print("Enter the item name: ");
        String item = scanner.nextLine();
        scanner.nextLine();
        groceryList.removeGroceryItem(item);
    }

    private static void searchForItem() {
        System.out.print("Enter the name of the item: ");
        String item = scanner.nextLine();

        if(groceryList.onFile(item)) {
            System.out.println("Searched item " + item + " found in the grocery list.");
        } else {
            System.out.println( item + " isn't in the grocery list.");
        }
    }

    private static void processArrayList() {
        ArrayList<String> newArrayList = new ArrayList<>();
        newArrayList.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<>(groceryList.getGroceryList());

        String[] convertToArray = new String[groceryList.getGroceryList().size()];
        convertToArray = groceryList.getGroceryList().toArray(convertToArray);
    }

}
