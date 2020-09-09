package Office_Hours.Practice_09_08_2020;

public class TestCases {


    public static void main(String[] args) {

        Credentials c1=new Credentials();
       // System.out.println(c1.userName); //compile error=> no direct access the private datas
       // System.out.println(c1.password);

        System.out.println(c1.getPasword());

        // we can not modify username
       // c1.UserName="Batch20" ==> we cannot modofy=> no direct accesss
        //just we need setter method

        c1.setUserName("Batch20");

        System.out.println(c1.getUserName()); // we get new user name=> Batch20



    }
}
