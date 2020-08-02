package day31_MethodsRecap;


/*
2. use the above method to create another called uniques
that accepts a string paramter and returns it's unique characters as String
            Ex:
                uniques("ABBC");       ==> "AC"
                uniques("Cybertek");   ==> "cybrtk"
                please copy paste the method to the util class
 */
public class WarmsUp2 {


    public static void main(String[] args) {
String st="a111223nm";

   String a=uniques(st);

        System.out.println(a);

    }


public static String uniques(String str) {

    char[] arr=str.toCharArray();

    String result="";
    for(char ch: arr) {
        int count=0;
    for(char each: arr)
    {
        if(each==ch) {count++;}
    }
    if (count==1) result +=ch;
    }
    return result;

}

}

