package Library;

import java.util.Arrays;
// import Library.Util;
public class Util{

    public static String removeDup(String str) {

        String nonDup = "";
        for (String each : str.split("")) {

            if (!nonDup.contains(each)) {
                nonDup += each;
            }
        }
         return nonDup;


    }   // removes the duplicates and returns the value string


    public static  String reverse(String str) {

        String reverse="";
        for(int i=str.length()-1; i>=0;--i) {

            reverse +=str.charAt(i);
        }
        return reverse;
    }


//    public static int frequency(String str, char ch) {
//
//        char[] arr=str.toCharArray();
//        int count=0;
//        for(char each: arr)
//        {
//            if(each==ch) {count++;}
//        }
//        return count;
//
//
//
//
//    }


    public static int frequency(String str, char ch){
        int count = 0;
        for(char each  : str.toCharArray() ){
            if(each == ch){
                count++;
            }
        }

        return count;
    }
    //  finds the frequency of char from string str and returns it as int


//    public static String uniques(String str) {
//
//        char[] arr=str.toCharArray();
//
//        String result="";
//        for(char ch: arr) {
//            int count=0;
//            for(char each: arr)
//            {
//                if(each==ch) {count++;}
//            }
//            if (count==1) result +=ch;
//        }
//        return result;
//
//    }


    public static String uniques(String str){
        String uniques = "";

        for(char each  : str.toCharArray() ){
            int count =frequency(str, each);  // frequency of every character
            if(count == 1){
                uniques += each;
            }
        }

        return uniques;
    }
    // retunrs the uniiques from the string

//    public static String frequencyOfChars(String str) {
//
//        char [] arr1=str.toCharArray();
//        String result="";
//        //first remove duplicate
//
//        String nonDup="";
//
//        for(char a:arr1){
//            if(!nonDup.contains(""+a)) {
//                nonDup +=a;
//            }
//        }
//
//        //check frequency of nonDup chars
//        char [] arr=nonDup.toCharArray();
//        for( char a: arr) {
//            int count=0;
//
//            for(char b: arr1) {
//                if(a==b)  count++;
//            }  result +=""+a+count;
//        } return result;
//
//
//    }


    public static String frequencyOfChars(String str){

        String expectedResult = "";
        String nonDup =    Util.removeDup(str);

        for(char each : nonDup.toCharArray() ){
            int count1 = Util.frequency(str, each);
            expectedResult +=   ""+ each + count1;
        }

        return expectedResult;
    }
    // returns the frequency of every single characters from a string

    public static String formatFullName(String firstName, String lastName ) {

        String fullName=firstName.toUpperCase().substring(0, 1)+firstName.toLowerCase().substring(1)+" "+
                lastName.toUpperCase().substring(0, 1)+lastName.toLowerCase().substring(1);

        return fullName;

    }
//return the formatted full name

    public static int maxNum(int[] arr) {

//        Arrays.sort(arr);
//        max=arr [arr.length-1 ];
        int max=arr[0];

        for(int each:arr) {
            if(each>max) max=each;
        }
        return max;



    }

    public static double maxNum(double[] arr) {

//        Arrays.sort(arr);
//        max=arr [arr.length-1 ];
        double max=arr[0];

        for(double each:arr) {
            if(each>max) max=each;
        }
        return max;



    }


    public static Integer maxNum(Integer[] arr) {

//        Arrays.sort(arr);
//        max=arr [arr.length-1 ];
       Integer max=arr[0];

        for(Integer each:arr) {
            if(each>max) max=each;
        }
        return max;



    }


    public static Double maxNum(Double[] arr) {

//        Arrays.sort(arr);
//        max=arr [arr.length-1 ];
        Double max=arr[0];

        for(Double each:arr) {
            if(each>max) max=each;
        }
        return max;



    }

    public static int minNum(int[] arr) {

//        Arrays.sort(arr);
//        min=arr [0 ];
        int min=arr[0];

        for(int each:arr) {
            if(each<min) min=each;
        }
        return min;



    }

    public static double minNum(double[] arr){
        double min= arr[0];

        for( double each : arr ){
            if(each < min){
                min = each;
            }
        }

        return min;
    }
    // find and returns the min number from double array

    public static Integer minNum(Integer[] arr){
        Integer min= arr[0];

        for( Integer each : arr ){
            if(each < min){
                min = each;
            }
        }

        return min;
    }
    // find and returns the min number from double array

    public static Double minNum(Double[] arr){
        Double min= arr[0];

        for( Double each : arr ){
            if(each < min){
                min = each;
            }
        }

        return min;
    }
    // find and returns the min number from double array



    public static int[] combine2Arrays(int[] arr1, int[] arr2) {

        int[] arr3= new int[arr1.length+ arr2.length];

        int i=0;
        for(int a: arr1) {
            arr3[i]=a;
            ++i;
        }

        for(int b: arr2){
            arr3[i]=b;
            ++i;
        }
        return arr3;

    }
//combine two int arrays return String array

