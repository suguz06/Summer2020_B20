package Library;

import day47_Encapsulations.AccessModifiers;


public class Test_AccessModifiers {
// for another packgae==> you import pack.class name
    public static void main(String[] args) {
        System.out.println("AccessModifiers.publicVariable = " + AccessModifiers.publicVariable);
   AccessModifiers.publicMethod();

// give Error=>> not reachable default methods and variabnles
      //  System.out.println(AccessModifiers.defaultVariable);
       // AccessModifiers.defaultMethod;



     // private==>>>  not visible another package
       // System.out.println(AccessModifiers.privateVariable);
       // AccessModifiers.privateMethod;


    }
}
