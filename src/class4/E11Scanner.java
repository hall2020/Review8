package class4;

import java.util.Scanner;

public class E11Scanner {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter your city");
        String city=sc.nextLine();
        System.out.println("Please enter the temperature in " + city);
        double temp=sc.nextDouble();
        double tempInCelcius=(temp-32)*5.0/9.0;
        System.out.println("Temperature in " + city + " is " + tempInCelcius + " Celcius");


        System.out.println("The temperature is the city " + temp + " is ");
    }
}
