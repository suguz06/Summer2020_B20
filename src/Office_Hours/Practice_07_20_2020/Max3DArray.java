package Office_Hours.Practice_07_20_2020;

public class Max3DArray {

    public static void main(String[] args) {

        int[][] [] arr3D = { { {1, 2, 33}, {1, 2, 3}, {1, 2, 3}} ,{ {1, 62, 33}, {1, 2, 63}, {1, 82, 3}} };

        int maxx = arr3D[0][0][0];
        for(int[] [] aa: arr3D)
            for (int[] bb : aa){
                for (int cc : bb) {
                    if (cc > maxx) maxx = cc; } }
        System.out.println(maxx);
    }
}
