package class18;

public class Parent {

    void marry() {
        System.out.println("Marry the girl that we have selected for you");
    }

    void sleep() {
        System.out.println("I want to sleep 8 hours");
    }
}

class Karimi extends Parent{

    void marry() {
        System.out.println("I want to marry Scarlet Johnson");
    }
}

class Tester{
    public static void main(String[] args) {
        Karimi k=new Karimi();
        k.marry();
        k.sleep();
    }
}
