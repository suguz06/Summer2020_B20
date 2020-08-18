package day42_Static;

public class Student {

    String name;
    int age;
    int groupName;
    char gender;

    static String schoolName = "Cybertek";
    static String favoriteTeacher = "Ali";

    public void setInfo(String name, int age, int groupName, char gender) {
        this.name = name;
        this.age = age;
        this.groupName = groupName;
        this.gender = gender;
    }


    public String toString(){ //instance method
        return  "School Name: "+ schoolName+"\nName: "+ name+ " age "+age+" group name: "+groupName;
   //                           static variable         instance variable

    }

}
