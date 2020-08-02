package day24_Array;

/*
Write a program that can return the
longest string of text from a String array
 */
public class LongestString_Array<i> {
    public static void main(String[] args) {


        String arr[] = {"ssddd", "sds12123121", "dsfd3333"};
        String result = "";
        String result1 = "";
        int max=arr[0].length();
        int min=arr[0].length();
        for (int i = 0; i <= arr.length-1; ++i) {
            if (arr[i].length()>=max) { max=arr[i].length();
                 if(arr[i].length()==max) result=arr[i];
            }
            if (arr[i].length()<=min) { min=arr[i].length();
                if(arr[i].length()==min) result1=arr[i];
            }
        }
        System.out.println("max size string "+max+ " "+result);
        System.out.println("min size string"+ min+ " "+result1);


    }
}