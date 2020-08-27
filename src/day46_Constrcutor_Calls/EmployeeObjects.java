package day46_Constrcutor_Calls;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1=new Employee("Selman");
        System.out.println(employee1);
        System.out.println("===========");
        Employee employee2=new Employee("Selman","QA");
        System.out.println(employee2);
        System.out.println("===========");
        Employee employee3 =new Employee("Ali","SDET", 123);

        System.out.println(employee3);

        System.out.println("=========");

        Employee employee4= new Employee("Alex","SDET",123456,135_000.5);
        System.out.println(employee4);

        ArrayList<Integer> list1=new ArrayList<>();

        ArrayList<Integer> list=new ArrayList<>(list1);
        ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(1,2,34,5));

    }

}
