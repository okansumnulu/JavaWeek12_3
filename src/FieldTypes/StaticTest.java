package FieldTypes;

public class StaticTest {



    public static void main(String[] args) {

        StaticMethods.displayMessage("Hello from static method");

        StaticMethods object = new StaticMethods();
        object.displayMessage("We are using object to call this static method");

        System.out.println(StaticMethods.count);

        System.out.println(object.num);
    }
}
