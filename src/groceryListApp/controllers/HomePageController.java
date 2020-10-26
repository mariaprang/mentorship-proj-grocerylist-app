package groceryListApp.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class HomePageController {

    @FXML
    void showNewShopPage(ActionEvent event) throws IOException {
        // Stage = new window
        Stage newShopWindow = new Stage();
        //load the contents of our fxml into root
        Parent root = FXMLLoader.load(getClass().getResource("../views/add-new-shop.fxml"));
        // load the root into the scene
        Scene scene = new Scene(root);
        // connect the scene with stage
        newShopWindow.setScene(scene);
        //show stage
        newShopWindow.show();
    }
}
