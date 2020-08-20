package day44_Constructor;

import java.util.ArrayList;
import java.util.Arrays;
import static day44_Constructor.HumanResource.*; /// import all static from class
public class BankOfAzerbajian {


    public static void main(String[] args) {


        ArrayList<Employee1> list=new ArrayList<>();
//        list.add(HumanResource.employee1);
//        list.add(HumanResource.employee2);
//        OR
        list.addAll(Arrays.asList( employee1, employee2, employee3));
// static import call all static members==> so we can use just humanresource elements

//         list.addAll(Arrays.asList( HumanResource.employee1,
//                 HumanResource.employee2, HumanResource.employee3));
//         or by calling class name==> then use elements=>no need to import static class


        System.out.println("Total number Employees: "+ list.size());
        System.out.println(list);

for (Employee1 each: list) {
    System.out.println(each.name +" : "+each.salary);
}

    }
}
