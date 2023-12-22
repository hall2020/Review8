package class18;

public class Degree {


   public void getPrerequisite() {
        System.out.println("To get a degree you need high school diploma");
    }

}

class Masters extends Degree{
   public void getPrerequisite(){
        System.out.println("To get a Masters degree we need to have Bachelors degree");
    }
}

class Bachelors extends Degree{

}

class DegreeTester{
    public static void main(String[] args) {
        Masters m=new Masters();
        m.getPrerequisite();
        Bachelors b=new Bachelors();
        b.getPrerequisite();
    }
}
