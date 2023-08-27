package bap.intern.designPattern.withdrawStrategy;

import bap.intern.designPattern.baseClass.NotificationItem;
import bap.intern.designPattern.baseClass.Account;

public interface WithdrawStrategy {
    NotificationItem withdraw(Account account, double amount);
}
