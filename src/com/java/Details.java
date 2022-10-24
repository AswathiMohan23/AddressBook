package com.java;

import java.time.LocalDate;

public class Details {
    private String name;
    private String address;
    private String zipCode;
    private String mobileNumber;
    private String lastName;

    public Details(String name, String address, String zipCode, String mobileNumber, String lastName) {
        this.name = name;
        this.address = address;
        this.zipCode = zipCode;
        this.mobileNumber = mobileNumber;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "Details{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

}
