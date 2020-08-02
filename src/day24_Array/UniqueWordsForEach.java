package day24_Array;

public class UniqueWordsForEach {


    public static void main(String[] args) {

        String words[] ={ "C#", "C#", "Java", "C++", "Python", "Python","C#"};

    for(String each: words){
String a=each;
int count =0;
        for (String each1:
            words ) { String b=each1;

            if(a.equals(b)) {
                count++;
            }

        }if(count==1) System.out.println(a);
      // System.out.println( a+ " "+count);

    }








    }
}
