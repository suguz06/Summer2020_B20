package day10_if_if;


/*
3. write a program that can identify if the given character is a symbol
                ex:
                    character = '!'
                output:
                    ! is a symbol
                    character  = 'a'
                output:
                    a is not a symbol
 */
public class symbol_Ascii {
    public static void main(String[] args) {

        char ch2='!';

        if (ch2>=33 && ch2 <=47) {
            System.out.println(ch2 + " is a symbol");
        }
        else {
            System.out.println(ch2+ " is not a symbol");
        }




    }



}
