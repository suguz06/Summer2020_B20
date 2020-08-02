package Office_Hours.Practice_07_20_2020;

public class Max2DForLoop {

    public static void main(String[] args) {


        int[][] arr2D = {{1, 2, 3}, {2, 3, 4}, {44,677,9}};

        int max = arr2D[0][0];

        for (int i = 0; i <= arr2D.length - 1; ++i) {
            for (int j = 0; j <= arr2D[i].length - 1; ++j) {
                if (arr2D[i][j] > max) max = arr2D[i][j];
            } }
        System.out.println(max);


        System.out.println("====");

        int min = arr2D[0][0];

        for (int i = 0; i <= arr2D.length - 1; ++i) { // i index of arrays
            for (int j = 0; j <= arr2D[i].length - 1; ++j) { //j is index of elements
                if (arr2D[i][j] < min) min = arr2D[i][j];
            } }
        System.out.println(min);


    }
}
