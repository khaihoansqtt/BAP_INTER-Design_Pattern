package bap.intern.designPattern.baseClass;

public class LoanAccount extends Account {
    public LoanAccount(String accountNumber) {
        super(accountNumber, 5000, "LOAN");
    }
}
