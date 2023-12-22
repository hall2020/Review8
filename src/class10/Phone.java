package class10;

public class Phone {
    /*BTW we can also put the main

    class in class Phone ,we don t have to open another class,
    teacher is just showing us.*/


    String make;
    String color;
    String memory;
    double price;
    String model;

    void Ring() {
        System.out.println("Riiiinnnggg");
    }
    void Talk() {
        System.out.println("Vidi vidi...");
    }
    void Watch() {
        System.out.println("Watching something");
    }

    public static void main(String[] args) {

        Phone iPhone=new Phone();
        iPhone.make="Apple";
        iPhone.color="White";
        iPhone.model="Iphone 15 Pro max";
        iPhone.price=1200;
        iPhone.Ring();
        iPhone.Talk();
        iPhone.Watch();
        System.out.println(iPhone.make);
        System.out.println(iPhone.model);
        System.out.println(iPhone.price);
        System.out.println(iPhone.color);

        Phone samsung=new Phone();
        samsung.make="Samsung";
        samsung.model="S23 Ultra";
        samsung.color="Black";
        samsung.price=1000;

        samsung.Ring();
        samsung.Talk();
        samsung.Watch();
        System.out.println(samsung.make);
        System.out.println(samsung.model);
        System.out.println(samsung.price);
        System.out.println(samsung.color);

    }

}
