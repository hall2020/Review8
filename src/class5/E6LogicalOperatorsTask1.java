package class5;

import java.util.Scanner;

public class E6LogicalOperatorsTask1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your height?");
        double height= sc.nextDouble();

        if(height<60) {
            System.out.println("Short");
        }
        else if(height>=60&&height<=72) {
            System.out.println("Medium");
        }
        else {
            System.out.println("Tall");
        }
    }
}
