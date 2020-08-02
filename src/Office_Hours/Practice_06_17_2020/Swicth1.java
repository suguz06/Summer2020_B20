package Office_Hours.Practice_06_17_2020;

public class Swicth1 {

    public static void main(String[] args) {



        char chr='b';
        String result="";


        switch (chr) {

            case 'A':
                System.out.println("one");
                result +='A';
                break;
            case 'B':
                System.out.println("B");
                result +='B';
            case 'C':
                System.out.println("C");
                result +='C';
            default:
                System.out.println("D");
                result="invalid";
        }

        System.out.println(result);
    }
}
