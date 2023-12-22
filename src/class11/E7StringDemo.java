package class11;

public class E7StringDemo {
    public static void main(String[] args) {

        String str="   HELLO   ";

        System.out.println(str.trim().length());

        //If we want we can apply methods as below if we wanna save line of codes
        System.out.println(str.trim().toLowerCase().equals("hello"));
    }
}
