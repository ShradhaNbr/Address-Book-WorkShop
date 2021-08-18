package com.addressbook;

import java.util.Scanner;

public class AddressBook {

    //Method to create the contact
    public void createContact() {
        Scanner sc = new Scanner(System.in);
        Contact contact = new Contact();
        System.out.println("Enter the first name");
        contact.setfirstName(sc.next());
        System.out.println("Enter the last name");
        contact.setlastName(sc.next());
        System.out.println("Enter the Address");
        contact.setaddress(sc.next());
        System.out.println("Enter the city");
        contact.setcity(sc.next());
        System.out.println("Enter the State");
        contact.setstate(sc.next());
        System.out.println("Enter the zip code");
        contact.setzip(sc.nextLong());
        System.out.println("Enter the phone number");
        contact.setphoneNumber(sc.nextLong());
        System.out.println("Enter the Email Id");
        contact.setemail(sc.next());
        sc.close();
    }
}
