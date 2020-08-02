package day33_LocalDateTime;


import java.util.Arrays;

/*
Task01:
        1. create a method that can calculate the addition of two integers
        2. create a method that can calculate the addition of two decimals
        3. create a method that can calculate the multiplication of two integers
        4. create a method that can calculate the multiplication of two decimals
    Task02:
        1. create a return method that can return an int array in descending order
        2. create a return method that can return a double array in descending order
        3. create a return method that can return a String array in descending order
        4. create a return method that can return a char array in descending order
    Task03:
        1. create a method that can print out the unique numbers from an array of integer
        2. create a method that can print out the unique numbers from an array of double
        3. create a method that can print out the unique words from an array of String
        4. creata a method that can print out the unique characters from an array of chars


 */
public class WarmUps {

    public static void main(String[] args) {
        double[] a={13,41,4,4.1};
        String [] aa={"a", "a", "cvb","hjhd"};
        System.out.println(Arrays.toString(descending(aa)));
double [] a1={11,11,22,33,33,22,22,45,66};
char[] a2={'c','v','v','d'};

        System.out.println( uniques(a2));

        System.out.println((int)sum(90, 5.5));
        System.out.println(sum(5.6f, 6.5)+ multiplication(6, 3.2));

        int[] a8={1,2,3};
        Arrays.sort(a8);
    }


    public static int sum(int a, int b){
        return a+b;
    }

    public static double sum(double a, double b){
return a+b;
    }
    public static int multiplication(int a, int b){
        return a*b;
    }

    public static double multiplication(double a, double b){
        return a*b;
    }



    public static int[] descending(int[] arr){
        Arrays.sort(arr);
        int [] desc =new int[arr.length];
        int i=arr.length-1;
        while(i>=0 ) {
            desc[arr.length-1 -i]=arr[i];
            --i;
        }
        return desc;
    }

    public static double[] descending(double[] arr){
        Arrays.sort(arr);
        double [] desc =new double[arr.length];
        int i=arr.length-1;
        while(i>=0 ) {
            desc[arr.length-1 -i]=arr[i];
            --i;
        }
        return desc;
    }

    public static String[] descending(String[] arr){
        Arrays.sort(arr);
        String [] desc =new String[arr.length];
        int i=arr.length-1;
        while(i>=0 ) {
            desc[arr.length-1 -i]=arr[i];
            --i;
        }
        return desc;
    }


    public static char[] descending(char[] arr){
        Arrays.sort(arr);
        char [] desc =new char[arr.length];
        int i=arr.length-1;
        while(i>=0 ) {
            desc[arr.length-1 -i]=arr[i];
            --i;
        }
        return desc;
    }

public static String uniques(int [] arr) {
       String result="";
        for(int a: arr) {
            int c=0;
            for(int b: arr) {
                if(a==b) {
                    c++;
                }

            } if(c==1) result +=a+ "  " ;
        }  return result;

}
    public static String uniques(double [] arr) {
        String result="";
        for(double a: arr) {
            int c=0;
            for(double b: arr) {
                if(a==b) {
                    c++;
                }

            } if(c==1) result +=a+ "  " ;
        }  return result;

    }



    public static String uniques(String  [] arr) {
        String result="";
        for(String a: arr) {
            int c=0;
            for(String b: arr) {
                if(a.equals(b)) {
                    c++;
                }

            } if(c==1) result +=a+ "  " ;
        }  return result;

    }


    public static String uniques(char  [] arr) {
        String result="";
        for(char a: arr) {
            int c=0;
            for(char b: arr) {
                if(a==b) {
                    c++;
                }

            } if(c==1) result +=a+ "  " ;
        }  return result;

    }




}
