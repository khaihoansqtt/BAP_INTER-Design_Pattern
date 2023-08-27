package bap.intern.designPattern.notificationObserver;

import bap.intern.designPattern.Customer;
import bap.intern.designPattern.BalanceChangeNotificationItem;

public interface Notifier {
    void notifyTo(Customer customer, BalanceChangeNotificationItem item);
}
