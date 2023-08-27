package bap.intern.designPattern;

import bap.intern.designPattern.facade.*;
import bap.intern.designPattern.notificationObserver.EmailNotifier;
import bap.intern.designPattern.notificationObserver.Notifier;
import bap.intern.designPattern.notificationObserver.SMSNotifier;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        AccountService accountService = new AccountService();
        WithdrawService withdrawService = new WithdrawService();
        NotifierService notifierService = new NotifierService();

        Controller controller = new Controller(customerService, accountService, withdrawService, notifierService);

        controller.createCustomer(1, "khai hoan", 25, "0396826333", "khaihoancr7@gmail.com");

        controller.createAccount(1, "SAVING", "123456", 5000);
        controller.createAccount(1, "LOAN", "333333", 0);

        Notifier emailNotifier = new EmailNotifier();
        Notifier smsNotifier = new SMSNotifier();

        controller.registerNotifier(1, emailNotifier);
        controller.registerNotifier(1, smsNotifier);

        System.out.println("-------------------------RÚT TIỀN LẦN 1, THÔNG BÁO: SMS + " +
                "EMAIL-------------------------------");
        controller.withDraw("123456", 1000, "ATM");

        controller.removeNotifier(1, emailNotifier);

        System.out.println("-------------------------RÚT TIỀN LẦN 2, THÔNG BÁO: CHỈ " +
                "SMS-------------------------------");
        controller.withDraw("123456", 1000, "BANK");
    }
}