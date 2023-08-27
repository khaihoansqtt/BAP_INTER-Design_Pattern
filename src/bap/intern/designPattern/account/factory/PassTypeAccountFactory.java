package bap.intern.designPattern.account.factory;

import bap.intern.designPattern.account.Account;
import bap.intern.designPattern.account.LoanAccount;
import bap.intern.designPattern.account.SavingAccount;

public class PassTypeAccountFactory implements AccountFactory{
    public Account createAccount(String type, String accountNumber, double balance) {
        switch (type) {
            case "SAVING": return new SavingAccount(accountNumber, balance);
            default: return new LoanAccount(accountNumber);
        }
    }
}
