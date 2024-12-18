public class Order {
    String orderId;
    User user;
    Asset asset;
    int quantity;

    public Order(String orderId, User user, Asset asset, int quantity) {
        this.orderId = orderId;
        this.user = user;
        this.asset = asset;
        this.quantity = quantity;
    }
}
