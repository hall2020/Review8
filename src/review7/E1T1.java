package review7;

public class E1T1 {

    //If we are not using any instance fields from E1 class
    //or if our method has no thing to do with multiple objects
    // we can go ahead and create static method/.!!or with public static

    static int arr(int[] number) {
        int sum=0;
        for (int i = 0; i <number.length; i++) {
            sum=sum+number[i];
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {

        int [] ar=new int[]{10,20,56};

        System.out.println(arr(ar));

    }
}
