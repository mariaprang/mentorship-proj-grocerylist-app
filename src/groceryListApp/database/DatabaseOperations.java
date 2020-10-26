package groceryListApp.database;

import groceryListApp.model.Product;
import groceryListApp.model.Shop;

import java.util.ArrayList;

public interface DatabaseOperations {

    public ArrayList<Shop> getAllShops();

    public ArrayList<Product> getProductsForShop(Shop shop);

    public void addShop(Shop shop);

    public void removeShop(Shop shop);

    public void removeProductFromShop(Product product, Shop shop);

    public void addProductToShop();

}
