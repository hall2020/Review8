package Review8;

public class Doctor {
   public static String hospital;
   public String firstName, lastName;
   protected String speciality;
   int yearsOfExperience;
   private double salary;

   Doctor(String firstName,String lastName,String speciality, int yearsOfExperience){
       this.firstName=firstName;
       this.lastName=lastName;
       this.speciality=speciality;
       this.yearsOfExperience=yearsOfExperience;
   }

   public static void work() {
       System.out.println("Doctors work at "+hospital);
   }

   protected void checkVitals(){
       System.out.println(firstName+" "+lastName+" checks vitals on every patient");
   }

   /* What is overloading - in the same class we have method with same name.

  How to overload: changing number of the parameters or dataType or sequence.

  In overloading method signature must be different.!

  We don t care about return type, or access modifiers.!! meaning by changing those we are not overloading!!

    */

    void checkVitals(String patient) {
        System.out.println(firstName+" "+lastName+" checks vitals on "+patient);
    }

    void prescribeMedication(String medication){
        System.out.println(firstName+" "+lastName+" "+" prescribed "+medication);
    }

}

class Surgeon extends Doctor{

    String location;

    Surgeon(String firstName,String lastName,String speciality, int yearsOfExperience, String location){
        super(firstName,lastName,speciality,yearsOfExperience);//call to the constructor happens first!!
        this.location=location;
    }
    /*
    Method overriding - in subclass (child class) and parent class we have method with the same name.
    as declared in the parent class.

    How to override: we need inheritance
    MUST keep same name ,parameters and return type;
    Access modifiers MUST be same or wider access!


    In overriding Method Signature MUST be SAME!
     */

    public void prescribeMedication(String patient) {
        System.out.println("Surgeon "+lastName+ " prescribed medication to "+patient);
    }
}
