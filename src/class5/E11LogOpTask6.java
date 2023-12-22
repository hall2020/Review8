package class5;

import java.util.Scanner;

public class E11LogOpTask6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double quiz, midTerm, finalR, avrScore;
        char grade;
        System.out.println("Please put your quiz result?");
        quiz = sc.nextDouble();
        System.out.println("Please put your midterm result?");
        midTerm = sc.nextDouble();
        System.out.println("Please put your final result?");
        finalR = sc.nextDouble();

        avrScore = (quiz + midTerm + finalR)/3;


        if(avrScore>=90) {
            grade='A';
        }
        else if(avrScore>=70) {
            grade='B';
        }
        else if(avrScore>=50) {
            grade='C';
        }
        else {
            grade='F';
        }
        System.out.println(grade);
    }
}
