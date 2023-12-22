package class11;

public class E12StrindDemo {
    public static void main(String[] args) {

        String str="ndhdfksdjfh sdgA  ZDRGFTf23523#$@";
        System.out.println(str.replaceAll("[A-Z]","*"));
        System.out.println(str.replaceAll("[a-z]","*"));
        System.out.println(str.replaceAll("[0-9]","*"));
        System.out.println(str.replaceAll("[A-D]","*"));
        System.out.println(str.replaceAll("[A-Za-z]","*"));
        System.out.println(str.replaceAll("[A-Za-z0-9]", "*"));
        // this below "^" symbol is not operator****
        System.out.println(str.replaceAll("[^A-Z]","*"));

        //If we leave empty in star *  sign it will remove instead of replacing
        System.out.println(str.replaceAll("[A-Z]",""));

        // This below backword slash \\ removes spaces.
        System.out.println(str.replaceAll("[\\s]",""));
    }
}
