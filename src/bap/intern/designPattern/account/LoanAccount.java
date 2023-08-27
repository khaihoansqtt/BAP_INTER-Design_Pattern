package bap.intern.designPattern.account;

public class LoanAccount extends Account {
    public LoanAccount(String accountNumber) {
        super(accountNumber, 5000, "LOAN");
    }
}
