package groceryListApp.database;

import groceryListApp.model.Product;
import groceryListApp.model.Shop;

import java.util.ArrayList;

public class DatabaseController implements DatabaseOperations {

    @Override
    public ArrayList<Shop> getAllShops() {
        return null;
    }

    @Override
    public ArrayList<Product> getProductsForShop(Shop shop) {
        return null;
    }

    @Override
    public void addShop(Shop shop) {

    }

    @Override
    public void removeShop(Shop shop) {

    }

    @Override
    public void removeProductFromShop(Product product, Shop shop) {

    }

    @Override
    public void addProductToShop() {

    }
}
