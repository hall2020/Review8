package Review5;

import java.util.Arrays;

public class ArraysReviewT2 {
    public static void main(String[] args) {

        String [] students=new String[5];
        students[0]="Kendi";
        students[1]="Adam";
        students[2]="John";
        students[3]="Ali";
        students[4]="Sino";

        for(int i=0; i<students.length; i++) {
            if(students[i].equals("John")) {
                students[i]="Good Student";
            }
        }
        System.out.println(Arrays.toString(students));
    }
}
