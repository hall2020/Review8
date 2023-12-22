package class5;

import java.util.Scanner;

public class E10LogOpTask5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your birth month?");
        String month = sc.next();

        if(month.equalsIgnoreCase("March")||
                month.equalsIgnoreCase("April")||
                month.equalsIgnoreCase("May")) {
            System.out.println("Spring Season");
        }
        else if(month.equalsIgnoreCase("June")||
                month.equalsIgnoreCase("July") ||
                month.equalsIgnoreCase("August")) {
            System.out.println("Summer Season");
        }
        else if(month.equalsIgnoreCase("September")||
                month.equalsIgnoreCase("October")||
                month.equalsIgnoreCase("November")) {
            System.out.println("Autum Season");
        }
        else if(month.equalsIgnoreCase("December")||
                month.equalsIgnoreCase("January")||
                month.equalsIgnoreCase("February")) {
            System.out.println("Winter");
        }
        else {
            System.out.println("Invalid");
        }
    }
}
