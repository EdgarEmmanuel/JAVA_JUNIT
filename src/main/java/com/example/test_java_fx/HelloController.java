package com.example.test_java_fx;

import com.example.test_java_fx.userInterface.MainViewModel;
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
    private Label label_moneyInserted;

    @FXML
    private ImageView imageView_oneCent;

    @FXML
    private ImageView imageView_tenCent;

    @FXML
    private ImageView imageView_twentyFiveCent;

    @FXML
    private ImageView imageView_oneDollar;

    @FXML
    private ImageView imageView_fiveDollar;

    @FXML
    private ImageView imageView_twentyDollar;

    private MainViewModel mainViewModel;


    public HelloController()
    {
        this.mainViewModel = new MainViewModel();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.initializeOneCentImage();
        this.initializeTenCentImage();
        this.initializeTwentyFiveCentImage();
        this.initializeOneDollarImage();
        this.initializeFiveDollarImage();
        this.initializeTwentyDollarImage();

        this.initializeLabelInsertMoneyWithSnackData();
    }



    public void insertCentInSnack()
    {
        this.mainViewModel.snackVM.insertOneCent();
        this.initializeLabelInsertMoneyWithSnackData();
    }


    public void insertTenCentInSnack(){
        this.mainViewModel.snackVM.insertTenCent();
        this.updateMoneyInserted();
    }


    public void insertQuarterCent(){
        this.mainViewModel.snackVM.insertTwentyCent();
        this.updateMoneyInserted();
    }


    public void updateMoneyInserted()
    {
        String amount = this.mainViewModel.snackVM.moneyInTransaction;

        this.label_moneyInserted.setText("Money Inserted: "+ amount);
    }


    private void initializeLabelInsertMoneyWithSnackData()
    {
        String amount = this.mainViewModel.snackVM.moneyInTransaction;

        this.label_moneyInserted.setText("Money Inserted: "+ amount);
    }


    private void initializeTenCentImage(){
        File file = new File("src/main/resources/images/tenCent.png");
        Image image = new Image(file.toURI().toString());
        imageView_tenCent.setImage(image);
    }

    private void initializeTwentyFiveCentImage(){
        File file = new File("src/main/resources/images/twentyFiveCent.png");
        Image image = new Image(file.toURI().toString());
        imageView_twentyFiveCent.setImage(image);
    }

    private void initializeOneDollarImage(){
        File file = new File("src/main/resources/images/oneDolar.png");
        Image image = new Image(file.toURI().toString());
        imageView_oneDollar.setImage(image);
    }

    private void initializeFiveDollarImage(){
        File file = new File("src/main/resources/images/fiveDollar.png");
        Image image = new Image(file.toURI().toString());
        imageView_fiveDollar.setImage(image);
    }

    private void initializeTwentyDollarImage(){
        File file = new File("src/main/resources/images/twentyDollar.png");
        Image image = new Image(file.toURI().toString());
        imageView_twentyDollar.setImage(image);
    }


    private void initializeOneCentImage(){
        File file = new File("src/main/resources/images/oneCent.png");
        Image image = new Image(file.toURI().toString());
        imageView_oneCent.setImage(image);
    }
}