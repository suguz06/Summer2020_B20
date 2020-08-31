package day48_Inheritance;

public class BofA {

    public static void main(String[] args) {


        BankAccount bankAccount=new BankAccount("Selman", "Uguz");

       bankAccount.setAccountHolder(bankAccount.firstName+ " "+bankAccount.lastName);
        bankAccount.setAccountNumber(1234567);
        bankAccount.setBalance(50);

        bankAccount.availableBalance();
        bankAccount.deposit(500);

        bankAccount.availableBalance();
        bankAccount.withdraw(700);
        bankAccount.withdraw(-200);
        bankAccount.withdraw(0);
        bankAccount.withdraw(300);

        bankAccount.deposit(100000);
        System.out.println(bankAccount);

    }
}
