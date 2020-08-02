package Office_Hours.Practice_07_20_2020;

public class Max_2D_ArrayForandForEach {

    public static void main(String[] args) {

        int[][] arr2D = {{1, 2, 3}, {2, 3, 4}};

        int max = arr2D[0][0];


        for (int i=0; i<=arr2D.length-1;++i){
            for (int a : arr2D[i]) {
                if (a > max) max = a; } }
        System.out.println(max);
    }
}
