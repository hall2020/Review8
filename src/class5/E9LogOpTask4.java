package class5;

import java.util.Scanner;

public class E9LogOpTask4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter hour from 1 to 24?");
        int hour = sc.nextInt();

        if(hour>=1&&hour<=11) {
            System.out.println("Morning");
        }
        else if(hour>=12&&hour<=15) {
            System.out.println("Afternoon");
        }
        else if(hour>=16&&hour<=20) {
            System.out.println("Evening");
        }
        else if(hour>=21&&hour<=24) {
            System.out.println("Night");
        }
        else {
            System.out.println("Invalid");
        }
    }
}
