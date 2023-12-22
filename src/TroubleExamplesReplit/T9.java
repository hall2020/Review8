package TroubleExamplesReplit;

import java.util.Scanner;

public class T9 {

    public static void main(String[] args) {

        String [] names = new String[5];
        Scanner sc=new Scanner(System.in);


        for (int i = 0; i<names.length; i++) {

            System.out.println("Enter a name (at least 3 characters long): ");
            String n=sc.nextLine();

            while (n.length() < 3) {
                System.out.println("Name must be at least 3 characters long. Try again.");
                n= sc.nextLine();
            }
            names[i] =n;
        }
        for (String n:names) {
            System.out.println("**" + n.substring(0, 3) + "**");
        }
        }
    }

