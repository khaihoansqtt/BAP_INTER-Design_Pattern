package bap.intern.designPattern.notificationObserver;

import bap.intern.designPattern.Customer;
import bap.intern.designPattern.BalanceChangeNotificationItem;

public class SMSNotifier implements  Notifier{
    @Override
    public void notifyTo(Customer customer, BalanceChangeNotificationItem item) {
        System.out.println("\n---------THÔNG BÁO QUA SMS--------");
        System.out.println("Số điện thoại: " + customer.getPhoneNumber());
        System.out.println("Tên khách hàng: " + customer.getName());
        System.out.println("Số tài khoản: " + item.getAccountNumber());
        System.out.println("Số dư trước đó: " + item.getPrevBalance());
        System.out.println("Số dư hiện tại: " + item.getCurBalance());
    }
}
