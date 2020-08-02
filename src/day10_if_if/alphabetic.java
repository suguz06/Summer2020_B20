package day10_if_if;


/*
1. write a program that can identify if the given character character is Alphabetic
            ex:
                character = 'a'
            output:
                a is an Alphabetic
                character  = '!'
            output:
                ! is not  anAlphabetic
        Hint:
                ascii table:
                        65 ~ 90 ==> A~Z
                        97 ~ 122 ==> a~z



 */
public class alphabetic {
    public static void main(String[] args) {

        char character = '+';

        if ( (character >=65 && character <= 90) ||(character >=97 && character <= 122)  )
        {
            System.out.println(character + " is Alphabetic");
        }
        else    {
            System.out.println(character + " is not Alphabetic");

        }


    }


}
