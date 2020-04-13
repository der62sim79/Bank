package at.ta.Bank;


public class PassbookNameSafety extends Account {
    private int fixedTerm;

    public PassbookNameSafety(String accountName, double interest, double balance, String accountOwner, int fixedTerm) {
        super(accountName, interest, balance, accountOwner);
        this.fixedTerm = fixedTerm;
    }

    public void interestCaluclation() {
        double finalAmount = 0.0;
        double passBookInterest = getInterest() / 100;
        for (int i = 1; i < this.fixedTerm + 1; i++) {
            finalAmount += this.getBalance() * passBookInterest;
            System.out.println("If you fixed your balance for " + i + " year you will get " + String.format("%.2f", finalAmount) + " €.");
        }
    }

}
