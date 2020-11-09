package groceryListApp.controllers;

import groceryListApp.views.ShopViewGenerator;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

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
