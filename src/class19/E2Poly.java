package class19;

public class E2Poly {
    public static void main(String[] args) {

        Dog d1=new Dog("Jacky","Brown",10,25);
        Dog d2=new Dog("Macky","black",10,25);
        Cat c1=new Cat("Lacky","Blue",8,45);
        Animal a1=new Animal("Tacky","Pink",54,65);

        Animal [] arr={d1,d2,c1,a1};
        //d1 will be printed below.
        Animal a2=arr[0];
        a2.printInfo();
    }
}
