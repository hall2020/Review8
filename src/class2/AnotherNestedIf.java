package class2;

public class AnotherNestedIf {
    public static void main(String[] args) {
        boolean isFriday=true;
        int day=7;

        if(isFriday) {
            System.out.println("It s a movie night");

            if (day == 7) {
                System.out.println("Let s watch a scary movie");
            } else {
                System.out.println("Let s watch something funny");
            }
        }else {
            System.out.println("No movies go back to studies");
        } }
    }

