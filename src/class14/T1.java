package class14;

public class T1 {

    static int dValue(int input) {
        return input*2;

    }

    public static void main(String[] args) {

        // we use static methods when we don t have objects.!!

        System.out.println(T1.dValue(2));
    }
}
