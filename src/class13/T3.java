package class13;

public class T3 {
    void oddOrEven(int x) {

        if(x%2==0) {
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }
    }

    public static void main(String[] args) {

        T3 n = new T3();
        n.oddOrEven(8);
    }
}
