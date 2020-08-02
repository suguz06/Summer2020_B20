package day35_ArrayList;


public class SumOfDigit2 {

    public static void main(String[] args) {
        String str = "a1b2c3";

        int sum=0;
        for (char c : str.toCharArray()) {
    if(Character.isDigit(c)) {
        sum  += Integer.parseInt(c+"") ; //sum += c-48; also works

    }
        }
        System.out.println(sum);

/*
isDigit() ==>> verify if the char is digit=> return boolean
isLetter() ==>>verfiy char is letter
Character.isDigit(char) ==>. return boolean
 */
    }

}

