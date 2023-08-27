package bap.intern.designPattern.facade;

import bap.intern.designPattern.baseClass.Customer;
import bap.intern.designPattern.baseClass.NotificationItem;
import bap.intern.designPattern.notificationObserver.NotifierSubject;
import bap.intern.designPattern.notificationObserver.Notifier;

public class NotifierService implements NotifierSubject {

    @Override
    public void addNotifier(Customer customer, Notifier notifier) {
        customer.getNotifiers().add(notifier);
    }

    @Override
    public void removeNotifier(Customer customer, Notifier notifier) {
        customer.getNotifiers().remove(notifier);
    }

    @Override
    public void notifyAll(Customer customer, NotificationItem item) {
        for (Notifier notifier : customer.getNotifiers()) {
            notifier.notifyTo(customer, item);
        }
    }
}
