package TroubleExamplesReplit;

import java.util.Scanner;

public class T4 {

        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            System.out.print("In:");
            String givenString = inp.nextLine();
            //write your code below

            String reverse=" ";

            for (int i = givenString.length()-1; i >=0 ; i--) {
                reverse = reverse + givenString.charAt(i);

            }

            if (givenString.equalsIgnoreCase(reverse.trim())) {
                System.out.println("true");
            }else{
                System.out.println("false");
            }

        }
    }

