package groceryListApp.model;

import java.util.ArrayList;

public class Shop {

    private String title;
    private ArrayList<Product> products;

    public Shop(String title){
        this.products = new ArrayList<>();
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
