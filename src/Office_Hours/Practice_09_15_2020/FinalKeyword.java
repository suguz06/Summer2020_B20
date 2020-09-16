package Office_Hours.Practice_09_15_2020;

public class FinalKeyword {
//Interview Questions => how many getters and setters for private variable
// 5 private intances variable==> 3 of them final how many getter and setter

    private final int c=200;

    public int getC(){ //getter is final==> just read ONLY
        return c;
    }

//    public void setC(int c){ //Modified ONLY ==> but It can not be modified
//        this.c=c;
//    }
//


    /*
    5 private variables => 3 final

    how many getter: 5
    how many setter: 2

     */


    private  final String userName="cybertek";
    private final String passWord="cybertek123";

    public String getUserName() { // 2 gtter method but+> NO SETTER METHOD
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public static void main(String[] args) {

        final int a=100;

    }




}
class TestCase extends  TestBase{


     
}


class TestBase {

    public final void setUp(){

        System.out.println("setyo Browser");
        System.out.println("open Browser");

    }
}