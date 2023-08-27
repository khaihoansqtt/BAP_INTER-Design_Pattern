package bap.intern.designPattern.notificationObserver;

import bap.intern.designPattern.Customer;
import bap.intern.designPattern.BalanceChangeNotificationItem;

public interface NotifierSubject {
    void addNotifier(Customer customer, Notifier notifier);
    void removeNotifier(Customer customer, Notifier notifier);
    void notifyAll(Customer customer, BalanceChangeNotificationItem item);
}
