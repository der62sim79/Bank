package at.ta.Bank;


public class Account {
    private String accountName;
    private double interest;
    private double balance;
    private String accountOwner;

    public Account(String accountName, double interest, double balance, String accountOwner) {
        this.accountName = accountName;
        this.interest = interest;
        this.balance = balance;
        this.accountOwner = accountOwner;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getInterest() {
        return interest;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public double depositAccount(double amount) {
        this.balance = this.balance + amount;
        return balance;
    }

    public double accountPayment(double scanner) {
        this.balance = this.balance - scanner;
        return balance;
    }

    public void printAccountInfo() {
        System.out.println("Account: " + getAccountName());
        System.out.println("Balance: " + getBalance());
        System.out.println("Account Owner: " + getAccountOwner());
        System.out.println("------");
    }


    @Override
    public String toString() {
        return "Account Name " + accountName + "\n" +
                "Balance " + balance + "\n" +
                "Account Owner" + accountOwner;
    }

}
