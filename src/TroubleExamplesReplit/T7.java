package TroubleExamplesReplit;

import java.util.Scanner;

public class T7 {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("In:");
        String word=sc.nextLine();

        for (int i = 0; i <word.length() ; i++) {
            System.out.println(word.charAt(i));
        }

    }
}
