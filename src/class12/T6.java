package class12;

public class T6 {
    public static void main(String[] args) {

        String str="Mom";
        String reverseWord="";
        for (int i = str.length()-1; i >=0; i--) {
            reverseWord=reverseWord+str.charAt(i);
        }
        if(str.equalsIgnoreCase(reverseWord)) {
            System.out.println("It s a Palindrome");
        }
        else {
            System.out.println("It s not a Palindrome");
        }
    }
}
