package day47_Encapsulations;

public class Encapsulations {


    private long ssn=1234567;
    private String userName;


public long getSsn(){ // to read only ==>called GETTER => instance method, public and

 // int ssn=222;  if local ssn==> u must this keyword
    //return this.ssn;

    return ssn;
}

public void setSsn(long ssn) {// like a set method=> SETTER => void, public, => to modify(write only)
    this.ssn=ssn;
}


}
