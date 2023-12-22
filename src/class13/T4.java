package class13;

public class T4 {

    void isPalindrome(String x){

        String reverseWord ="";

        for (int i =x.length()-1; i>=0; i--) {
            reverseWord = reverseWord + x.charAt(i);

        }
        if (x.equalsIgnoreCase(reverseWord)) {
            System.out.println("Polindrome");
        }
        else {
            System.out.println("It is not a polindrom");
        }
    }

    }

