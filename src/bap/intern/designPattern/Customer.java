package bap.intern.designPattern;

import bap.intern.designPattern.account.Account;
import bap.intern.designPattern.notificationObserver.Notifier;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerId;
    private String name;
    private int age;
    private String phoneNumber;
    private String emailAddress;
    private List<Account> accounts;
    private List<Notifier> notifiers;

    public Customer() {
        this.accounts = new ArrayList<Account>();
        this.notifiers = new ArrayList<Notifier>();
    }

    public Customer(int customerId, String name, int age, String phoneNumber, String emailAddress) {
        this.customerId = customerId;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.accounts = new ArrayList<Account>();
        this.notifiers = new ArrayList<Notifier>();
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public List<Notifier> getNotifiers() {
        return notifiers;
    }

    public void setNotifiers(List<Notifier> notifiers) {
        this.notifiers = notifiers;
    }

    public static Customer builder() {
        return new Customer();
    }

    public Customer customerId(int customerId) {
        setCustomerId(customerId);
        return this;
    }

    public Customer name(String name) {
        setName(name);
        return this;
    }

    public Customer age(int age) {
        setAge(age);
        return this;
    }

    public Customer phoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
        return this;
    }

    public Customer emailAddress(String emailAddress) {
        setEmailAddress(emailAddress);
        return this;
    }
    public Customer build() {
        return this;
    }
}
