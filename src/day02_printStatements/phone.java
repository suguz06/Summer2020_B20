package day02_printStatements;

public class phone {

    static int number;

    public phone(String str){
        this(str.length());
    }


    public phone(int num){
        this();
        number+=num;
    }

    public phone() {
        number+=1;
    }
}

class callPhone{

    public static void main(String[] args) {
        new phone("iphone");
        new phone();
        new phone(4);
        System.out.println(phone.number);
    }
}
