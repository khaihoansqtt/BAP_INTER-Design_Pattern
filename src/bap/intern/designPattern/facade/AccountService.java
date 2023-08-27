package bap.intern.designPattern.facade;

import bap.intern.designPattern.baseClass.Bank;
import bap.intern.designPattern.baseClass.Customer;
import bap.intern.designPattern.baseClass.Account;
import bap.intern.designPattern.factory.AccountFactory;
import bap.intern.designPattern.factory.PassTypeAccountFactory;

public class AccountService {
    public Bank bank;
    public AccountFactory factory;

    public AccountService() {
        bank = Bank.getBank();
        factory = new PassTypeAccountFactory();
    }

    public AccountFactory getFactory() {
        return factory;
    }

    public void setFactory(AccountFactory factory) {
        this.factory = factory;
    }

    public void createAccount(Customer customerCreateAccount, String type, String accountNumber, double balance) {

        boolean isAccountExisted = bank.getCustomers().stream().flatMap((customer) -> {
            if (customer.getAccounts() != null) {
                return customer.getAccounts().stream();
            } else return null;
        })
                .anyMatch((account) -> account.getAccountNumber().equals(accountNumber));

        if (!isAccountExisted) {
            Account newAccount = factory.createAccount(type, accountNumber, balance);
            customerCreateAccount.getAccounts().add(newAccount);
        } else {
            System.out.println("So tai khoan da ton tai");
        }
    }

    public Account getAccount(Customer customer, String accountNumber) {
        for (Account account : customer.getAccounts()) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }
}
