import java.util.ArrayList;
import java.util.List;

public class User {
    String userId;
    String name;
    String email;
    String phone;
    TradingAccount tradingAccount;
    List<Order> portfolio;

    public User(String userId, String name, String email, String phone) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.tradingAccount = new TradingAccount();
        this.portfolio = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        double totalCost = order.asset.price * order.quantity;
        if (tradingAccount.balance >= totalCost) {
            tradingAccount.deductFunds(totalCost);
            portfolio.add(order);
            System.out.println("Order placed successfully!");
        } else {
            System.out.println("Insufficient funds to place the order.");
        }
    }

    public void viewPortfolio() {
        System.out.println("Portfolio of " + name + ":");
        for (Order order : portfolio) {
            System.out.println(order.asset.name + " - Quantity: " + order.quantity);
        }
    }
}
