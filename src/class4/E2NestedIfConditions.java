package class4;

public class E2NestedIfConditions {
    public static void main(String[] args) {

        double budget=50000;
        String engineType="Hybrid";

        if(budget>=50000) {

            if(engineType.equals("Electric")) {
                System.out.println("I want to buy a Tesla");
            }
            else if (engineType.equals("Hybrid")) {
                System.out.println("I want to buy a Toyota");
            }
            else {
                System.out.println("I want to buy a Porche");
            }

            }
        }
    }

