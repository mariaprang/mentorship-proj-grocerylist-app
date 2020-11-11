package groceryListApp.database;

import java.sql.*;

import groceryListApp.model.Product;
import groceryListApp.model.Shop;


import java.util.ArrayList;

public class DatabaseController implements DatabaseOperations {

    private String username = "root";
    private String password = "password";
    private String URL = "jdbc:mysql://localhost:3306/grocery_list_app";

    private Connection databaseConnection; // var for database connection status
    private Statement statement; // var to store database command in
    private ResultSet resultSet; // var to store database results coming back from table

    public DatabaseController() {
        try {
            databaseConnection = DriverManager.getConnection(URL, username, password);
            System.out.println("connection successful!");
        } catch (Exception ex) {
            System.out.println("ERROR!");
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public ArrayList<Shop> getAllShops() throws SQLException {

        String command = "select * from shops";
        statement = databaseConnection.createStatement();
        resultSet = statement.executeQuery(command);
        ArrayList<Shop> shops = new ArrayList<>();
        while (resultSet.next()) {
            int shopId = resultSet.getInt("shop_id");
            String shopTitle = resultSet.getString("shop_title");
            Shop shop = new Shop(shopTitle, shopId);
            shops.add(shop);
        }
        return shops;
    }

    @Override
    public ArrayList<String> getProductsForShop(Shop shop) throws SQLException {
        String command = "select product_title from products where shop_id=" + shop.getShopId();
        statement =  databaseConnection.createStatement();
        resultSet = statement.executeQuery(command);
        ArrayList<String> productTitles = new ArrayList<>();
        while (resultSet.next()){
            String productTitle = resultSet.getString("product_title");
            productTitles.add(productTitle);
        }
        return productTitles;
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
