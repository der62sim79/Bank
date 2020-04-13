package at.ta.Bank;

import java.util.Scanner;

public class CheckingAccount extends Account {
    private double overdraftFrame;

    public CheckingAccount(String accountName, double interest, double balance, String accountOwner, double overdraftFrame) {
        super(accountName, interest, balance, accountOwner);
        this.overdraftFrame = overdraftFrame;
    }

    public void withdrawChackingAccount() {
        System.out.println("Give please the amount for withdraw: ");
        Scanner scanner = new Scanner(System.in);
        double withdraw = scanner.nextDouble();
        double overdraft = this.getBalance() + this.overdraftFrame;
        if (withdraw > overdraft) {
            System.out.println("Your account does not have enough money");
        } else {
            accountPayment(withdraw);
        }
    }
}
