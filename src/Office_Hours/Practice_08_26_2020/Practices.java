package Office_Hours.Practice_08_26_2020;

public class Practices {


    public static void main(String[] args) {
        int [] arr1= {1,2,3,4,5};

        for (int i = 0; i < arr1.length ; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        int[] arr2= {2,3,4,5};

        for (int each: arr2) {
            System.out.print(each+ " ");
        }

        System.out.println();

        int [] arr3= {4,5,67,4};

        for (int each: arr3) {
            System.out.print(each+" ");
        }
// better way to give a method ==>> no need to write again for loop


    }
}
