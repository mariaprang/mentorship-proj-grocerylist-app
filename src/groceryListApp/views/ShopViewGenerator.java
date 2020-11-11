package groceryListApp.views;

import groceryListApp.database.DatabaseController;
import groceryListApp.model.Shop;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

import java.sql.SQLException;
import java.util.ArrayList;

public class ShopViewGenerator {


    private final static int initialX = 15;
    private int initialY = 50;
    private final static int gap = 190;

    private DatabaseController databaseController;

    public ShopViewGenerator(){
        this.databaseController = new DatabaseController();
    }

    public AnchorPane createShopView(ArrayList<Shop> shops, AnchorPane mainAnchorPane) throws SQLException {
        int shopCounter = 1;
        int current = 0;
        int prevYValue = 0;
        for (Shop shop : shops) {
            AnchorPane shopWrap = new AnchorPane();
            shopWrap.setPrefWidth(575);
            shopWrap.setPrefHeight(170);
            shopWrap.setStyle("-fx-border-color: green; -fx-border-width: 1px 1px 1px 1px");

            shopWrap.setLayoutX(15);
            if (shopCounter == 1) {
                shopWrap.setLayoutY(50);
                prevYValue = 50;
            } else {
               // prev = prev + 20 + 170
                current = prevYValue + gap;
                shopWrap.setLayoutY(current);
                prevYValue = current;
                shopCounter++;
            }

            ArrayList<String> products = databaseController.getProductsForShop(shop);
            // TODO: add code here that displays the products on the shop container
            //shopWrap.getChildren().add(new Label(shop.getTitle()));
            mainAnchorPane.getChildren().add(shopWrap);
        }


        return mainAnchorPane;

    }


}
