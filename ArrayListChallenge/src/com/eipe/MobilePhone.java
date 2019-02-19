package com.eipe;

import java.util.ArrayList;


public class MobilePhone {

    private ArrayList<Contacts> myContacts;
    private String myNumber;

    public MobilePhone(String myNumber) {
        this.myContacts = new ArrayList<>();
        this.myNumber = myNumber;
    }

    public void printContacts() {
        System.out.println("Contacts: ");
        for(int i = 0; i < myContacts.size(); i++) {
            System.out.println((i+1) + ". Name = " + myContacts.get(i).getName() + " -> Phone Number = " + myContacts.get(i).getPhoneNumber());
        }
    }

    public boolean addContact(Contacts contact) {
        if(findContact(contact.getName()) >= 0) {
            System.out.println("This contact already exists in your contacts list.");
            return false;
        }

        this.myContacts.add(contact);

        return true;
    }

    public boolean modifyContact(Contacts currentContact, Contacts newContact) {
        int position = findContact(currentContact.getName());

        if(position < 0) {
            System.out.println("This contact isn't in your contacts list, thus cannot be updated.");
            return false;
        }else if(findContact(newContact.getName()) != -1){
            System.out.println("Contact " + newContact.getName() + " already exists." +
                    "Update was not successful.");
            return false;
        }

        this.myContacts.set(position, newContact);
        System.out.println(currentContact.getName() + " is replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contacts contact) {
        int position = findContact(contact.getName());
        if(position >= 0) {
            this.myContacts.remove(position);
            return true;
        } else {
            System.out.println("This contact isn't in your contacts list, thus cannot be deleted.");
            return false;
        }
    }

    private int findContact(Contacts contact) { return myContacts.indexOf(contact); }

    private int findContact(String contactName) {
        for(int i = 0; i < myContacts.size(); i++) {
            Contacts contact = myContacts.get(i);
            if(contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contacts contact) {
        if(findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public Contacts queryContact(String contactName) {
        int position = findContact(contactName);

        if(position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }


}
