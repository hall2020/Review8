package TroubleExamplesReplit;
/*Create a String given="Hello Syntax friends".

        Using String methods from given String create new String "Welcome Syntax family"

        **Expected Output:**

        ```
        Welcome Syntax family

 */

public class T3 {

    public static void main(String[] args) {
        String given = "Hello Syntax friends";

        System.out.println(given.replace("Hello Syntax friends","Welcome Syntax family"));

    }
}
