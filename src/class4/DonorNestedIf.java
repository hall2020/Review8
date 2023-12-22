package class4;

public class DonorNestedIf {
    public static void main(String[] args) {

        int age=20;
        double weight=112;
        if(age>=18) {
            if(weight>=110) {
                System.out.println("he/She eligible for donating donor");
            }
        }
        else {
            System.out.println("We can not accept such a patient");
        }
    }
}
