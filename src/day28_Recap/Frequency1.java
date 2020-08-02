package day28_Recap;

/*

write a program that can count the frequency of a word from an array of string
            Ex:
                arr: {"Java", "C#", "Python", "Java"};
                word: "java"
                output:
                        2
MUST USE for each loop
 */
public class Frequency1 {

    public static void main(String[] args) {


        String[] arr = {"Java", "C#", "Python", "Java","java","JAVA"};

        String word = "java";

        int count = 0;
        for (String each : arr) {

            if (!each.equalsIgnoreCase("java"))
            {continue;}
            count++;
        }
        System.out.println(count);



        int count1 = 0;
        for (String each : arr) {

            if ( each.equalsIgnoreCase("java"))
            count1++;
        }
        System.out.println(count1);

    }
}
