package day25_Loop_RECAP;

public class CountEvenOdd {

    public static void main(String[] args) {



        int[] nums={1,2,3,4,5,6,7, -111,-23,-20};

        int countsEven=0;
        int countOdd=0;
        String odd=""; String even="";
        for(long each:nums) {

//         if (each %2==0) { countsEven++;}
//         else {countOdd++;}
            if (each %2==0)  { countsEven++;
            even +=each+" ";
             }
           countOdd++; odd +=each+" ";

        }
        System.out.println("count odd "+countOdd+ ", odds are "+ odd);
        System.out.println("count even "+countsEven+ ", evens are " +even);


    }
}
