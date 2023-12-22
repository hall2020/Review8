package ReplitPractices;

import java.util.Scanner;

public class T95 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a String");
        String input = sc.nextLine();

        System.out.println("The first 3 letters of " + input + " is " + input.substring(0,3));
    }
}
