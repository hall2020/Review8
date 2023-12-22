package class12;
//Create a string that will hold a sentence.
//Write a program to get a new string without any spaces.
public class T1 {
    public static void main(String[] args) {

        String str = "Today is very rainy day. There is also snowing.";
        System.out.println(str.replaceAll(" ",""));

    }
}
