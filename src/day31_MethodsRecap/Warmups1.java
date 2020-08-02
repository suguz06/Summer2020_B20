package day31_MethodsRecap;
/*
  1.  write a return method called frequency that accepts two parameters:
  string str and char ch, the method returns the frequency of the ch from the str as an int
            Ex:
                frequency("AAA", 'A') ==>  3
                frequency("ABAB", 'B') ==> 2
            Note: MUST use Arrays and for each loop
            please copy paste the method to the util class
 */
public class Warmups1 {

    public static void main(String[] args) {

        String str="aaaabddaabbcchhhddd22";
       int a= frequency(str, 'r');
        System.out.println(a);
    }

    public static int frequency(String str, char ch) {

        char[] arr=str.toCharArray();
        int count=0;
        for(char each: arr)
        {
            if(each==ch) {count++;}
        }
        return count;

    }



}
