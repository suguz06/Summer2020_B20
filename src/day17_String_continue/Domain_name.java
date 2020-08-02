package day17_String_continue;

import java.util.Scanner;

/*
 write a program that will return the domain of an email address:
            Ex:
                input: test@gmail.com
                output: the domain of the email is: gmail
                inputL: Cybertek@yahoo.com
                output: the domain of the email is: yahoo
 */
public class Domain_name {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your email: ");
        String email= scan.next();

        String domainName=email.substring(email.indexOf("@")+1, email.lastIndexOf("."));

        System.out.println(domainName);
    }
}
