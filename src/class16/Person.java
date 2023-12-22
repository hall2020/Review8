package class16;

public class Person {

    String name;
    int age;
    double weight;

    void printInfo() {
        System.out.println(name+ " " + age+ " " + weight);
    }

}

//we just created new class in same class like below as example.so we can do that too.!!

class Student extends Person {

    char grade;
    void study() {

    }
}

class StudentTester {
    public static void main(String[] args) {
        Student s=new Student();
        s.name="Halil";
        s.age=12;
        s.weight=68;

        s.printInfo();
    }
}
