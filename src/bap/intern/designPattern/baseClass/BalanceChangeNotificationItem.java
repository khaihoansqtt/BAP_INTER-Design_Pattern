package bap.intern.designPattern.baseClass;

public class BalanceChangeNotificationItem {
    private String accountNumber;
    private double prevBalance;
    private double curBalance;

    public BalanceChangeNotificationItem(String accountNumber, double prevBalance, double curBalance) {
        this.accountNumber = accountNumber;
        this.prevBalance = prevBalance;
        this.curBalance = curBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getPrevBalance() {
        return prevBalance;
    }

    public void setPrevBalance(double prevBalance) {
        this.prevBalance = prevBalance;
    }

    public double getCurBalance() {
        return curBalance;
    }

    public void setCurBalance(double curBalance) {
        this.curBalance = curBalance;
    }
}
