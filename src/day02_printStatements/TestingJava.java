package day02_printStatements;



public class TestingJava {



    public static void main(String[] args)
    {
        int[][] a = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };

        int[] sums = rowSums(a);

        for(int sum : sums)
            System.out.println(sum);
        //this should print 4 6 11 3
    }

    public static int[] rowSums(int[][] nums)
    {
        // write your codes here

        int[] s=new int[4];
        s[0]= nums[0][0]+nums[0][1]+nums[0][2];
        s[1]= nums[1][0]+nums[1][1]+nums[1][2];
        s[2]= nums[2][0]+nums[2][1]+nums[2][2];
        s[3]= nums[3][0]+nums[3][1]+nums[3][2];

        return s;

    }
}



