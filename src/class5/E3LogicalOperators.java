package class5;

public class E3LogicalOperators {
    public static void main(String[] args) {

        boolean condition1=false;
        boolean condition2=true;

        if(!(condition1 || condition2)) {
            System.out.println("If");
        }
        else {
            System.out.println("Else");
        }
    }
}
