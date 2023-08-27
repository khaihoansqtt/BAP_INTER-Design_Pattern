package bap.intern.designPattern.baseClass;

import bap.intern.designPattern.withdrawStrategy.WithdrawStrategy;

public abstract class Account {
    private String typeAccount;
    private String accountNumber;
    private double balance;
    private WithdrawStrategy withdrawStrategy;

    public Account(String accountNumber, double balance, String typeAccount) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.typeAccount = typeAccount;
    }

    public String getTypeAccount() {
        return typeAccount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public WithdrawStrategy getWithdrawStrategy() {
        return withdrawStrategy;
    }

    public void setWithdrawStrategy(WithdrawStrategy withdrawStrategy) {
        this.withdrawStrategy = withdrawStrategy;
    }
}
