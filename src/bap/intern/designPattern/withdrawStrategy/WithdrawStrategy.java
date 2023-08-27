package bap.intern.designPattern.withdrawStrategy;

import bap.intern.designPattern.BalanceChangeNotificationItem;
import bap.intern.designPattern.account.Account;

public interface WithdrawStrategy {
    BalanceChangeNotificationItem withdraw(Account account, double amount);
}
