package class4;

import java.util.Scanner;

public class E12Scanner {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Do you have credit card?");
        String creditCard=sc.nextLine();
        int balance=sc.nextInt();
        System.out.println("What is the balance");

        if(creditCard.equals("No")) {
            System.out.println("We would like to give you credit card");
        }
        else if(creditCard.equals("Yes")) {
            System.out.println("What is the balance ?");
        }
        if(balance>1000) {
            System.out.println("Pay off immediately");
        }
        else {
            System.out.println("You can spend more");
        }

    }
}
