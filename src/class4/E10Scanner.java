package class4;

import java.util.Scanner;

public class E10Scanner {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter your age");
        int age= sc.nextInt();

        if(age>=18) {
            System.out.println("We will issue your driver license");
        }
        else {
            System.out.println("We are not able to issue your driver license");
        }

    }
}
