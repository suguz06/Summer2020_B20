package Office_Hours.Practice_07_20_2020;

/*
Task:
    write a program that can find the maximum number from any given two dimensional array
        solution one: use nested for loops
        solution two: use nested for each loops
        solution three: use for loop and for each loop together

 */
public class Max_2DArray {

    public static void main(String[] args) {


        int[][] arr2D = {{1, 2, 3}, {2, 3, 4}};

        int max = arr2D[0][0];
        for (int[] c : arr2D){
            for (int a : c) {
                if (a > max) max = a; } }
        System.out.println(max);







    }


}
