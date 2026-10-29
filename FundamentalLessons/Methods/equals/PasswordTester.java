package FundamentalLessons.Methods.equals;

public class PasswordTester {

    public static void main(String args[]){

        Password fella = new Password("fella");
        System.out.println(fella.isSafe("fella"));
        System.out.println(fella.isSafe("hombre"));
        fella.change("passoword", "password");
        System.out.println(fella.isSafe("fella"));

    }

}
