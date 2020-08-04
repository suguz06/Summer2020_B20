package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeReport {


    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(45,78,56,88,89,99,10,18,78,100,70,65));


        ArrayList<Integer> gradeA = new ArrayList<>();

        gradeA.addAll(list);
       // gradeA.retainAll(Arrays.asList(99,100));
        gradeA.removeIf(p-> !(p>=90 && p<=100) ); // or p<90 ok
        System.out.println("Grade A: " + gradeA);

        ArrayList<Integer> gradeB = new ArrayList<>();
        gradeB.addAll(list);
        gradeB.removeAll(gradeA);
        gradeB.removeIf(p-> p<80 );
        System.out.println("Grade B: " + gradeB);
        ArrayList<Integer> gradeC = new ArrayList<>();

        gradeC.addAll(list);
        gradeC.removeAll(gradeA); gradeC.removeAll(gradeB);
        gradeC.removeIf(p-> p<70 );
        System.out.println("Grade C: " + gradeC);


        ArrayList<Integer> gradeD = new ArrayList<>();
        gradeD.addAll(list);
        gradeD.removeIf(p-> !(p>=60 && p<70));
        System.out.println("Grade D: " +gradeD);


        ArrayList<Integer> gradeF = new ArrayList<>();
        gradeF.addAll(list);
        gradeF.removeIf(p-> p>60);
        System.out.println("Grade F: " +gradeF);


    }
}
