package bap.intern.designPattern.withdrawStrategy;

import bap.intern.designPattern.baseClass.BalanceChangeNotificationItem;
import bap.intern.designPattern.baseClass.Account;

public interface WithdrawStrategy {
    BalanceChangeNotificationItem withdraw(Account account, double amount);
}
