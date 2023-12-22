package class4;

import java.util.Scanner;

public class E9ScannerPractice {
    public static void main(String[] args) {
        Scanner fetchLoan = new Scanner(System.in);
        System.out.println("Please enter the loan amount");
        double amount = fetchLoan.nextDouble();


        if (amount >= 200000) {
            System.out.println("Your loan request denied");
        } else {
            System.out.println("We approved your request");
        }
    }
}