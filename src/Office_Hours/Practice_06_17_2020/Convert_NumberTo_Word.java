package Office_Hours.Practice_06_17_2020;


/*

write a java program that can convert numbers between 0 ~ 9 to words,
    if the number is greater than 9 or less than zero, out put should be "Invalid".
                DO NOT USE IF STATEMENTS

 */
public class Convert_NumberTo_Word {

    public static void main(String[] args) {

        int num=510;

String result="";

result= num==1? "one": num==2? "two": num==3? "three": num==4? "four": num==5? "five": num==6? "six": num==7? "seven": num==8? "eight": num==9? "nine": "invalid";

        System.out.println(result);



    }




}
