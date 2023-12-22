import java.util.Scanner;

public class JavaScannerTut {
    public static void main(String[] args) {
        Scanner example = new Scanner(System.in);
        System.out.println("What is your first name?");
        String name = example.next();
        System.out.println(name);

        System.out.println("What is your age?");
        int age= example.nextInt();
        System.out.println("What is your senior quote?");
        String quote = example.next();
        quote += example.nextLine();
        System.out.println("Thank you " + name + ", you are " + age + " years old");
        System.out.println("and your senior quote is " + quote);
    }
}
