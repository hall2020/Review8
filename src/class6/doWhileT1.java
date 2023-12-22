package class6;

public class doWhileT1 {
    /*Print numbers from 100 to 1
    Expected output 100 99 98 97... 1
     */
    public static void main(String[] args) {
        int i=100;

        do {
            System.out.print(i + " ");
            i--;
        }
        while(i>=1);
    }
}
