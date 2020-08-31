package day48_Inheritance;


class A   { // A extends B not possible ==> A extends Inheritance1
static int a=20; // one variable
}

class B extends  A{ // one class can only extend one class => B not extends C

static int b=20; //variables a,b
}

class C extends B{ //C grand child of A  =>> class C is the richest:)
    static int c=30;  //variables a,b,c
}

public class Inheritance1 extends B{  // A grandparent of Inheritance1


}
