package bap.intern.designPattern.notificationObserver;

import bap.intern.designPattern.baseClass.Customer;
import bap.intern.designPattern.baseClass.NotificationItem;

public interface Notifier {
    void notifyTo(Customer customer, NotificationItem item);
}
