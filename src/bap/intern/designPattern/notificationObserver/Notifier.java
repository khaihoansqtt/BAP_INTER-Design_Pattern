package bap.intern.designPattern.notificationObserver;

import bap.intern.designPattern.baseClass.Customer;
import bap.intern.designPattern.baseClass.BalanceChangeNotificationItem;

public interface Notifier {
    void notifyTo(Customer customer, BalanceChangeNotificationItem item);
}
