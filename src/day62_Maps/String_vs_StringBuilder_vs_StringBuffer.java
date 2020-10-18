package day62_Maps;

public class String_vs_StringBuilder_vs_StringBuffer {

    public static void main(String[] args) {

// 2 ways to create object=> literals and new keyword
        // => the other objects one way => new keyword

        //String is char sequence + immutable
        //String builder is char sequence + not immutable
        //String buffer  is char sequence + not immutable

        String s1 = "Cybertek";
        s1.concat("School"); //Cybertek School => not asssigned=> GC destroyed later

        System.out.println(s1);//Cybertek => not assigned=> immutable


        System.out.println("===============");
 // so many modify methods => delete etc

        StringBuilder sb1 = new StringBuilder("Cybertek");
        sb1.append(" Scholl"); //it modify object => not immutable

        sb1.reverse(); // not immutable=> reverse
        System.out.println(sb1); //Cybertek Scholl


        System.out.println("========");

        String name="kayak";
        String reversedName=new StringBuilder(name).reverse().toString();

        System.out.println(reversedName.equalsIgnoreCase(name));

    //converting String to Stringbuilder

        String a1="Friday";
        StringBuilder s2=new StringBuilder(a1);

        //convert to stringbuilder to String => toString() method


    String  s3=s2.toString();

        System.out.println("==================");

        StringBuffer t1=new StringBuffer("aaaa");




    }
}
