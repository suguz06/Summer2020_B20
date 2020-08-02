package day16_String;

public class String_Booleans {

    public static void main(String[] args) {

        //isEmpty() : retursn boolean gives true or not when empty or not

        String ss="Muhtar";
        String sss="";

        boolean aa=ss.isEmpty();
        boolean aaa=sss.isEmpty();

        System.out.println(aa);
        System.out.println(aaa);

        //equals(str) : check (visible text)the equality of char values not memory lcoations of strings (==)

        String r="Java";
        String rr=new String("Java");
        System.out.println(r==rr); //false since memory locations different
        System.out.println(r.equals(rr)); //true since all chars equals

//equalsIgnoreCase() ==>> no care about case sensitivity, just visibilty of texts

        String r1="JAVA";

        System.out.println(r.equalsIgnoreCase(r1)); //true
        System.out.println(r==r1); //false since case sensitivity
    // not YES, yeS, YEs all (8-cases) are ==>>yes, using equalsIgnoreCase() all are same




    }
}
