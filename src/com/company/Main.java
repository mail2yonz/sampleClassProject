package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String answere="";
        Scanner keyboard= new Scanner (System.in);


        ArrayList<Person> pArrayList= new ArrayList<> ();



      do{
          Person person= new Person();
          System.out.print ("Enter Persons First Name: " );
          String firstName= keyboard.nextLine ();
          person.setFirstName (firstName);


          System.out.print ("Enter Persons Last Name: " );
          person.setLastName ( keyboard.nextLine () );


          System.out.print ("Enter the Persons Address: " );
          person.setAddress ( keyboard.nextLine () );


          System.out.print ("Enter the Persons Phone number: " );
          person.setPhoneNumber ( keyboard.nextLine () );


          System.out.print ("Enter the Persons Email: " );
          person.setEmail ( keyboard.nextLine () );

          System.out.println ( );
          pArrayList.add ( person );

          System.out.println ("Do you want to Enter another Person?(yes/no)" );
              answere= keyboard.nextLine ();

      }while( answere.equalsIgnoreCase ("yes"));

        for(Person person1:pArrayList)
        {
            System.out.println (person1.getFirstName () );
            //person.Display ();
        }



    }


}
