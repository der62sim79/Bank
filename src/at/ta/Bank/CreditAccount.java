package at.ta.Bank;

public class CreditAccount extends Account {
    private int loanTerm;

    public CreditAccount(String accountName, double interest, double balance, String accountOwner, int loanTerm) {
        super(accountName, interest, balance, accountOwner);
        this.loanTerm = loanTerm;
    }

    public void calculateMonthlyPayment() {
        double interestRate = this.getInterest() / 100.0;
        double monthlyRate = interestRate / 12.0;
        int termInMonths = this.loanTerm * 12;
        double monthlyPayment = (getBalance() * monthlyRate) / (1 - Math.pow(1 + monthlyRate, termInMonths));
        System.out.println("---------");
        System.out.println("You must pay for your credit monthly: " + String.format("%.2f", monthlyPayment));
        System.out.println("---------");
    }
}
