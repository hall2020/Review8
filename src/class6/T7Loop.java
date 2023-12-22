package class6;

public class T7Loop {
    /* Print only odd numbers from 100 to 1
    Expected output 99 97 95 93...1
     */
    public static void main(String[] args) {
        int i =99;
        while(i>=2) {
            System.out.print(i + " ");
            i=i-2;
        }
    }
}
