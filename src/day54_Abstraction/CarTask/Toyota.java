package day54_Abstraction.CarTask;

public class Toyota extends Car{


    @Override // overriding compiler error gone=> not choosen as abstract => cuz we can not give any implementation
    public void start() {

        System.out.println("Starting Toyota by key ");

    }
}
