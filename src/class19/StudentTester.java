package class19;

public class StudentTester {
    public static void main(String[] args) {
        Student [] arr = {new Student(), new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};
        for (Student student : arr){
            student.run();
            student.listen();
            student.homework();
        }
    }
}
