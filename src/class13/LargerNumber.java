package class13;

public class LargerNumber {

    void printNumber(int input1,int input2) {

        if(input1>input2) {
            System.out.println(input1);
        }
        else {
            System.out.println(input2);
        }

    }

    public static void main(String[] args) {
        LargerNumber n = new LargerNumber();
        n.printNumber(10,87);

    }
}
