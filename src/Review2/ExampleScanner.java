package Review2;

import java.util.Scanner;

public class ExampleScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your favorite car make");
            String carName = sc.nextLine();
            String carOrigin;

      switch (carName) {
                case "BMW":
                    carOrigin = "german car";
                    break;
                case "Toyota":
                    carOrigin = "japanese car";
                    break;
                case "Maserati":
                    carOrigin = "Italian car";
                    break;
                default:
                    carOrigin = "Unknown";
            }
    System.out.println("Your favorite car is " + carOrigin);
        }
    }

