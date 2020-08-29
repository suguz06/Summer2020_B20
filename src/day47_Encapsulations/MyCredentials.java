package day47_Encapsulations;

public class MyCredentials {


    public static void main(String[] args) {

        Credentials obj=new Credentials("Hayy", 23);

      ///  obj.username="cybertek"; no it is private

        obj.setUserName("cybertek");
        obj.setPassword("cybertek123");

       // System.out.println(obj.userName()); //no it is private

        System.out.println(obj.getUserName());
        System.out.println(obj.getPassword());

//following public ==> we can reach evey where, instance variables
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.companyName);


    }
}
