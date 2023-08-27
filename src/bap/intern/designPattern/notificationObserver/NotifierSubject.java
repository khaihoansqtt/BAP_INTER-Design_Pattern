package bap.intern.designPattern.notificationObserver;

import bap.intern.designPattern.baseClass.Customer;
import bap.intern.designPattern.baseClass.BalanceChangeNotificationItem;

public interface NotifierSubject {
    void addNotifier(Customer customer, Notifier notifier);
    void removeNotifier(Customer customer, Notifier notifier);
    void notifyAll(Customer customer, BalanceChangeNotificationItem item);
}
