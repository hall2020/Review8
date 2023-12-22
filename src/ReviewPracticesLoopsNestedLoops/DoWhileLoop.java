package ReviewPracticesLoopsNestedLoops;

//while loop when we do NOT know in advance
//how many times we want to repeat block of code.!!
//but do while , block of code will be executed at leat once
//even when condition is false.!

public class DoWhileLoop {

    public static void main(String[] args) {
        int n=1;
        do {
            System.out.println("Hello");
            n++;
        }while(n>=4);
        System.out.println(n);
        }


    }
