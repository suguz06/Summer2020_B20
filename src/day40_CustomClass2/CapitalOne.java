package day40_CustomClass2;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {

    public static void main(String[] args) {

        BankAcc Ali=new BankAcc();
        BankAcc Veli=new BankAcc();
        BankAcc Deli=new BankAcc();
        BankAcc Zeli=new BankAcc();
        BankAcc Seli=new BankAcc();

        Ali.setAccountInfo("Saving", "Ali", "12121");
        Veli.setAccountInfo("Saving", "Veli", "124421");
        Deli.setAccountInfo("Checking", "Deli", "1321");
        Zeli.setAccountInfo("Saving", "Zeli", " 2321");
        Seli.setAccountInfo("Checking", "Deli", "4121");

        ArrayList<BankAcc> accounts= new ArrayList<>();
       accounts.addAll(Arrays.asList(Ali,Veli,Deli,Zeli,Seli));


       for (BankAcc each: accounts) {
           each.deposit(500);
           each.getAccountInfo(); }

       accounts.get(3).deposit(10000);
       accounts.get(3).checkBalance();
       accounts.get(3).withdraw(9000);
        accounts.get(3).checkBalance();

accounts.get(4).deposit(600);
accounts.get(4).checkBalance();

        System.out.println("Removed==================");

        accounts.removeIf(p-> p.balance<1000);
        System.out.println("Size: "+ accounts.size());

        for (BankAcc each:accounts) {
            each.getAccountInfo();
        }

    }
}
