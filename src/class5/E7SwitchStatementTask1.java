package class5;

import java.util.Scanner;

public class E7SwitchStatementTask1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your country?");
        String country = sc.nextLine();

        switch (country.toLowerCase()) {
            case "france":
                System.out.println("You speak france");
                break;
            case "england":
                System.out.println("You speak English");
                break;
            case "portugal":
                System.out.println("Porteqiuse");
                break;
            case "china":
                System.out.println("Chinese");
                break;
            case "turkiye":
                System.out.println("Turkish");
                break;
            default:
                System.out.println("Invalid country");
        }
    }
}
