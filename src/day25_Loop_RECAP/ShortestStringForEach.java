package day25_Loop_RECAP;

public class ShortestStringForEach {
    public static void main(String[] args) {


        String[] str = {"aa", "b", "c", "vvvv", "fffdf", "dddddd"};

        int min = str[0].length();

        for(String each: str) { //fin the min length
            if(each.length()<min) {min=each.length();}
        }

        for(String each:str) { // print min length strings
            if(min==each.length())
                System.out.println(each);
        }





    }
}
