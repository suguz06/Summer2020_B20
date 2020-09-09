package day51_Exceptions;

//not ever method overriding=> constructor can nat be overriding
// instance method overrdiing==> only instane since it is related object

//private not final can not override

//static can not overriding=> since it is not related object => static belogns class

// overriding=> same name, same arg and same return type( 1 method in memory)
//For SuperClass
// For sub-class=> Accesss M=>> same or more visible exp> public then must public

// if default AccessM==> then default, protected, public should be

//if private=> no accsess to private=> since it is reach in the class

class  A {
//static not overrride=> not belong the object it is related class
    public   void method(){ // if in the sub class=> then overriding

    }
}


public class MethodOverriding  extends A { // happens in the sub-class, not same class

@Override // check the overriding is true works or not
public void method(){

}
@Override // it is implicilty done java.lang package
public String toString(){
    return "0";
}



}
