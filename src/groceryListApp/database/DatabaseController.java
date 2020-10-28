package groceryListApp.database;

import java.sql.Connection;
import java.sql.Statement;
import groceryListApp.model.Product;
import groceryListApp.model.Shop;


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DatabaseController implements DatabaseOperations {

    private String username = "root";
    private String password =  "password";
    private String URL = "jdbc:mysql://localhost:3306/grocery_list_app";

    private Connection databaseConnection; // var for database connection status
    private Statement command; // var to store database command in
    private ResultSet resultSet; // var to store database results coming back from table



    public DatabaseController(){
        try{
            databaseConnection = DriverManager.getConnection(URL, username, password);
            System.out.println("connection successful!");
        }
        catch(Exception ex){
            System.out.println("ERROR!");
            System.out.println(ex.getMessage());
        }
    }

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
