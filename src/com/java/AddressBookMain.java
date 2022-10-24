package com.java;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args){
        System.out.println("Welcome to Address Book");
        enterTheDetails();

    }

    public static void enterTheDetails() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First name : ");
        String firstName=sc.next();
        System.out.println("Enter the 2nd name : ");
        String lastName=sc.next();
        System.out.println("Enter the address : ");
        String address=sc.next();
        System.out.println("Enter the zipCode : ");
        String zipCode=sc.next();
        System.out.println("Enter the mobile number : ");
        String mobileNumber=sc.next();
        Details details=new Details(firstName,address,zipCode,mobileNumber,lastName);
        System.out.println("Personal details : "+details.toString());

    }
}
