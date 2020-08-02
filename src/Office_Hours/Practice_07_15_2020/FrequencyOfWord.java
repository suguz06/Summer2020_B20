package Office_Hours.Practice_07_15_2020;


import java.util.Scanner;

/*
input: CatCatCat

output: 3
 */
public class FrequencyOfWord {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.nextLine().toLowerCase();

        System.out.println("repeated frenqy word");
        String fre = scan.next();

        int c = 0;
        while (word.toLowerCase().contains(fre)) {
            word = word.replaceFirst(fre, " ");
            c++;
        }

        System.out.println(c);


    }


}
