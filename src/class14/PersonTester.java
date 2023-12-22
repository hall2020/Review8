package class14;

public class PersonTester {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name="Zeeshan";
        p1.age=22;
        p1.weight=60;
        p1.printInfo();
        //when we access it to static var we use class name .better recommended.
        System.out.println(Person.noOfEye);

        Person p2=new Person();
        p2.name="Sino";
        p2.age=25;
        p2.weight=70;
        p2.printInfo();
        //when we access it to static var we use class name .better recommended.
        System.out.println(Person.noOfEye);

        Person.printNoOfEyes();
    }
}
