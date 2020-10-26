package groceryListApp.model;

public class Product {

    private String title;
    private double price;
    private int quantity;
    private Shop shop;


    public Product(String title,
                   double price,
                   int quantity,
                   Shop shop) {

        this.price = price;
        this.title = title;
        this.quantity = quantity;
        this.shop = shop;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
}
