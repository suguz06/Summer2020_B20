package day40_CustomClass2;

public class BankAccount2 {


    /*
    Attributes: AccountName, AccountNumber:  Balance
     */

    String accountName;
    double accountNumber;
    double balance;

    public void setInfo(String accName, double accNumber, double accBalance ) {
        accountName=accName;
                accountNumber=accNumber;
                        balance=accBalance;
    }

    public void  getInfo(){
        System.out.println("Account Name: "+ accountName+ " account number: " +accountNumber + " balance: "+ balance);
    }

    public void deposit(double depositAmount) {
        balance +=depositAmount;
        System.out.println("deposit amount: " + depositAmount+ " total balance: "+ balance);

    }

    public void witdraw(double withdrawAmount) {

        if (balance>=withdrawAmount) {
            balance -=withdrawAmount;
            System.out.println("you withdraw: "+ withdrawAmount + " and remaining  balance: "+ balance);
        } else {
            System.out.println("you do not have enough balance");
        }
    }

    public void  checkBalance() {

        System.out.println("your total balance: " +balance);
    }

}
