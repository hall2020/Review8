package ReplitPractices;

public class Car2 {

    String carColor;
    int carYear;
    String carMake;

    public static void main(String[] args) {
        Car2 BMW = new Car2();

        BMW.carColor = "Black";
        BMW.carYear = 2019;
        BMW.carMake = "BMW";

        Car2 Toyota = new Car2();
        Toyota.carColor = "White";
        Toyota.carYear = 2018;
        Toyota.carMake = "Toyota";

        System.out.println("Car color is " + BMW.carColor + " and car year is " + BMW.carYear + " and car model is " + BMW.carMake);
        System.out.println("Car color is " + Toyota.carColor + " and car year is " + Toyota.carYear + " and car model is " + Toyota.carMake);
    }
}
