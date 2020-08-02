package Office_Hours.Practice_06_17_2020;


// pre increment or decrement is applied right away by + or - 1
// post inc/dec is applied later
public class Post_Vs_Pre {

    public static void main(String[] args) {

        int a = 300;

        System.out.println(++a); //a=301
        System.out.println(++a);// a=302
        System.out.println(a--); // a=302
        System.out.println(a--); //301


    }
}
