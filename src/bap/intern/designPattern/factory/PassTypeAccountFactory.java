package bap.intern.designPattern.factory;

import bap.intern.designPattern.baseClass.Account;
import bap.intern.designPattern.baseClass.LoanAccount;
import bap.intern.designPattern.baseClass.SavingAccount;

public class PassTypeAccountFactory implements AccountFactory{
    public Account createAccount(String type, String accountNumber, double balance) {
        switch (type) {
            case "SAVING": return new SavingAccount(accountNumber, balance);
            default: return new LoanAccount(accountNumber);
        }
    }
}
