package Office_Hours.Practice_09_16_2020;

public class ThrowKeyword {  //Interview Question-> difference throws and throw
//throws => handling to execption ==> throw=> create manullay execption
    public static void main(String[] args) {


        String browser="cybertek";

        if(!browser.equals("chrome")) {// gives an execption => not works line 14
            throw new RuntimeException(" there is no such a browser: " +browser);
        }

        System.out.println("Test start on "+ browser+ " browser");



    }

    public void method1() throws ClassNotFoundException {
        throw new ClassNotFoundException(); //checked exeception => use thwrow
    }


    public void method2() throws CloneNotSupportedException {
        throw new CloneNotSupportedException(); //chekced exp => use throws to handle
    } //throws hanldled all checked excp=> disadvangates temproray solution=> caller have to solve every time


    public void methdo3() throws Exception // all parent solve it
            //ClassNotFoundException, CloneNotSupportedException
    {
        method1(); // multiple throws needed
        method2();
    }
}
