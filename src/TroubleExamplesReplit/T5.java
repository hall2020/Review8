package TroubleExamplesReplit;

import java.util.Scanner;

public class T5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("In:");
        String s = sc.nextLine();
        //write your code below

        String reverse =" ";
        for (int i =s.length()-1; i>=0 ; i--) {
            reverse = reverse+s.charAt(i);
        }
        System.out.println(reverse);
    }
}
