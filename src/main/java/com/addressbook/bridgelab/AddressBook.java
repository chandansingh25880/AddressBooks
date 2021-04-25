package com.addressbook.bridgelab;

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
}


