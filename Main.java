import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        System.out.print("Enter your phone number: ");
        String phone = scanner.nextLine();
        User user = new User("U1", name, email, phone);
        System.out.println("Welcome, " + user.name + "!");
        List<Asset> assets = new ArrayList<>();
        assets.add(new Asset("S1", "Google", 2800.50));
        assets.add(new Asset("S2", "Apple", 175.25));
        assets.add(new Asset("S3", "Tesla", 680.75));
        System.out.print("Enter the amount to add to your trading account: ");
        double funds = scanner.nextDouble();
        user.tradingAccount.addFunds(funds);
        System.out.println("Available assets:");
        for (int i = 0; i < assets.size(); i++) {
            Asset asset = assets.get(i);
            System.out.println((i + 1) + ". " + asset.name + " - Price: $" + asset.price);
        }
        System.out.print("Select an asset to buy (enter the number): ");
        int assetChoice = scanner.nextInt();
        if (assetChoice < 1 || assetChoice > assets.size()) {
            System.out.println("Invalid choice.");
            return;
        }
        Asset selectedAsset = assets.get(assetChoice - 1);
        System.out.print("Enter the quantity to buy: ");
        int quantity = scanner.nextInt();
        Order order = new Order("O" + (user.portfolio.size() + 1), user, selectedAsset, quantity);
        user.placeOrder(order);
        user.viewPortfolio();
        scanner.close();
    }
}
