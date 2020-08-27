package Office_Hours.Practice_08_26_2020;

public class Practices2 {

    public static void main(String[] args) {


        int [] arr1= {1,2,3,4,5};

        int [] arr2= {13,14,15};

        int [] arr3= {11,2,13,14,51};

        printArray(arr1);
        printArray(arr3);
        printArray(arr2);

    }

    public  static void printArray(int[] arr){
        for (int each: arr) {
            System.out.print(each+" ");
        }
        System.out.println();
    }


}
