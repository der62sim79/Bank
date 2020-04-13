package at.ta.Bank;

import java.util.ArrayList;
import java.util.List;

public class BusinessCustomer extends Person {
    private List<Account> accounts;

    public BusinessCustomer(String name, int age, String adress, String password) {
        super(name, age, adress, password);
        this.accounts = new ArrayList<>();
    }

    public void printAllAccount() {
        System.out.println("---All Accounts from " + getName() + " ---");
        for (int i = 0; i < this.accounts.size(); i++) {
            System.out.println("Account: " + (i + 1));
            this.accounts.get(i).printAccountInfo();
        }
        System.out.println("---No more Accounts---");
    }


    public void addAccount(Account account) {
        this.accounts.add(account);
    }
}
