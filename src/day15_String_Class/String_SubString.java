package day15_String_Class;


//substring : ++>> creates to subString of the String
/*
1. substring(begin index, end index) :
from begining index till ending index (ending is excluded)



2. substring(begininindex); from begining index till end../

 */
public class String_SubString {


    public static void main(String[] args) {

 String rt="Cybertek School is fanoo jhkj";

        System.out.println(rt.substring(rt.indexOf("S"), rt.indexOf("l")+1));

String name="MUHTAR";
        System.out.println(name.substring(0, 1).concat(name.substring(1, name.length()).toLowerCase()));
String fullname="Selman UGUZ";

String firstName=fullname.substring(0, fullname.indexOf("n")+1);
String lastName=fullname.substring( fullname.indexOf("U"), fullname.length());

        System.out.println(firstName + " "+lastName );
    }
}
