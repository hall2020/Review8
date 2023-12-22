package class5;

import java.util.Scanner;

public class E7LogOpTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number from 1 to 7?");
        int dayNumber=sc.nextInt();

        if(dayNumber<=5&&dayNumber>0) {
            System.out.println("It is a weekday");
        }
        else if(dayNumber<7&&dayNumber>=6) {
            System.out.println("It is a weekend");
        }
        else {
            System.out.println("Invalid day");
        }
    }
}
