package day28_Recap;

/*
 1. write a program return the frequency of a word from a string
            ex:
                str = "JavajavaJAVA";
                word = "java";
                output:
                    3

 */

public class Freqn_NewApproach {


    public static void main(String[] args) {


        String str = "JavajavaJAVAjavajavajava".toLowerCase();


        int count=0;
        for(int i=0;i<str.length()/4;++i){
          if(str.substring(4*i, 4*i+4).equals("java"))
          {count++;}

        }
        System.out.println(count);



        int count1=0;
        for(int i=0;i<str.length();i+=4){
            if(str.substring( i,  i+4).equals("java"))
            {count1++;}

        }
        System.out.println(count1);

        int count2=0;
        for(int i=0;i<=str.length()-4;i+=1){
            if(str.substring( i,  i+4).equals("java"))
            {count2++;}

        }
        System.out.println(count2);


    }
}


