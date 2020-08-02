package Office_Hours.Practice_06_17_2020;

public class swicth_Statement {


    public static void main(String[] args) {


        int num=3;

        switch (num) {

            case 1:
                System.out.println("one");
                num +=3;
                break;

            case 2:
                System.out.println("two");
                num -=5;
                break;

            default:
                num %=5.0;
                System.out.println("son");
        }

        System.out.println(num);
    }
}
