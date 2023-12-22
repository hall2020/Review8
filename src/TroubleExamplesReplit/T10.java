package TroubleExamplesReplit;

import java.util.Scanner;

public class T10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("In:");
        String word = sc.nextLine();


            String vowels=(word.replaceAll("[^aeiouAEIOU]", ""));
            System.out.println(vowels);

    }
}
