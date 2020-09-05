package Library;

import day50_Override.AccessModifiers;

public class InheritanceTest extends AccessModifiers {


    public static void main(String[] args) {
        System.out.println(InheritanceTest.protectedData); //public
        System.out.println(InheritanceTest.publicData); //protected => inherited any child class, outside the package
   // protected is visible always only in child classs
      //  System.out.println(InheritanceTest.defaultData); //default=> no  outside the package


    }



}
