package class14;

public class StudentsTester {

    public static void main(String[] args) {

        Students s1=new Students();
        s1.name = "Halil";
        s1.ID=254;
        Students.nOfStudents++;

        Students s2=new Students();
        s2.name = "Dana";
        s2.ID=325;
        Students.nOfStudents++;

        Students s3=new Students();
        s3.name="Engin";
        s3.ID=451;
        Students.nOfStudents++;

        System.out.println("Number of Students is " + Students.nOfStudents);
    }

}