    public static double[] combine2Arrays(double[] arr1, double[] arr2) {

        double[] arr3= new double[arr1.length+ arr2.length];

        int i=0;
        for(double a: arr1) {
            arr3[i]=a;
            ++i;
        }

        for(double b: arr2){
            arr3[i]=b;
            ++i;
        }
        return arr3;

    }
//combine two double arrays return String array

    public static char[] combine2Arrays(char[] arr1, char[] arr2) {

        char[] arr3= new char[arr1.length+ arr2.length];

        int i=0;
        for(char a: arr1) {
            arr3[i]=a;
            ++i;
        }

        for(char b: arr2){
            arr3[i]=b;
            ++i;
        }
        return arr3;

    }
    //combine two char arrays return String array

    public static String[] combine2Arrays(String [] arr1, String[] arr2) {

        String [] arr3= new String[arr1.length+ arr2.length];

        int i=0;
        for(String a: arr1) {
            arr3[i]=a;
            ++i;
        }

        for(String b: arr2){
            arr3[i]=b;
            ++i;
        }
        return arr3;

    }
//combine two String arrays return String array

    public static Integer[] combine2Arrays(Integer [] arr1, Integer[] arr2) {

        Integer [] arr3= new Integer[arr1.length+ arr2.length];

        int i=0;
        for(Integer a: arr1) {
            arr3[i]=a;
            ++i;
        }

        for(Integer b: arr2){
            arr3[i]=b;
            ++i;
        }
        return arr3;

    }
//combine two Double wrap class arrays return String array

    public static Double[] combine2Arrays(Double [] arr1, Double[] arr2) {

       Double [] arr3= new Double[arr1.length+ arr2.length];

        int i=0;
        for(Double a: arr1) {
            arr3[i]=a;
            ++i;
        }

        for(Double b: arr2){
            arr3[i]=b;
            ++i;
        }
        return arr3;

    }
//combine two Double wrap class arrays return String array

    public static Character[] combine2Arrays(Character [] arr1, Character[] arr2) {

        Character [] arr3= new Character[arr1.length+ arr2.length];

        int i=0;
        for(Character a: arr1) {
            arr3[i]=a;
            ++i;
        }

        for(Character b: arr2){
            arr3[i]=b;
            ++i;
        }
        return arr3;

    }
//combine two Double wrap class arrays return String array







    public static int[] descendingArray(int[] arr) {

        Arrays.sort(arr);

        int[] desc=new int[arr.length];

        int c=arr.length-1;
        for(int a: arr) {
            desc[c]=a;
            c--;
        } return desc;
    }

    public static int[] addElement(int[] arr, int num) {

        int[] arr1=new int[arr.length+1];
        int i=0;
        for(int a:arr) {
            arr1[i]=a;
            ++i;
        }
        arr1[i]=num;
        return arr1 ;
    }
    //return an added new array

    public static int[] sortDesc(int[] arr){
        Arrays.sort(arr);
        int [] desc =new int[arr.length];
        int i=arr.length-1;
        while(i>=0 ) {
            desc[arr.length-1 -i]=arr[i];
            --i;
        }
        return desc;
    }
    //sorts int array in descending order and return array


    public static Integer[] sortDesc(Integer[] arr){
        Arrays.sort(arr);
        Integer [] desc =new Integer[arr.length];
        int i=arr.length-1;
        while(i>=0 ) {
            desc[arr.length-1 -i]=arr[i];
            --i;
        }
        return desc;
    }
    //sorts int array in descending order and return array

    public static Double[] sortDesc(Double[] arr){
        Arrays.sort(arr);
        Double [] desc =new Double[arr.length];
        int i=arr.length-1;
        while(i>=0 ) {
            desc[arr.length-1 -i]=arr[i];
            --i;
        }
        return desc;
    }
    //sorts int array in descending order and return array


    public static Character[] sortDesc(Character[] arr){
        Arrays.sort(arr);
        Character [] desc =new Character[arr.length];
        int i=arr.length-1;
        while(i>=0 ) {
            desc[arr.length-1 -i]=arr[i];
            --i;
        }
        return desc;
    }
    //sorts double array in descending order and return array

    public static String[] sortDesc(String[] arr){
        Arrays.sort(arr);
        String [] desc =new String[arr.length];
        int i=arr.length-1;
        while(i>=0 ) {
            desc[arr.length-1 -i]=arr[i];
            --i;
        }
        return desc;
    }
//sorts String array in descending order and return array

    public static char[] sortDesc(char[] arr){
        Arrays.sort(arr);
        char [] desc =new char[arr.length];
        int i=arr.length-1;
        while(i>=0 ) {
            desc[arr.length-1 -i]=arr[i];
            --i;
        }
        return desc;
    }
//sorts char array in descending order and return array

}
