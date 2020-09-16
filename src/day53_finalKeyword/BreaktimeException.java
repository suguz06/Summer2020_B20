package day53_finalKeyword;

public class BreaktimeException extends RuntimeException { //custom unchecked exception


    public BreaktimeException() {
        super("It is time for a break");
        System.err.println("Time to take 15 minutes break");
    }
    public BreaktimeException(String str){
        //System.err.println("Time to take 15 minutes break");
        super(str); //super proirity is first
        System.err.println("Time to take 15 minutes break");
    }





}


class Test{

    public static void main(String[] args) {

       // new RuntimeException("This is Runtime Exection");

        // throw new BreaktimeException( "You need to gives a break");  //no call constructor


        //System.out.println("Test completed"); without solution we colud reach

        //throw new Test();

        throw new BreaktimeException("It's been 45 minutes");
    }
}
