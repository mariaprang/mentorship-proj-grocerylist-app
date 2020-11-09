package groceryListApp;

import groceryListApp.views.ShopViewGenerator;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("views/grocery-home-page.fxml"));

        ShopViewGenerator generator = new ShopViewGenerator();
        root = generator.createShopView(new ArrayList<>(), (AnchorPane) root);

        primaryStage.setTitle("Grocery List Reminder App");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}
