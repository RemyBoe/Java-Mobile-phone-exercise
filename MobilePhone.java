package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class MobilePhone {

    ArrayList<String> contacts = new ArrayList<String>();


    public void addContact(int number, String name) {
        if(contactCheck(name)) {
            Contacts contact = new Contacts(number, name);
            contacts.add("Name: " + contact.getName() + "\n" + "Phonenumber: " + contact.getPhonenumber());
            System.out.println("(ADDED) \nName: " + contact.getName() + "\n" + "Phonenumber: " + contact.getPhonenumber());
        } else {
            System.out.println("Contact name containg: " + name + " already exists");
        }
    }

    public boolean contactCheck(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).contains(name)) {
            return false;
            }
        }
        return true;
    }


    public void printContacts() {
        System.out.println("Your total number of contacts are: " + contacts.size() + "\n");
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println("#" + (i + 1) + "\n" + contacts.get(i) + "\n");
        }
    }

    public void modifycontactPosition(int position, int newnumber, String newname) {
        if(contactCheck(newname)){
        String temp = contacts.get(position - 1);
        Contacts contact = new Contacts(newnumber, newname);
        contacts.set(position - 1, "Name: " + contact.getName() + "\n" + "Phonenumber: " + contact.getPhonenumber());
        System.out.println("(old) \n" + temp + "\n\n(Changed to:) \n" + "Name: " + contact.getName() + "\n" + "Phonenumber: " + contact.getPhonenumber());
        } else {
            System.out.println("Contact name containing: " + newname + " already exists");
        }

    }

    public void modifycontactName(String item, int newnumber, String newname) {
        if(contactCheck(newname)){
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).contains(item)) {
                String old = contacts.get(i);
                Contacts contact = new Contacts(newnumber, newname);
                contacts.set(i, "Name: " + contact.getName() + "\n" + "Phonenumber: " + contact.getPhonenumber());
                System.out.println("(old) \n" + old + "\n\n(Changed to:) \n" + "Name: " + contact.getName() + "\n" + "Phonenumber: " + contact.getPhonenumber());
                }
            }
        }
        else {
            System.out.println("Contact name containg: " + newname + " already exists");
        }
    }

    public void removeContact(String item) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).contains(item)) {
                System.out.println(contacts.get(i) + " \nhas been deleted");
                contacts.remove(i);
                System.out.println("Remaining number of contacts are: " + contacts.size());
            }
        }
//        System.out.println("No contact containing: " + item + "found ");
    }

    public void SearchContacts(String item) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).contains(item)) {
                System.out.println(contacts.get(i));
            } else {
                System.out.println("Not found");
            }

        }
    }
}