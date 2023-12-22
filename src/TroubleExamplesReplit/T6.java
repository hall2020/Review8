package TroubleExamplesReplit;

import java.util.Scanner;

public class T6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("In:");
        String word = sc.nextLine();
        //write your code below



        for (int i = 0; i <word.length() ; i=i+2) {
            System.out.print(word.charAt(i));
        }
        System.out.println();
    }
}
