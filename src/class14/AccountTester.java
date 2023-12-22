package class14;

public class AccountTester {

    public static void main(String[] args) {

        Account a=new Account();
        //System.out.println(a.password);
        //a.printInfo();

        //Default access can access in same package different classes.
        System.out.println(a.accountNumber);
    }
}

//in general always try to create methods public but INSTANCE fields private.99%
                                                 // but static fields public.99%
//99% are classes are also public.
