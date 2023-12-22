package class14;

public class SyntaxEmployeeTester {

    public static void main(String[] args) {

        SyntaxEmployee e1=new SyntaxEmployee();
        e1.empID =254647;
        e1.salary=200.00;
        e1.printInfo();
        System.out.println(SyntaxEmployee.CEO);



        SyntaxEmployee e2=new SyntaxEmployee();
        e2.empID=457845;
        e2.salary=400.00;
        e2.printInfo();
        System.out.println(SyntaxEmployee.CEO);
    }
}
