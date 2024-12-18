public class TradingAccount {
    double balance;

    public TradingAccount() {
        this.balance = 0;
    }

    public void addFunds(double amount) {
        this.balance += amount;
        System.out.println("Funds added successfully! Current balance: " + balance);
    }

    public void deductFunds(double amount) {
        this.balance -= amount;
    }
}
