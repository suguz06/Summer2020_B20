package day56_Abstraction.PhoneTask;

public class PhoneObjects {

    public static void main(String[] args) {


        IPhone iPhone = new IPhone("x", 600, "12");

        //  IPhone iPhone1=new IPhone( "8", 0, "45");

        Samsung samsung = new Samsung("Galaxy", 500, "12");

        //System.out.println(iPhone1);
        System.out.println("iPhone = " + iPhone);
        System.out.println("samsung = " + samsung);

        samsung.calling(1212, 4544);

        iPhone.calling(4545454,8787847);


    }
}
