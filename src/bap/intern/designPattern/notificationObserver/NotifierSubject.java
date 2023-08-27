package bap.intern.designPattern.notificationObserver;

import bap.intern.designPattern.baseClass.Customer;
import bap.intern.designPattern.baseClass.NotificationItem;

public interface NotifierSubject {
    void addNotifier(Customer customer, Notifier notifier);
    void removeNotifier(Customer customer, Notifier notifier);
    void notifyAll(Customer customer, NotificationItem item);
}
