package day22_NestedLoop;


import java.util.Scanner;

/*


1. Write a program that asks user to enter his/her
 username and password until user enters  correctly.
                there are only three attempts
                after three attempts:  lock the account

 */
public class CeredentialWarmUP {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String username = "Cybertek";
        String password = "Abc123";
        int count=1;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter your username: ");
            String usName = scan.next();

            System.out.println("Enter your password: ");
            String pasW = scan.next();

            if (usName.equals(username) && pasW.equals(password)) {
                System.out.println("log in");
            } else if (usName.equals(username) && !pasW.equals(password)) {
                System.out.println("please write correct password");
            } else if (!usName.equals(username) && pasW.equals(password)) {
                System.out.println("please write correct username ");
            } else { if(i==3) continue;
                System.out.println("please write correct username and password");

            }
             count++;
        } if (count== 3) {
            System.out.println("lock the account");
            System.exit(0);
        }


//        or
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Enter your user name");
//        String u = scan.next();
//
//        System.out.println("Enter your password");
//        String p = scan.next();
//
//        int attempt = 1;
//
//        while(  !(u.equals("cyber") && p.equals("tek123"))  ){
//
//            if(attempt > 2){
//                System.out.println("Your account is locked");
//                System.exit(0);
//            }
//
//            System.out.println("Invalid user name or password, Please re-enter");
//            System.out.println("Enter your user name");
//            u = scan.next();
//
//            System.out.println("Enter your password");
//            p = scan.next();
//
//            attempt++;
//        }
//
//
//        System.out.println("Logged in");


    }
}
