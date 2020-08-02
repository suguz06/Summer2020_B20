package Library;

public class CustomMethods2 {

    public static void MaxNum(int[] arr) {

//        Arrays.sort(arr);
//        max=arr [arr.length-1 ];
        int max=arr[0];

        for(int each:arr) {
            if(each>max) max=each;
        }
        System.out.println("Max is "+ max);



    }


    public static void MinNum(int[] arr) {

//        Arrays.sort(arr);
//        min=arr [0 ];
        int min=arr[0];

        for(int each:arr) {
            if(each<min) min=each;
        }
        System.out.println("Min is "+ min);



    }

}
