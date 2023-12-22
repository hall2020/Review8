package Review5;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2DScannerT2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of the array");
        int size = sc.nextInt();
        //below the size of array will be created when user enters the input
        int [] numbers=new int[size];
        System.out.println(numbers.length);

        for (int i = 0; i <numbers.length; i++) {
            System.out.println("Please enter the number " + (i+1));
            numbers[i]=sc.nextInt();

        }
        System.out.println(Arrays.toString(numbers));


    }
}
