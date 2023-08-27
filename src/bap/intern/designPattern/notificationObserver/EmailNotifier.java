package bap.intern.designPattern.notificationObserver;

import bap.intern.designPattern.BalanceChangeNotificationItem;
import bap.intern.designPattern.Customer;

public class EmailNotifier implements  Notifier{
    @Override
    public void notifyTo(Customer customer, BalanceChangeNotificationItem item) {
        System.out.println("\n---------THÔNG BÁO QUA EMAIL--------");
        System.out.println("Địa chỉ email: " + customer.getEmailAddress());
        System.out.println("Tên khách hàng: " + customer.getName());
        System.out.println("Số tài khoản: " + item.getAccountNumber());
        System.out.println("Số dư trước đó: " + item.getPrevBalance());
        System.out.println("Số dư hiện tại: " + item.getCurBalance());
    }
}
