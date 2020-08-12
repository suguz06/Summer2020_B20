package day39_CustomClass;

public class BankAccount {

    String accountName;
    double accountNumber, balance;

    public void deposit(double deposit){
        balance += deposit;
        System.out.println(deposit +" amount is deposited to the account. Total Balance is : "+balance);
    }
    public void withdraw(double amount){
        if(balance>=amount) {
            balance -= amount;
            System.out.println(amount + " is withdrawn. Remaining balance is: " + balance);
        }else{
            System.out.println("insufficient balance");
        }
    }
    public void checkBalance(){
        System.out.println("Total balance is "+balance);
    }
}
