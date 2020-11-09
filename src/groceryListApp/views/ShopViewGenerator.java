package groceryListApp.views;

import groceryListApp.model.Shop;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class ShopViewGenerator {


    private final static int initialX = 15;
    private int initialY = 50;
    private final static int gap = 20;

    public AnchorPane createShopView(ArrayList<Shop> shops, AnchorPane mainAnchorPane) {
        AnchorPane shopWrap = new AnchorPane();
        shopWrap.setPrefWidth(575);
        shopWrap.setPrefHeight(170);
        shopWrap.setStyle("-fx-border-color: green; -fx-border-width: 1px 1px 1px 1px");

        shopWrap.setLayoutX(15);
        shopWrap.setLayoutY(50);

        shopWrap.getChildren().add(new Label("Edeka"));
        mainAnchorPane.getChildren().add(shopWrap);

        return mainAnchorPane;

    }


}
