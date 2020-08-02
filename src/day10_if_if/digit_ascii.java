package day10_if_if;

/*
2. write a program that can identify if the given character character is Digit
                ex:
                    character = '1'
                output:
                    1 is a Digit
                    character  = '!'
                output:
                    ! is not a digit
 */
public class digit_ascii {


    public static void main(String[] args) {
        char ch1='p';

        if (ch1 >=48 &&ch1 <=57) {
            System.out.println(ch1 + " is a Digit");
        }
    else {
            System.out.println(ch1 + " is not a digit");
        }


    }}
