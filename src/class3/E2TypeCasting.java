package class3;

public class E2TypeCasting {
    public static void main(String[] args) {
        double price=12.3;
        double quantity=3;
        double totalPrice=quantity*price;
        //If we don t want decimals we can use typecasting . so we can force it.
        System.out.println((int)totalPrice);
    }
}
