package groceryListApp.views;

import groceryListApp.database.DatabaseController;
import groceryListApp.model.Product;
import groceryListApp.model.Shop;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

import java.sql.SQLException;
import java.util.ArrayList;

public class ShopViewGenerator {


    private final static int initialX = 15;
    private int initialY = 70;
    private final static int gap = 190;

    private DatabaseController databaseController;

    public ShopViewGenerator() {
        this.databaseController = new DatabaseController();
    }

    public AnchorPane createShopView(ArrayList<Shop> shops, AnchorPane mainAnchorPane) throws SQLException {
        int shopCounter = 1;
        int current = 0;
        int prevYValue = 0;
        for (Shop shop : shops) {
            AnchorPane shopWrap = new AnchorPane();

            ScrollPane scrollPane = new ScrollPane();
            scrollPane.setContent(shopWrap);
            scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);


            scrollPane.setPrefWidth(575);
            scrollPane.setPrefHeight(170);
            // shopWrap.setStyle("-fx-border-color: green; -fx-border-width: 1px 1px 1px 1px");

            scrollPane.setLayoutX(15);
            if (shopCounter == 1) {
                scrollPane.setLayoutY(initialY);
                prevYValue = initialY;
            } else {
                // prev = prev + 20 + 170
                current = prevYValue + gap;
                scrollPane.setLayoutY(current);
                prevYValue = current;
            }
            shopCounter++;
            ArrayList<String> products = databaseController.getProductsForShop(shop);
            // TODO: add code here that displays the products on the shop container
            shopWrap.getChildren().add(new Label(shop.getTitle()));

            double tempLayout = 0;
            for (String product : databaseController.getProductsForShop(shop)) {
                CheckBox box = new CheckBox(product);
                box.setLayoutY(tempLayout+20);
                tempLayout = box.getLayoutY();
                shopWrap.getChildren().add(box);
            }
            mainAnchorPane.getChildren().add(scrollPane);

        }


        return mainAnchorPane;

    }


}
