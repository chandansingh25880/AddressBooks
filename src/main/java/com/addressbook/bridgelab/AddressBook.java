package com.addressbook.bridgelab;

import java.util.Scanner;

/* @Description - To create a contacts in address book with first name, last name, address, city, state,
 * zip,mobile number.*/
public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome to address book system program");
        Contact contact = new Contact("Chandan", "Singh", "Milling Tonia road",
                "Lucknow", "UP", 226001,
                8887719063L, "chandan@gmail.com");
        System.out.println(contact.toString());

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
}

