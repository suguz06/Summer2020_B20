package day46_Constrcutor_Calls;

public class ConstrutorCall4 {


    public ConstrutorCall4() {

        // this(); //can not call itself
    }

    public ConstrutorCall4(int a) {
        this(2.5);  //call double argument constructor
    }

    public ConstrutorCall4(double a) {
        //this(1);  ==>> call itself  => not possible
    }


}
