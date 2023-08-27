package bap.intern.designPattern.facade;

import bap.intern.designPattern.baseClass.NotificationItem;
import bap.intern.designPattern.withdrawStrategy.ATMWithdrawStrategy;
import bap.intern.designPattern.withdrawStrategy.BankWithdrawStrategy;
import bap.intern.designPattern.withdrawStrategy.WithdrawStrategy;
import bap.intern.designPattern.baseClass.Account;

public class WithdrawService {
    public NotificationItem withdraw(Account account, double money, String withdrawType) {
        WithdrawStrategy strategy;
        switch (withdrawType) {
            case "ATM": strategy = new ATMWithdrawStrategy();
            break;
            default: strategy = new BankWithdrawStrategy();
        }
        account.setWithdrawStrategy(strategy);
        return strategy.withdraw(account, money);
    }
}
