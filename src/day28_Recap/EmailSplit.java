package day28_Recap;


import day26_MultiDimArray.SortDescending;

/*
3. write a program that can get the name and
domain of any given email address
        Ex:
            cybertek@gmail.com
            output:
                name: cybertek
                domain: gmail
 */
public class EmailSplit {


    public static void main(String[] args) {

        String str="cybertek@gmail.com";

        String[] st=str.split("@");

        System.out.println("name: "+st[0] +"\n"+
                "domain: "+ st[1].substring(0, st[1].indexOf(".")));

//also
  String str2="cyber.tek@gmail.com";

        String name=str2.substring(0, str2.indexOf("@"));
String domain=str2.substring(str2.indexOf("@")+1, str2.lastIndexOf("."));

        System.out.println(name);
        System.out.println(domain);
    }
}
