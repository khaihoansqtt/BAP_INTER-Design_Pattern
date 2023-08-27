package bap.intern.designPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {
    private static Bank bank;
    List<Customer> customers;

    private static ReentrantLock lock = new ReentrantLock();
    private Bank() {
        customers = new ArrayList<Customer>();
    }

    public static Bank getBank() {
        if (bank == null) {
            lock.lock();
            try {
                if (bank == null) {
                    bank = new Bank();
                }
            } finally {
                lock.unlock();
            }
        }
        return bank;
    }

    public List<Customer> getCustomers() {
        return customers;
    }
}
