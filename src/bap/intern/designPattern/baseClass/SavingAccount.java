package bap.intern.designPattern.baseClass;

public class SavingAccount extends Account {
    public SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance, "SAVING");
    }
}
