package class17;



class Math{

    static void add(int num1,int num2) {
        System.out.println(num1+num2);
    }

    static void add(double num1,double num2){
        System.out.println(num1+num2);
    }

    static void add(double num1,double num2,double num3){
        System.out.println(num1+num2);
    }

    static void add(int num1,double num2){
        System.out.println(num1+num2);
    }
    static void add(double num1,int num2){
        System.out.println(num1+num2);
    }
}

public class E1MethodOverloading {

    public static void main(String[] args) {
        Math.add(10,20);
        Math.add(15.50,25.65);
        Math.add(15.20,65.21,45.21);
        Math.add(54,65.45);
        Math.add(32.45,87);

        //sout is also overload method :) it work with all diff data types.
        System.out.println(true);
        System.out.println(12);
        System.out.println('C');
        System.out.println("Galil");
    }
}
