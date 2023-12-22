package class8;

public class T4Arrays {
    public static void main(String[] args) {
        int [] numbers = {10,15,20,18,9,60,22,30};

        int sum1 = 0,sum2 = 0;

        for (int x:numbers) {
            if(x%2==0) {
             sum1 = sum1+x;
            }
            if(x%2 !=0) {
                sum2=sum2+x;
            }
        }
        System.out.println("Sum of even numbers are " + sum1 + " ");
        System.out.println("Sum of odd numbers are " + sum2 + " ");
    }
}
