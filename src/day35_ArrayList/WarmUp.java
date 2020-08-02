package day35_ArrayList;
import Library.Util;
import java.util.ArrayList;

/*

Warmup tasks:
    1. write a program that can print the list of integers in reversed order
        ex:
            list=> {1,2,3,4,5}
            output: 5 4 3 2 1
    2. write a program that can return the sum of all the digits from a string
            ex:
                input: "a1b2c3"
                output: 6
                    (1+2+3= 6)
                input: "Today's date is 04/27/2020"
                output: 17
                    (0+4+2+7+2+0+2+0=17)
            HINT: on ascii table, the characters between #48 ~ #57 are digits

    3. write a program that can combine two String arrays into one arrayList
            ex:
                arr1 = {"A", "B", "C"};
                arr2 = {"D", "E", "F", "G"};
                list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */
public class WarmUp {

    public static void main(String[] args) {

        //task 1
        ArrayList<Integer> list= new ArrayList<>();

         for(int i=1; i<=5;++i) {
             list.add(i);
         }
        System.out.println(list);

        int k=list.size()-1;
         for(Integer each: list) {
             System.out.print(list.get(k)+ " ");
             --k;
         }

        System.out.println();
         //task 2

       int b= sumOfDigit("a1b2c3d4");
        System.out.println(b);

        String [] a1={"A", "B", "C"};
        String [] a2={"D", "E", "F", "G"};
        String [] c= Util.combine2Arrays(a1, a2);
        ArrayList<String > d=new ArrayList<>();

        for(int i=0;i<c.length; ++i) {
            d.add(c[i]);
        }
        System.out.println(d);
        arrayToList(c);
        System.out.println(arrayToList(c));
    }

    public  static int sumOfDigit(String str) {

        char [] arr=str.toCharArray();
        int sum=0;
        String result="";
        for(char a: arr) {
            if(a>=48 && a<=57) {
                sum += Integer.parseInt(a+"");
            }



        }
        return sum;


    }


    //task 3 method

    public static ArrayList<String > arrayToList(String[] a) {


        ArrayList<String > d=new ArrayList<>();

        for(int i=0;i<a.length; ++i) {
            d.add(a[i]);
        }
        return d;

    }


}
