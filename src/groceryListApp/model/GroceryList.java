package groceryListApp.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class GroceryList {

    private LocalDateTime dateTime;
    private String category;
    private ArrayList<Product> products;

    public GroceryList(LocalDateTime dateTime,
                       String category){
        this.dateTime = dateTime;
        this.category = category;
        this.products = new ArrayList<>();
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
