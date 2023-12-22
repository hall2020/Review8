package review7;

public class E1Method {

    void print() {
        System.out.println("Hello There");
    }

    public static void main(String[] args) {
        //if we don t want to reuse wecan just directly create an object
        //and dont have to save to a variable and we can directly call it as below.

        // new E1Method().print()
        E1Method e1=new E1Method();
        e1.print();
        //another example with String class(already built in)
        String str=new String("Java");
        System.out.println(str.toLowerCase());

    }
}
