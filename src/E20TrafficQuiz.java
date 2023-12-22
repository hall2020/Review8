public class E20TrafficQuiz {
    public static void main(String[] args) {
        String trafficLight="Yellow";

        if(trafficLight.equals("Red")) {
            System.out.println("Stop");
        }
        else if(trafficLight.equals("Yellow")) {
            System.out.println("Caution");
        }
        else if(trafficLight.equals("Green")) {
            System.out.println("Go");
        }
        else {
            System.out.println("Do whatever you want");
    }
}}
