package groceryListApp;

import groceryListApp.database.DatabaseController;
import groceryListApp.model.Shop;
import groceryListApp.views.ShopViewGenerator;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    DatabaseController databaseController;

    @Override
    public void start(Stage primaryStage) throws Exception {

        databaseController = new DatabaseController();
        ArrayList<Shop> shops = databaseController.getAllShops();
        Parent root = FXMLLoader.load(getClass().getResource("views/grocery-home-page.fxml"));

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(root);
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);

        ShopViewGenerator generator = new ShopViewGenerator();
        root = generator.createShopView(shops, (AnchorPane) root);

        primaryStage.setTitle("Grocery List Reminder App");
        primaryStage.setScene(new Scene(scrollPane));
        primaryStage.show();
        primaryStage.setResizable(false);
    }


    public static void main(String[] args) {
        launch(args);
    }

}
