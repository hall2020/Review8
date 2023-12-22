package class17;

public class Parent {

    String name="Israel";

}

class Child extends Parent {
    String name="Maria";

    void print() {
        String name="Levi";
        System.out.println(name);
        // if we put this.name Israel will be printed.
        // if we also use super keyword Israel will be printed.
        //if there is no name in void method it will print mari
        //and if there is non name maria then it will print Israel.
    }
}

class Tester{
    public static void main(String[] args) {
        Child c=new Child();
        c.print();

    }
}
