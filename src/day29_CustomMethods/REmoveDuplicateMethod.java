package day29_CustomMethods;

public class REmoveDuplicateMethod {

    public static void main(String[] args) {


removeDuplicate("aabbbaaaccc");
    }




    public static void removeDuplicate(String givenString) {

       //by char
        char[] c=givenString.toCharArray();
        String dupresult1="";


            for (char each1: c) {
                if( !dupresult1.contains(""+each1) ){
                    dupresult1 +=""+each1; }
            }
         System.out.println(dupresult1);


//by String

        String [] cc=givenString.split("");
        String dupresult="";


            for (String each1: cc) {
                if( !dupresult.contains( each1) ){
                    dupresult +=each1; }
            }
         System.out.println(dupresult);


    }
}
