package bap.intern.designPattern.withdrawStrategy;

import bap.intern.designPattern.baseClass.BalanceChangeNotificationItem;
import bap.intern.designPattern.baseClass.Account;

public class ATMWithdrawStrategy implements WithdrawStrategy {
    @Override
    public BalanceChangeNotificationItem withdraw(Account account, double amount) {
        double balance = account.getBalance();
        if (balance - amount >= 500) {
            double newBalance = balance - amount;
            account.setBalance(newBalance);

            System.out.println("------------------------------------------");
            System.out.println("Chiến lược rút tiền: rút tai ATM");
            System.out.println("Loại tài khoản: " + account.getTypeAccount());
            System.out.println("Số tài khoản: " + account.getAccountNumber());
            System.out.println("Loại tài khoản: " + account.getAccountNumber());
            System.out.println("Số dư ban đầu: " + balance);
            System.out.println("Số tiền đã rút: " + amount);
            System.out.println("Số dư hiện tại: " + newBalance);

            BalanceChangeNotificationItem item = new BalanceChangeNotificationItem(account.getAccountNumber(),
                    balance, newBalance);
            return item;
        }
        return null;
    }
}

