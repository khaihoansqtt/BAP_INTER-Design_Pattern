package bap.intern.designPattern.account.factory;

import bap.intern.designPattern.account.Account;
import bap.intern.designPattern.account.LoanAccount;
import bap.intern.designPattern.account.SavingAccount;

public interface AccountFactory {
    Account createAccount(String type, String accountNumber, double balance);
}
