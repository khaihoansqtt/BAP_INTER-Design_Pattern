package bap.intern.designPattern.factory;

import bap.intern.designPattern.baseClass.Account;

public interface AccountFactory {
    Account createAccount(String type, String accountNumber, double balance);
}
