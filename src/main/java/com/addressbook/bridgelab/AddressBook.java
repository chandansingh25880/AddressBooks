package com.addressbook.bridgelab;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/* @Description - To create a contacts in address book with first name, last name, address, city, state,
 * zip,mobile number.*/
public class AddressBook {
    AddressBook addressbook = new AddressBook();
        addressbook.addContact();
    int choice = 1;
        do {
        System.out.println("Enter your choice\n1. Add Contact\n2. Edit Contact\n3. Delete Contact\n3. Exit");
        int userInput = sc.nextInt();
        switch (userInput) {
            case 1:
                addressbook.addContact();
                break;
            case 2:
                addressbook.editContact();
                break;
            case 3 :
                addressbook.deleteContact();
                break;
            default:
                System.out.println("You press exit.\nThank You!");
                choice = 0;
                break;
        }
    }


    /* @Description- Add new contacts in address book  */
    private void addContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first name");
        String firstName = scanner.nextLine();
        System.out.println("enter the last name");
        String lastName = scanner.nextLine();
        System.out.println("enter the address");
        String address = scanner.nextLine();
        System.out.println("enter the state");
        String state = scanner.nextLine();
        System.out.println("enter the city");
        String city = scanner.nextLine();
        System.out.println("enter the zip code");
        int zipCode = scanner.nextInt();
        System.out.println("enter the mobile number");
        long number = scanner.nextLong();
        System.out.println("enter email-id");
        String email = scanner.next();
        Contact contact = new Contact(firstName, lastName, address, state, city, zipCode, number, email);
        System.out.println("contact successfully added");

    }
    /* Description - delete contacts in address book  using their name */
    public void deleteContact() {
        if (Contact.isEmpty()) {
            System.out.println("Contact list is empty.");
        } else {
            System.out.println("Enter the first name to delete contact.");
            String name = sc.next();
            Iterator<Integer> itr = Contact.keySet().iterator();
            while(itr.hasNext()) {
                int key = itr.next();
                if (Contact.get(key).firstName.equals(name)) {
                    Contact.remove(key);
                    System.out.println("Contact deleted with first name : "+name);
                }

    /* Description - edit contacts address book */
    public void editContact() {
        if (Contact.isEmpty()) {
            System.out.println("Contact list is empty.");
        } else {
            System.out.println("Enter the first name to edit contact.");
            Scanner sc;
            String name = sc.next();
            HashMap<Object, Object> contact;
            Iterator<Object> itr = Contact.keySet().iterator();
            while (itr.hasNext()) {
                Object key = itr.next();
                if (Contact.get(key).firstName.equals(name)) {
                    System.out.println("\nEnter First Name to Edit");
                    String first = sc.next();
                    sc.nextLine();
                    System.out.println("Enter Last Name to Edit");
                    String last = sc.next();
                    sc.nextLine();
                    System.out.println("Enter Address to Edit");
                    String address = sc.next();
                    sc.nextLine();
                    System.out.println("Enter City to Edit");
                    String city = sc.nextLine();
                    System.out.println("Enter State to Edit");
                    String state = sc.next();
                    sc.nextLine();
                    System.out.println("Enter Zip Code to Edit");
                    int zip = sc.nextInt();
                    System.out.println("Enter Phone Number to Edit");
                    long phone = sc.nextLong();
                    System.out.println("Enter E-mail to Edit");
                    String email = sc.next();
                    Contact Contact = new Contact(first, last, address, city, state, zip, phone, email);
                    Contact.put(key, Contact);
                    System.out.println("Contact edited with given first name : " + name);
                }
            }
        }
    }
}



