package day10_if_if;


public class Character_Identify {

    public static void main(String[] args) {

        char ch = 'A';
        String result;
        boolean isAlphabetic = (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122);

        boolean isDigit= (ch >= 48 && ch <= 57);

//        result = (isAlphabetic) ? "alphabetic" : "not alphabetic";
//
//        System.out.println(result);


        result= (!isAlphabetic && ! isDigit) ? ch+ " is digit": ch+ " is not digit";

//        if (!isAlphabetic && !isDigit)
//            result= ch + " is special characters";
//        else result= ch+ " is not special characters";

        System.out.println(result);
    }


}
