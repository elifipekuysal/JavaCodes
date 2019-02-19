package com.eipe;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobile = new MobilePhone("0384 837 84 93");


    public static void main(String[] args) {
        int choice;
        boolean shutdown = false;


        startPhone();
        optionsMenu();

        while(!shutdown) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    optionsMenu();
                    break;
                case 1:
                    mobile.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    System.out.println("Shutting down...");
                    shutdown = true;
                    break;
            }
        }
    }

    private static void addNewContact() {
        System.out.print("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter a phone number: ");
        String phoneNum = scanner.nextLine();

        Contacts contact = Contacts.createNewContact(name, phoneNum);
        if( mobile.addContact(contact) ) {
            System.out.println("New contact is added: " + name + " -> " + phoneNum);
        } else {
            System.out.println("Cannot add new contact: " + name);
        }
    }

    private static void updateContact() {
        System.out.print("Enter the name of the contact to update: ");
        String name = scanner.nextLine();

        Contacts currentContact = mobile.queryContact(name);

        if(currentContact == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.print("Enter a new name of the contact to update: ");
        String newName = scanner.nextLine();
        System.out.print("Enter a new number for the contact: ");
        String newNum = scanner.nextLine();

        Contacts updatingContact = Contacts.createNewContact(newName, newNum);
        if(mobile.modifyContact(currentContact, updatingContact)) {
            System.out.println("Contact updated!");
        } else {
            System.out.println("Error: Contact couldn't updated.");
        }
    }

    private static void removeContact() {
        System.out.print("Enter the name of the contact to remove: ");
        String name = scanner.nextLine();

        Contacts currentContact = mobile.queryContact(name);

        if(currentContact == null) {
            System.out.println("Contact not found.");
            return;
        }

        if(mobile.removeContact(currentContact)) {
            System.out.println("Contact successfully removed!");
        } else {
            System.out.println("Error: Contact couldn't removed.");
        }
    }

    private static void queryContact() {
        System.out.print("Enter the name of the contact to find: ");
        String name = scanner.nextLine();

        Contacts currentContact = mobile.queryContact(name);

        if(currentContact == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Name = " + currentContact.getName() + " Phone Number = " + currentContact.getPhoneNumber());
    }

    private static void startPhone() {
        System.out.println("Starting the phone...");
    }

    private static void optionsMenu() {
        System.out.println("\n Press:");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add a new contact.");
        System.out.println("\t 3 - To update an existing contact.");
        System.out.println("\t 4 - To remove a contact from the list.");
        System.out.println("\t 5 - To search a contact.");
        System.out.println("\t 6 - To shutdown.");
    }



}
