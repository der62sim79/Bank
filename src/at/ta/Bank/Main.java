package at.ta.Bank;



public class Main {

    public static void main(String[] args) {
        PrivateCustomer privateCustomer = new PrivateCustomer("Ali", 40, "Rheinstrasse", "hans000");
        PassbookNameSafety passbookNameSafety = new PassbookNameSafety("Sparbuch", 1.04,
                1000, "Ali", 4);
        CheckingAccount checkingAccount = new CheckingAccount("Girokonto", 1.0, 500.0,
                "Ali", 2000.0);

        privateCustomer.passwordQuery();

        privateCustomer.customerData();

        privateCustomer.addAccount(passbookNameSafety);

        passbookNameSafety.printAccountInfo();
        passbookNameSafety.depositAccount(500);
        passbookNameSafety.printAccountInfo();

        passbookNameSafety.interestCaluclation();

        privateCustomer.addAccount(checkingAccount);
        checkingAccount.withdrawChackingAccount();
        checkingAccount.printAccountInfo();

        privateCustomer.printAllAccount();

        BusinessCustomer businessCustomer = new BusinessCustomer("Otto", 40, "Rheinstraße", "1234");
        CreditAccount creditAccount = new CreditAccount("KreditKonto", 2.0, -100000.0,
                "Otto", 7);
        PassbookNameSafety passbookNameSafety1 = new PassbookNameSafety("Sparbuch", 2.0, 1000250,
                "Otto", 10);
        businessCustomer.passwordQuery();

        businessCustomer.customerData();

        businessCustomer.addAccount(creditAccount);

        creditAccount.printAccountInfo();
        creditAccount.calculateMonthlyPayment();

        businessCustomer.addAccount(passbookNameSafety1);
        passbookNameSafety1.interestCaluclation();

        businessCustomer.printAllAccount();
    }
}
