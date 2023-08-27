package bap.intern.designPattern.withdrawStrategy;

import bap.intern.designPattern.baseClass.NotificationItem;
import bap.intern.designPattern.baseClass.Account;
// Ví dụ khi rút tiền tại ngân hàng thì tốn thêm hoa hồng 10%
public class BankWithdrawStrategy implements WithdrawStrategy {

    @Override
    public NotificationItem withdraw(Account account, double amount) {
        double balance = account.getBalance();
        if (balance - amount >= 500) {
            double newBalance = balance - amount * 1.1;
            account.setBalance(newBalance);

            System.out.println("------------------------------------------");
            System.out.println("Chiến lược rút tiền: rút tại ngân hàng");
            System.out.println("Loại tài khoản: " + account.getTypeAccount());
            System.out.println("Số tài khoản: " + account.getAccountNumber());
            System.out.println("Số dư ban đầu: " + balance);
            System.out.println("Số tiền đã rút: " + amount);
            System.out.println("Phí rút tiền: " + amount * 0.1);
            System.out.println("Số dư hiện tại: " + newBalance);

            NotificationItem item = new NotificationItem(account.getAccountNumber(),
                    balance, newBalance);
            return item;
        }
        return null;
    }
}
