package day44_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObject {


    public static void main(String[] args) {

        Student student1=new Student("Mike",18,'M');
       // student1.setInfo("Mike", 18, 'M');

        Student student2=new Student("Rakhat",28,'F');
      //  student2.setInfo("Rakhat", 28, 'F');

        Student student3=new Student("Belek",30,'M');
      //  student3.setInfo("Belek", 30, 'M');

        ArrayList<Student> list=new ArrayList<>();
        list.addAll(Arrays.asList(student1,student2,student3));
        for (Student each: list) {System.out.println(student1); }

    }
}
