package day47_Encapsulations;

public class EmployeeObject {

    public static void main(String[] args) {

        CapitalOneEmployees obj=new
                CapitalOneEmployees("helen",23,"QA");


        System.out.println(obj.companyName);
        obj.setID(123);
    obj.setAddress("234 jhfjdhf ");
    obj.setSalary(125000.36);

        // no needed public variables
        System.out.println(obj.age);
        System.out.println(obj.employeeName);
        System.out.println(obj.jobTitle);

        System.out.println("======for private datas we need getter and setter mthod=====");
        //getter needed  for private variables
    System.out.println(obj.getAddress());
        System.out.println(obj.getSalary());
        System.out.println(obj.getID());

       // System.out.println(obj);//needed toString Method to print

        System.out.println(obj);
    }
}
