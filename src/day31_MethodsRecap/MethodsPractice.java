package day31_MethodsRecap;

public class MethodsPractice {


    public static void main(String[] args) {

       int a=1000;
        max(a, 20);
        max2(1,3);
        //System.out.println(max(1, 2)); void type ==>>no return

        System.out.println(20*
                max2(3, 3));
    }
//void
    public static void max(int a, int b){

        int max=a>b? a:b;
        System.out.println(max);

    }
//return type
    public static int max2(int a, int b){

        int max=a>b? a:b;
        System.out.println(max);
return max;
    }

}
