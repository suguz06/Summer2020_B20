package day35_ArrayList;

public class SumOfDigits {

    public static void main(String[] args) {

        String str="a1b2c3"; // result= 1+2+3 = 6
        int sum=0;

        for (int i=0; i<str.length(); ++i){
            char each=str.charAt(i);

            if(each>=48 && each<=57) {
                sum +=Integer.parseInt(each+"");
            }
        }
        System.out.println(sum);




    }
}
