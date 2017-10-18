/*

Yonatan Mengesha

creating 5 persons and putting them in ArrayList and Display the firstname
java bootcamp

 */


package com.company;

public class Person {
    //creates a String with the name firstname,lastname,address,phonenumber,email
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private String email;

    //creating a setter getter method for all variables
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    //Displays the firstname,lastname,address,phonenumber.email of a person
    public void Display()
    {
        System.out.println ("Persons First Name is : "+ getFirstName () );
        System.out.println ("Persons Last Name is: " + getLastName () );
        System.out.println ("Persons Address is: "+ getAddress () );
        System.out.println ("Persons Phone number is: "+ getPhoneNumber () );
        System.out.println ("Persons Email is: "+getEmail () );
    }
}
