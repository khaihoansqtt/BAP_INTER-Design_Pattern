package bap.intern.designPattern.facade;

import bap.intern.designPattern.Bank;
import bap.intern.designPattern.Customer;
import bap.intern.designPattern.account.Account;

import java.util.List;

public class CustomerService {
    private Bank bank;

    public CustomerService() {
        bank = Bank.getBank();
    }

    public List<Customer> getCustomers() {
        return bank.getCustomers();
    }

    public Customer getCustomerById(int customerId) {
        for (Customer customer : bank.getCustomers()) {
            if (customer.getCustomerId() == customerId) return customer;
        }
        return null;
    }

    public void addCustomer(int customerId, String name, int age, String phoneNumber, String emailAddress) {
        List<Customer> customers = getCustomers();
        boolean isCustomerIdExisted = customers.stream().anyMatch(customer -> customer.getCustomerId() == customerId);

        if (!isCustomerIdExisted) {
            Customer newCustomer = Customer.builder().customerId(customerId).name(name)
                    .age(age).phoneNumber(phoneNumber).emailAddress(emailAddress)
                    .build();
            customers.add(newCustomer);
        }
    }

    public Customer getCustomerByAccountNumber(String accountNumber) {
        for (Customer customer : bank.getCustomers()) {
            for (Account account : customer.getAccounts()) {
                if (account.getAccountNumber() == accountNumber) {
                    return customer;
                }
            }
        }
        return null;
    }
}
