package FieldTypes;

import java.util.Enumeration;

public class StaticMethods {

    public int num = 10;

    public static int count =5;

    public static void displayMessage(String message){

        System.out.println("message = " + message);
      //System.out.println(num);
        System.out.println(count);
    }

    public void instanceMethod(){

        System.out.println(num);
        System.out.println(count);
        displayMessage("Hello from instance method");
    }
}
