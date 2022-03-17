package com.example.test_java_fx;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Button button_oneCent;

    @FXML
    private Button button_tenCent;

    @FXML
    private Button button_twentyFiveCent;

    @FXML
    private Button button_oneDollar;

    @FXML
    private Button button_fiveDollar;

    @FXML
    private Button button_twentyDollar;

    @FXML
    private Button button_returnMoney;

    @FXML
    private ImageView imageView_oneCent;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        File file = new File("src/main/resources/images/oneCent.png");
        Image image = new Image(file.toURI().toString());
        imageView_oneCent.setImage(image);
    }
}