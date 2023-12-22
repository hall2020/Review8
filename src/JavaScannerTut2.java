import java.util.Scanner;

public class JavaScannerTut2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.next();
        System.out.println("what is your age?");
        int age = scan.nextInt();
        System.out.println("What is your goal?");
        String goal = scan.next();
        goal += scan.nextLine();
        System.out.println("Thank you " + name + " you are " + age + " years old ");
        System.out.println("and your goal is " + goal);

    }
}
