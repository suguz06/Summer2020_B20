package day44_Constructor;

public class ConstructorIntro {



//    public ConstructorIntro(){
//
//    }

//    public ConstructorIntro(int num){
//
//    }

    public ConstructorIntro(String str){
        System.out.println("hello "+ str);
        System.out.println("how are u "+ str);
    }

    public static void main(String[] args) {

        //ConstructorIntro obj=new ConstructorIntro(6);

        ConstructorIntro o1=new ConstructorIntro("Selman");
        ConstructorIntro o2=new ConstructorIntro("ali");
        ConstructorIntro o3=new ConstructorIntro("Alan");
        ConstructorIntro o4=new ConstructorIntro("Kean");

    }


}
