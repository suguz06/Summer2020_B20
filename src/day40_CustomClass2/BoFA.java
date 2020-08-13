package day40_CustomClass2;

public class BoFA {
    public static void main(String[] args) {


        BankAcc Selman = new BankAcc();

        Selman.setAccountInfo("Saving",
                "Selman Uguz", "4654654654");
        Selman.getAccountInfo();
        Selman.deposit(600);
        Selman.checkBalance();

        System.out.println("==============");
        Selman.withdraw(600);

        System.out.println("==========");
        Selman.checkBalance();
Selman.withdraw(100);
    }
}
