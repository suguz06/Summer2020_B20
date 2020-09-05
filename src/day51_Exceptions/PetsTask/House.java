package day51_Exceptions.PetsTask;

public class House { //has a relation with dog

    public static void main(String[] args) {

        Dog dog1=new Dog("Winton","Scotty Terrier",'M',4, "Black");


        System.out.println(dog1.name);
        System.out.println(dog1); // if you wan to dog class==> override in Dog class toString method


    }


}
