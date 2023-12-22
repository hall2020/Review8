package class5;

import java.util.Scanner;

public class E8LogOpTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Put a number");
        int num=sc.nextInt();

        if(num>=1&&num<=10) {
            System.out.println("Small number");
        }
        else if(num>=11&&num<=100) {
            System.out.println("Medium number");
        }
        else if(num>=101&&num<=1000) {
            System.out.println("Large number");
        }
        else {
            System.out.println("very very large");
        }
    }
}
