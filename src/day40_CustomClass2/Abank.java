package day40_CustomClass2;

import java.util.ArrayList;
import java.util.Arrays;

public class Abank {

    public static void main(String[] args) {


        BankAccount2[] accArr = {new BankAccount2(), new BankAccount2(), new BankAccount2()};

accArr[0].setInfo("Happy", 0225744, 51203.20);
        accArr[1].setInfo("Happy", 0225744, 51203.20);
        accArr[2].setInfo("Happy", 0225744, 51203.20);
        for (BankAccount2 each: accArr) {
            each.getInfo();
        }

        for (BankAccount2 each: accArr) {
            each.witdraw(520);
        }

        for (BankAccount2 each: accArr) {
            each.deposit(5622);
        }

        for (BankAccount2 each: accArr) {
            each.checkBalance();
        }

        System.out.println("====================");

        ArrayList<BankAccount2> list= new ArrayList<>(Arrays.asList(accArr));

        for ( BankAccount2 each: list) {
            each.getInfo();
        }

        for ( BankAccount2 each: list) {
            each.checkBalance();
        }
    }
}
