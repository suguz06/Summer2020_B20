package day48_Inheritance;

public class BankAccount {

/*
 create costum class called BankAccount for Bank of America
            public variables:  bankName, firstName, lastName
            private variables: accountHolder, accountNumber, balance
            encapsulate all the private data
                    (DO NOT USE SHORTCUT)
            create a constructor that can initialize firstName and lastName
                    (DO NOT USE SHORTCUT)
            action:
                    deposit
                    withdraw
                    availableBalance
 */

    public static String bankName;

    static {
        bankName = "Bank of America";
    }

    public String firstName;

    public String lastName;

    public BankAccount(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    private String accountHolder;
    private long accountNumber;
    private double balance;

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;

    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double add) {
        System.out.println("Depositing " + add);
        balance += add;
    }

    public void withdraw(double withdraw) {

        if (withdraw <= 0|| withdraw>1000) {
            System.out.println("Invalid amount");
            return;
        }

        if (withdraw > balance) {
            System.out.println("not enough balance");
            return; //exit the method ==>> break==> exit loop
        }

        System.out.println("Withdrawing $"+withdraw);
        balance -=withdraw;
//        if(withdraw<0) {
//            System.out.println("invalid amount");
//        }
//        else if(withdraw>balance) System.out.println("not enough balance");
//          else {
//              balance -=withdraw;
//        }

    }

//    public double availableBalance() {
//        return getBalance(); //since it is private, we need getter of balance
//    }
    public void availableBalance(){
        System.out.println("Available balance: "+ getBalance());
    }

    public String toString() {
        return bankName +
                "\n==================================================="+
                "\n"+firstName + " " + lastName +
                "\nAccount Number: "+getAccountNumber()+
                "\n==================================================="+
                "\nBalance: $"+getBalance();

    }



}
