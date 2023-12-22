package ReplitPractices;

public class Dog2 {

    String breed;
    String name;
    String color;

    void bark() {
        System.out.println(breed + " can bark");
    };
    void run () {
        System.out.println(breed + " can run");
    };
    void play() {
        System.out.println(breed + " can play");
    }

    public static void main(String[] args) {

        Dog2 Husky = new Dog2();
        Husky.breed = "Husky";

        Husky.bark();
        Husky.run();
        Husky.play();

        Dog2 Bulldog = new Dog2();
        Bulldog.breed = "Bulldog";

        Bulldog.bark();
        Bulldog.run();
        Bulldog.play();

        Dog2 Labrador = new Dog2();
        Labrador.breed = "Labrador";

        Labrador.bark();
        Labrador.run();
        Labrador.play();
    }

}
