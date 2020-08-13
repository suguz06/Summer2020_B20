package day40_CustomClass2;

/*
BankAccount
        attributes/data that can have are:
       0. AccountType         1. AccountHolder, 2. AccountNumber, 3. Balance

        Actions:
            1. CheckBalance,   2. deposit,  3. withdraw

          requiremnts:
            1. user should be able to deposit money into their account
            2. user should be able to withdraw money from their account
                2.1 if the withdrawing account is greater than available balance, 35$ penalty charge will be added
                2.2 if the balance is less than or equal to 0, user should not be able to withdraw money
            3. user should be able to see their balance

 */
public class BankAcc {
   String accountType;
    String accountHolder;
    String accountNumber;
    double balance;


 public void setAccountInfo(String accountType,
                            String accountHolder, String accountNumber ){

   this.accountType=accountType;
   this.accountHolder=accountHolder;
  this.accountNumber=accountNumber;
 }

 public void getAccountInfo(){
     System.out.println("========================");
     System.out.println("Account Type: "+ accountType);
     System.out.println("Account Holder: " +accountHolder);
     System.out.println("Account number: " + accountNumber);
     System.out.println("Available Balance: " + balance);
     System.out.println("========================");
 }

    public void checkBalance() {
        System.out.println("Total balance: "+ balance);
    }

    public void deposit(double amount ) {
        System.out.println("Depositing $"+amount+" to "+accountNumber);
     balance +=amount;

    }

    public void withdraw(double amount) {

     if(amount>balance) {
         System.out.println("you do not withdraw," +
                 " not enough balance"); return;
     }

        System.out.println("Withdrawing $" + amount + " from " + accountNumber);
     balance -=amount;



    }

}
