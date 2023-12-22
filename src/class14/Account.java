package class14;

public class Account {

    String accountNumber="123466789";
    double balance=-350;
    String userName="user123";
    private String password="Pass123";

    private void printInfo() {
        System.out.println(accountNumber);
    }
// private is only in main class we can access
    public static void main(String[] args) {
        Account a = new Account();
        System.out.println(a.password);
        a.printInfo();

    }
}
