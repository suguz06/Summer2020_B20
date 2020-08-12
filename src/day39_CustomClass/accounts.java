package day39_CustomClass;

public class accounts {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();
        BankAccount account4 = new BankAccount();
        account1.balance= 2500;
        account2.balance= 50000;
        account3.balance= 0;
        account4.balance= 500;
        account1.checkBalance();
        account2.checkBalance();
        account1.deposit(5000);
        account1.checkBalance();
        account2.withdraw(5000);
        account3.withdraw(5000);
    }

}
