package day28_Recap;


/*
 1. write a program return the frequency of a word from a string
            ex:
                str = "JavajavaJAVA";
                word = "java";
                output:
                    3

 */
public class Frequency {
    public static void main(String[] args) {

        String str = "JavajavaJAVAjava".toLowerCase();

        int c = 0;
        while (str.contains("java")) {
str=str.replaceFirst("java", "");
            c++;
        }

        System.out.println(c);
    }
}
