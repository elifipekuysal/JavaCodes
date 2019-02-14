package com.eipe;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");

        for(int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);

        if(position >= 0) {
            groceryList.set(position, newItem);
            System.out.println("Grocery item " + currentItem + " modified to " + newItem);
        } else {
            System.out.println("Grocery item " + currentItem + " is not in the grocery list, thus cannot be modified.");
        }
    }

    private void modifyGroceryItem(int position, String item) {
        groceryList.set(position, item);
        System.out.println("Grocery item " + (position + 1) + " modified.");
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);

        if(position >= 0) {
            groceryList.remove(position);
            System.out.println("Grocery item " + item + " deleted.");
        } else {
            System.out.println("Grocery item " + item + " is not in the grocery list, thus cannot be deleted.");
        }
    }

    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    public int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);

        if(position >= 0) {
            return true;
        }
        return false;
    }
}
