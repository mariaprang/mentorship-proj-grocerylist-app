package groceryListApp.controllers;

import groceryListApp.database.DatabaseController;
import groceryListApp.model.Shop;
import groceryListApp.views.ErrorPageController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;

import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

public class NewShopProductController implements Initializable {

    @FXML
    ChoiceBox shopsDropDown;

    private DatabaseController dbController;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        dbController = new DatabaseController();
        try {
            // generics
            List<Shop> shops = dbController.getAllShops();
            ObservableList shopObservableList = FXCollections.observableList(shops);
            shopsDropDown.getItems().clear();
            shopsDropDown.setItems(shopObservableList);
            shopsDropDown.getSelectionModel().selectFirst();
        }catch(SQLException ex){
            ErrorPageController.displayErrorPage(ex.getMessage());
        }
    }
}
