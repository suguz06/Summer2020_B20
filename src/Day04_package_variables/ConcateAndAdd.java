package Day04_package_variables;

public class ConcateAndAdd {
    public static void main(String[] args) {

        System.out.println('A'+2);
        // char 'A' is a ascii number then addition
        System.out.println('a' + 'b');
 // char values added
        System.out.println("12"+12); //===>>> 1212
//concetetation==>>> append
        System.out.println("A"+2);
        //concate ==>>> text + number ++>> A2

        System.out.println("tax"+ 3.5+ '%');
        // tax3.5% since left to right
        System.out.println(3.5+ '%'+ "tax" );
        //40.5tax, since first numbers added then concatenate
    }


}
