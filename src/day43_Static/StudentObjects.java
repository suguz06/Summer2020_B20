package day43_Static;

public class StudentObjects {
    public static void main(String[] args) {


        CybertekStudents obj1 = new CybertekStudents();
        obj1.studentName = "Ivan";
        CybertekStudents obj2 = new CybertekStudents();
        obj2.studentName = "Chris";

        System.out.println(obj1.studentName);
        System.out.println(obj2.studentName);

        System.out.println(obj1.schoolName);
        System.out.println(obj2.schoolName);
        System.out.println(CybertekStudents.schoolName); //call by class name



    }
}