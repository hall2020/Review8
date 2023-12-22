package Review5;

public class ArraysReviewT3 {
    public static void main(String[] args) {

        int [] numbers={10,25,36,56,80};

        for (int i = 0; i <numbers.length ; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();
        for (int n : numbers) {
            System.out.println(n);

        }
    }
}
