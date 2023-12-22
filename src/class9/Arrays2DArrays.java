package class9;

public class Arrays2DArrays {
    public static void main(String[] args) {

        int [][] matrix = {
                {10,20,50},
                {25,35,66},
                {80,90,78,45},
                {45,55,66}
        };

        System.out.println(matrix[1][1]);
        //gives us number of rows length
        System.out.println(matrix.length);
        //gives us first row s length
        System.out.println(matrix[0].length);
    }
}
