package com.addressbook;
public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        AddressBook book = new AddressBook();
        book.createContact();
    }
}
