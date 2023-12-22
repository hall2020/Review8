package class16;

public class Teacher {
    String name;
    int age;
    String weight;
    String height;
    void sing() {
        System.out.println("lalala");
    }

    void talk() {
        System.out.println("abucukubucu");
    }

    void beAngry() {
        System.out.println("hrrrrrrr hmmmmm");
    }

    void listen() {
        System.out.println("okkeeyy");
    }

    }

class MathTeacher extends Teacher {
    void teachMath() {
        System.out.println("Teaching Math");
    }
}
class ChemistryTeacher extends MathTeacher {
    }

    class PianoTeacher extends ChemistryTeacher {

    void teachPiano() {
        System.out.println("teaching Piano");
    }
    }

    class TeacherTester {
        public static void main(String[] args) {
            MathTeacher m= new MathTeacher();
            m.sing();
            m.beAngry();
            m.teachMath();
            ChemistryTeacher c= new ChemistryTeacher();
            c.talk();
            PianoTeacher p=new PianoTeacher();
            p.beAngry();
            p.teachPiano();

        }
    }

