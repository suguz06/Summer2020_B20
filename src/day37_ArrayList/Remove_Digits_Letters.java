package day37_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Digits_Letters {

    public static void main(String[] args) {


        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('a', 'v', '$', '#', '1', '3', '&', 's'));
        System.out.println(chars);
//remove digit and letters from list

        chars.removeIf(p -> Character.isLetter(p) || Character.isDigit(p));

        System.out.println(chars);

        System.out.println("==================");


        // just give lists of digits, letters, specialChars
        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('a', 'v', '$', '#', '1', '3', '&', 's'));

        ArrayList<Character> digits = new ArrayList<>();
        digits.addAll(list);

        System.out.println(digits);

        digits.removeIf(p -> !Character.isDigit(p));

        System.out.println("digits" + digits);

        ArrayList<Character> letters = new ArrayList<>();
        letters.addAll(list);
        letters.removeIf(p -> !Character.isLetter(p));
        System.out.println("letters " + letters);


        ArrayList<Character> specialChar = new ArrayList<>();
        specialChar.addAll(list);

        specialChar.removeIf(p -> Character.isLetter(p) || Character.isDigit(p));

        System.out.println("Special chars " + specialChar);


        //also

        ArrayList<Character> specialChar1 = new ArrayList<>();
        specialChar1.addAll(list);

         specialChar1.removeAll(letters);
         specialChar1.removeAll(digits);
        System.out.println("Special chars " + specialChar1);

    }
}
