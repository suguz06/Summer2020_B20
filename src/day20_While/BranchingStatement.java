package day20_While;

public class BranchingStatement {

    public static void main(String[] args) {


        char ch = 'A';
        while (ch <= 'E') {

            if (ch == 'D') {
                ch++;
                continue; //skip all every thing in iterator
                //break;
            }
            System.out.print(ch + " ");

//
            ch++;
        }

//        if (true) {
//
//            System.exit(0); //exit the entire system
//        }
        boolean a = true;
        while (a) {
            System.out.println("Test Started");
            //break; //break just finished the loop
            System.exit(0);
        }
        System.out.println("completed");


    }
}
