package Office_Hours.Practice_09_15_2020;


class Data{

    public void methodA(){
        System.out.println("Method A");
    }
}


class  Test extends Data{

    // inherited => methodA()

    public void methodB(){
        System.out.println("Method B");
    }

    public static void main(String[] args) {


        Data obj= new Data();

        obj.methodA();
       // obj.methodB();  //complile Error since it does not belong to DaTa class

   Test obj2=new Test();
   obj2.methodB();
   obj2.methodA();



    }





}



public class Quiz {
}
