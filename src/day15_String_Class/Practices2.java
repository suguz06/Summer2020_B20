package day15_String_Class;

public class Practices2 {

    public static void main(String[] args) {

        String str="BaCyber tek 1234B =**-- ";

        System.out.println(str.indexOf("--"));
        System.out.println(str.length()-1);
       //concat(String): concatanation

        System.out.println("wes".concat("lis").equalsIgnoreCase("weslis"));

        System.out.println( str.concat("hss"));

        System.out.println("wes"+"lis"=="weslis");
        System.out.println("wes".concat("lis")=="weslis");


        String stt="wer"+123+'a'+true;
// + : concat methods  ===>> many type concat in +, but concat just add string

        System.out.println(stt);

        String r="cyber".concat("tek");
        System.out.println(r);
    }
}
