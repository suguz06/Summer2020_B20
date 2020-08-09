package day16_String;



/*
indexOf() ==>> return integer and gives the index of the char

note: if no match ==>> gives -1. this means there is no this char
 */
public class IndexOf_Method {

    public static void main(String[] args) {

        String s="I like to stay in Cybertek, we are learning Java";

        System.out.println(s.indexOf("ar")+12);


// lastIndexOf() ; returns last index of macthes
        String s1= "Java, I like to learn Java, Java is cool, Java is fun";

        int b= s.indexOf("rn");
        System.out.println(b);
int a= s.lastIndexOf("r");
        System.out.println(a);
        System.out.println(s1.indexOf("J"));
        System.out.println(s1.lastIndexOf("J"));
        int c= s1.indexOf("Java is fun");
        System.out.println(c);


        String ss="Java";

        double ra=ss.indexOf("a");

       // char ch=ss.charAt(a); // gives error
        char ch=ss.charAt((int)ra); // u have to explicit casting

        System.out.println(ra);

    }
}
