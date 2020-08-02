package day23_Array;

public class Max_Min_Array {

    public static void main(String[] args) {


        int [] nums={10,20,-5,-8,98,56};
        int max=nums[0];
        int min=nums[0];
        for(int i=1; i<=nums.length-1;++i)
        {
            if(nums[i]>max) max=nums[i];
            if(nums[i]<min) min=nums[i];


        }
        System.out.println("max is "+ max + " min is:  " + min);

    }
}
