package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {

    static Scanner sc = new Scanner(System.in);
    static Details person1 = new Details("tom", "john", "Trivandrum", "kerala","Trivandrum","bc@gmail.com","45678","1234567");
    static Details person2 = new Details("Anna", "Maria", "Bangalore", "karnataka", "Bangalore","abcdef@gmail.com","12345","9846573632");
    static Details person3 = new Details("Linda", "Thomas", "Kozhikode", "kerala", "kozhikode","linda@gmail.com","1234","1234567");

    static List<String> addressBook = new ArrayList<>();


    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        System.out.println("Address book contacts :\n" + person1.toString() + "\n" + person2.toString() + "\n" + person3.toString());
        System.out.println("\nchoose the option (1 or 2) which u need : " +
                "\n1 : enter details from console\n2 : find a person by name\n"+"3 : delete details by using name\n");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                enterTheDetails();
                break;
            case 2:
                System.out.println("select the name : ");
                String byName = sc.next().toUpperCase();
                searchByName(byName);
                break;
            case 3:
                System.out.println("select the name : ");
                byName = sc.next().toUpperCase();
                delete(byName);
        }
    }
    public static void savedDetails(String name) {
        if (name.equals(person1.getFirstName().toUpperCase()))
            System.out.println("\nThe searched name is " + name + " and the details are : " +
                    "\n=================================================\n\n" + person1.toString()+"\n");
        else if (name.equals(person2.getFirstName().toUpperCase()))
            System.out.println("\nThe searched name is " + name + " and the details are : " +
                    "\n=================================================\n\n" + person2.toString()+"\n");
        else if (name.equals(person3.getFirstName().toUpperCase()))
            System.out.println("\nThe searched name is " + name + " and the details are : " +
                    "\n=================================================\n\n" + person3.toString()+"\n");
        else
            System.out.println("wrong entry");
    }

    public static void searchByName(String byName) {
        savedDetails(byName);
    }
    public static void delete(String name){
        if (name.equals(person1.getFirstName().toUpperCase())) {
            System.out.println("\nThe searched name is " + name + " and the details are : " +
                    "\n=================================================\n\n" + person1.toString() + "\n");
            System.out.println("deleting details of "+name+"...........\n");
            System.out.println("Updated address book :\n========================\n\n" +person2.toString()+"\n"+person3.toString()+"\n");
        }else if (name.equals(person2.getFirstName().toUpperCase())) {
            System.out.println("\nThe searched name is " + name + " and the details are : " +
                    "\n=================================================\n\n" + person2.toString() + "\n");
            System.out.println("deleting details of "+name+"...........\n");
            System.out.println("Updated address book :\n========================\n\n" +person1.toString()+"\n"+person3.toString()+"\n");
        }else if (name.equals(person3.getFirstName().toUpperCase())) {
            System.out.println("\nThe searched name is " + name + " and the details are : " +
                    "\n=================================================\n\n" + person3.toString() + "\n");
            System.out.println("deleting details of "+name+"...........\n");
            System.out.println("Updated address book :\n==========================\n\n" +person1.toString()+"\n"+person2.toString());
        }else
            System.out.println("wrong entry");
    }


    public static void enterTheDetails() {
        System.out.println("Enter the First name : ");
        String firstName = sc.next();
        System.out.println("Enter the 2nd name : ");
        String lastName = sc.next();
        System.out.println("Enter the address : ");
        String address = sc.next();
        System.out.println("Enter the state : ");
        String state = sc.next();
        System.out.println("Enter the city : ");
        String city = sc.next();
        System.out.println("Enter the email : ");
        String email = sc.next();
        System.out.println("Enter the zipCode : ");
        String zipCode = sc.next();
        System.out.println("Enter the mobile number : ");
        String mobileNumber = sc.next();
        Details enteredDetails = new Details(firstName,lastName,address,state,city,email,zipCode,mobileNumber);
        System.out.println("Personal details : " + enteredDetails.toString());
        addItems(firstName,lastName,address,state,city,email,zipCode,mobileNumber);

    }

    //uc5
    public static void addItems(String firstName, String lastName, String address, String state, String city, String email, String zipCode, String mobileNumber) {
        addressBook.add(person1.toString());
        addressBook.add(person2.toString());
        addressBook.add(person3.toString());
        addressBook.add(firstName);
        addressBook.add(lastName);
        addressBook.add(address);
        addressBook.add(state);
        addressBook.add(city);
        addressBook.add(email);
        addressBook.add(zipCode);
        addressBook.add(mobileNumber);
        System.out.println("the array list is : "+addressBook);
    }


}
