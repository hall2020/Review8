package class19;


public class Student {

    void run(){
        System.out.println("Run from class");
    }

    void listen(){
        System.out.println("Listen guys");
    }
    void homework(){
        System.out.println("do your hw");
    }
}

class SyntaxStudent extends Student{
    void studyHard(){
        System.out.println("We study very hard");
    }
    void run(){
        System.out.println("don t run");
    }
}
class CollegeStudent extends Student{

}

class SchoolStudent extends Student{
    void homework(){
        System.out.println("do your hw faster");
    }
}
