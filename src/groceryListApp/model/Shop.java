package groceryListApp.model;

import java.util.ArrayList;

public class Shop {

    private String title;
    private ArrayList<Product> products;
    private int shopId;
    private static int shopCounter;

    public Shop(String title){
        this.products = new ArrayList<>();
        shopCounter++;
        this.shopId = shopCounter;
    }

    public int getShopId() {
        return shopId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
