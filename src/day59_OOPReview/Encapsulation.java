package day59_OOPReview;

import java.time.LocalDate;

public class Encapsulation {//data hiding by using private keyword


    private int ssn;




    private final LocalDate DOB=LocalDate.of(2020, 9, 8); //Can not modified

    public LocalDate getDOB() {
        return DOB;
    }


    // NO SETTER METHOD OF FINAL DATA=> NO MODIFY



    public  int getSsn() { //only read => it is instance method
        // => since data can be instance of static
        return ssn;
    }

    public void setSsn(int ssn) {// set or modify the data
        this.ssn = ssn;
    }

    //final variable=> read only (getter) but not modified NO SETTER method
}


// EXAMPLE=> 20 Variable=> 10 is FINAL=> 20 GETTER but 10 SETTER (Since 10 final has no setter )