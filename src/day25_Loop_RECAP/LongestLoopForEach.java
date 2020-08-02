package day25_Loop_RECAP;

public class LongestLoopForEach {
    public static void main(String[] args) {


        String[] str = {"aa1111", "b", "c", "vvvv", "fffdf", "dddddd"};

        int max = str[0].length();

        for (String each: str) { //find maxlenght
            if(each.length()>max) {max=each.length();}
        }

        for(String each: str) { // to see how many strings' lengths in the array is matching with maxLength
            if(max==each.length()) {

                System.out.println(each);
            }
            }





        }
    }