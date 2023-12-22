package class20;
//abstract means something is uncompleted.!
//we can not create an Object of the Object class.
//Every abstract class MUST have in the Inheritance.
public abstract class Computer {

    /*
    OPTIONAL               OPTIONAL                  MUST       MUST
    Access Modifier       non-access modifier       Data Type    Name
     */
   public static String type;
   public String name;
   protected int memory;
    String color;


   public Computer(String name, int memory, String color){
        this.name=name;
        this.memory=memory;
        this.color=color;
    }



    abstract  void executeCode();
  public abstract void readEmails();

}
class Apple extends Computer{

   public Apple(String name, int memory, String color){
        super(name,memory,color);
    }

    /*When we provide implementation to abstract classes we MUST follow
    //rules of Overriding!!!!
    -Overriding:Same methid name and parameter MUST be same-
            -method signature MUST be same

    Return TYpe MUST be same-Access modifiers must be same OR wider

     */
    void executeCode(){
        System.out.println("Executing code on "+type+" "+name);
    }
   public void readEmails(){
       System.out.println(name + " can read my emails.");
    }
}


