package class11;

public class E1StringDemo {

    public static void main(String[] args) {

        //Create the object of that class.
        /*String ; Data Type
        str ; variable name
        new String() ; creating the object of String
         */

        //now hello world is stored in str.

        String str=new String("Hello World");
        //calling the length method using the str object.
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        //or
        String upper=str.toUpperCase();
        System.out.println(upper);
        System.out.println(str.toLowerCase());
        System.out.println(str.concat("Hello Batch 18"));
        //below is preferable
        System.out.println(str+"Hello Batch 18");
    }
}
