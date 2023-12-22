package class14;

public class Dogg {
    String name;

    void printInfo() {

        System.out.println(name);
    }

    public static void main(String[] args) {
        Dogg d1 = new Dogg();
        d1.name="Jacki";
        d1.printInfo();
    }
}
