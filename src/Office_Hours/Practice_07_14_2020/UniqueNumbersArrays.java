package Office_Hours.Practice_07_14_2020;

public class UniqueNumbersArrays {


    public static void main(String[] args) {

        int[] arr = {1, 3, 33, 3, 4, 1,9,4,7,8,9,5,77,44,55};

        for (int each : arr) {
            int count = 0; //frequency of each member of arr[i]=each
            for (int each1 : arr) { //counting the frequency

                if (each == each1) count++;


            }
            if (count == 1) System.out.println(each + " ");
        }


    }
}




