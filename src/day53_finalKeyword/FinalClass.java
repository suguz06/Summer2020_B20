package day53_finalKeyword;


//String class is immutable ==>


class C{  // final class can be child class

}




public final class FinalClass extends  C { // never parent

}


//class B extends FinalClass{ //final class can never be a parent class
//
//}

//final class can not be extended=> that is, no child class=> can not be super class=> but can be sub class

//class D extends String{ // String class is Final ==> can not have child class
//
//}