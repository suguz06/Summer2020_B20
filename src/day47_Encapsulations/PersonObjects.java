package day47_Encapsulations;

import java.time.LocalDate;

public class PersonObjects {

    public static void main(String[] args) {

        Person person1=new Person("Selman", 42, 'M', LocalDate.of(1978, 9, 15));

       // System.out.println(person1); => gives hashcode we need toString method

        System.out.println(person1);


        //person1.ssn; gives error==> private

        person1.setSsn(123555);
        person1.setID(123);
        person1.setAddress("TX");
        //System.out.println("person1.getSsn() = " + person1.getSsn());
        System.out.printf("SSN: ", person1.getSsn());
        System.out.println(person1.getID());
        System.out.println(person1.getAddress());


    }
}
