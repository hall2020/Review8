package class6;

import java.util.Scanner;

public class LoopsT12Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the starting point");
        int start=sc.nextInt();
        System.out.println("Please enter the end point");
        int end = sc.nextInt();
        while(start<=end) {
            System.out.print(start + " ");
            start++;
        }
    }
}
