package day29_CustomMethods;

public class MethodMinMaxOfArray {


    public static void main(String[] args) {
        int [] arr={1,3,4,6,7,11,34,22};
 minMax(arr );

    }

    public static void minMax(int[ ] arr){
        //int [] arr={1,3,4,6,7,11,34,22};
        int min=arr[0];
        int max=arr[0];

        for(int each: arr) {
            if(each>max) max=each;
            if(each<min) min=each;
        }
        System.out.println("Max of array is "+ max+ " Min of Array is "+ min);


    }




}



