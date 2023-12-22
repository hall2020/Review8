public class E14ElseIfQuiz {
    public static void main(String[] args) {
        int age=20;

        if(age<1) {
            System.out.println("Baby");
        }
        else if(age<20) {
            System.out.println("Teenager");
        }
        else if(age<30) {
            System.out.println("Still young");
        }
        else if(age<50) {
            System.out.println("Little old");
        }
        else {
            System.out.println("Old");
        }
    }
}
