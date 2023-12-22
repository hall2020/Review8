package Review2;

public class NestedIf {
    public static void main(String[] args) {

        boolean allergy=true;
        String allergyType="fish";

        if(allergy) {
            System.out.println("Let s check what kind of allergy you have");

            if(allergyType.equals("peanut")) {
                System.out.println("Please avoid food that contains peanut");
            }
            else if(allergyType.equals("dairy")) {
                System.out.println("Please avoid food with dairy products");
            }
            else if(allergyType.equals("pollen")) {
                System.out.println("Please stay indoor when trees are blooming");
            }
        }
    }
}
