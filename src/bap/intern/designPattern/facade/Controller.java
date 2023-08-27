package bap.intern.designPattern.facade;

import bap.intern.designPattern.BalanceChangeNotificationItem;
import bap.intern.designPattern.Customer;
import bap.intern.designPattern.account.Account;
import bap.intern.designPattern.notificationObserver.Notifier;

public class Controller {
    CustomerService customerService;
    AccountService accountService;
    WithdrawService withdrawService;
    NotifierService notifierService;

    public Controller(CustomerService customerService, AccountService accountService, WithdrawService withdrawService, NotifierService notifierService) {
        this.customerService = customerService;
        this.accountService = accountService;
        this.withdrawService = withdrawService;
        this.notifierService = notifierService;
    }

    public void createCustomer(int customerId, String name, int age, String phoneNumber, String emailAddress) {
        customerService.addCustomer(customerId, name, age, phoneNumber, emailAddress);
    }

    public void createAccount(int customerId, String type, String accountNumber, double balance) {
        Customer customer = customerService.getCustomerById(customerId);
        if (customer != null) {
            accountService.createAccount(customer, type, accountNumber, balance);
        } else {
            System.out.println("Khach hang khong ton tai");
        }
    }

    public void registerNotifier(int customerId, Notifier notifer) {
        Customer customer = customerService.getCustomerById(customerId);
        if (customer != null) {
            notifierService.addNotifier(customer, notifer);
        } else {
            System.out.println("Khach hang khong ton tai");
        }
    }

    public void removeNotifier(int customerId, Notifier notifer) {
        Customer customer = customerService.getCustomerById(customerId);
        if (customer != null) {
            notifierService.removeNotifier(customer, notifer);
        } else {
            System.out.println("Khach hang khong ton tai");
        }
    }

    public void withDraw(String accountNumber, double money, String withdrawType) {
        Customer customer = customerService.getCustomerByAccountNumber(accountNumber);
        Account account = accountService.getAccount(customer, accountNumber);
        BalanceChangeNotificationItem item = withdrawService.withdraw(account, money, withdrawType);
        if (item != null) {
            notifierService.notifyAll(customer, item);
        }
    }
}
