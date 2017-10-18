/*

Yonatan Mengesha

creating 5 persons and putting them in ArrayList and Display the firstname
java bootcamp

 */




package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //a String answere that askes the user for another input
        String answere="";
        //create a scanner object with the name keyboard
        Scanner keyboard= new Scanner (System.in);


        //Create an ArrayList of type person with the name pArrayList
        ArrayList<Person> pArrayList= new ArrayList<> ();


//do while loop to enter different persons
      do{
          //creating a person
          Person person= new Person();


          //Askes the user for First name and accepts from the keyboard
          System.out.print ("Enter Persons First Name: " );
          String firstName= keyboard.nextLine ();
          person.setFirstName (firstName);


          //Askes the user for Last name and accepts from the keyboard
          System.out.print ("Enter Persons Last Name: " );
          person.setLastName ( keyboard.nextLine () );



           //Askes the user for Address  and accepts from the keyboard
          System.out.print ("Enter the Persons Address: " );
          person.setAddress ( keyboard.nextLine () );


          //Askes the user for Phone number  and accepts from the keyboard
          System.out.print ("Enter the Persons Phone number: " );
          person.setPhoneNumber ( keyboard.nextLine () );


          //Askes the user for Email  and accepts from the keyboard
          System.out.print ("Enter the Persons Email: " );
          person.setEmail ( keyboard.nextLine () );

          System.out.println ( );
        //  person.Display ();
          System.out.println ( );

          //Adds the newly created person in to the pArrayList
          pArrayList.add ( person );

          //Asks the user to enter another record or not and accepts from the keyboard
          System.out.println ("Do you want to Enter another Person?(yes/no)" );
              answere= keyboard.nextLine ();

      }while( answere.equalsIgnoreCase ("yes"));

      //For each loop to display the firstName of the 5 persons
        System.out.println ("The first name of the Persons entered are:" );
        System.out.println ("==========================================" );
        for(Person person1:pArrayList)
        {
            System.out.println (person1.getFirstName () );

        }




    }


}
