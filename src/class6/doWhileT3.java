package class6;

public class doWhileT3 {
    /*Print only odd numbers from 100 to 1
    Expected output 99 97 95 93...1*/
    public static void main(String[] args) {
        int i = 99;

        do {
            System.out.print(i + " ");
            i= i-2;
        }
        while(i>=1);
    }
}
