package day37_ArrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {

        ArrayList<String > names= new ArrayList<>();

        names.addAll(Arrays.asList("Anna", "Canada", "Bob", "Ayse", "Con"));


        // remove if last and first character is different

        names.removeIf(p-> p.toLowerCase().charAt(0) != p.charAt(p.length()-1));
        System.out.println(names);


        System.out.println("================");

        ArrayList<Integer> grades=new ArrayList<>();

        grades.addAll(Arrays.asList(70,80,90,99,47,55,97,100,87,55,78,34,56,69));

        ArrayList<Integer> gradeA= new ArrayList<>(); //90-100
gradeA.addAll(grades);
gradeA.removeIf(p-> !(p>=90 && p<=100) );

        System.out.println(gradeA);


        ArrayList<Integer> gradeB= new ArrayList<>(); //80-89

        gradeB.addAll(grades);
        gradeB.removeIf(p-> !(p>=80 && p<90) );

        System.out.println(gradeB);

        ArrayList<Integer> gradeC= new ArrayList<>();//70-79
        gradeC.addAll(grades);
        gradeC.removeIf(p-> !(p>=70 && p<80) );

        System.out.println(gradeC);

        ArrayList<Integer> gradeD= new ArrayList<>();//60-69


        gradeD.addAll(grades);
        gradeD.removeIf(p-> !(p>=60 && p<70) );

        System.out.println(gradeD);

        ArrayList<Integer> gradeF= new ArrayList<>();//0-59

        gradeF.addAll(grades);
        gradeF.removeIf(p-> !(p>= 0 && p<60) );

        System.out.println(gradeF);

        System.out.println("Report Grades: \n"+
        "Grade A numbers: "+ gradeA.size()+ "\n"+
                "Grade B numbers: "+ gradeB.size()+ "\n"
        +"Grade C numbers: "+ gradeC.size()+ "\n"+
                "Grade D numbers: "+ gradeD.size()+ "\n"+
                "Grade F numbers: "+ gradeF.size());



        /*
        how many students made A? B?C?D?
        how many failed?
        dont use loop
         */


    }
}
