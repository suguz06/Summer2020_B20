package day11_NestedIf;

public class Numbers_To_Words {

    public static void main(String[] args) {

int number=2;


String result= number==0? "zero": number==1? "one": number==2? "two": number==3? "three": number==4? "four": number==5? "five": "six";


        System.out.println(result);
    }


}
