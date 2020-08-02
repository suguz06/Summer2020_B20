package day15_String_Class;

import org.omg.CORBA.WStringSeqHelper;

//toLowerCase();  convert to all string to lower case
//toUpperCase(); covert to Upper case
public class String_LowerCase {

    public static void main(String[] args) {


        //toLowerCase() ==>> gives new object all of lower case
 String st="CBYERTEK123 33CCBBByy";

        System.out.println(st.toLowerCase().toUpperCase().equalsIgnoreCase(st));
//toUpperCase()

        String rt="  skjkj EE, kkj 12 TT  ";

        System.out.println(rt.substring(0, 1).toUpperCase());

        // trim(); remove un used space from returns new string
        //white spaces (unused)
// will not rim the spcases between words

     String aa="   ssssssss  ssssssssssss  1212313    ";
      aa.trim();

        System.out.println(aa.length());
        System.out.println(aa.trim().length());


    }


}



