package control;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MainViewController {

    @FXML    private MenuItem close;
    @FXML    private Button launchAddView;
    @FXML    private Button edit;
    @FXML    private Button launchHistoryView;
    @FXML    private Button delete;
    @FXML    private ListView DeliveryListView;
    @FXML    private ListView startListView;
    @FXML    private ListView destinationListView;
    @FXML    private ListView lengthListView;
    @FXML    private ListView weightListView;
    @FXML    private ListView customerListView;
    @FXML    private ListView arrivalListView;

    private int launchCount;
    private int editCount;
    private int historyCount;
    private int delCount;

    @FXML
    void initialize () {
        DeliveryListView.getItems().add("Test Data");
        startListView.getItems().add("10:00");
        destinationListView.getItems().add("Dallas TX");
        lengthListView.getItems().add("20'6");
        weightListView.getItems().add("2000lbs");
        customerListView.getItems().add("Business Inc.");
        arrivalListView.getItems().add("22:00");
    }

    @FXML
    void addView(ActionEvent event) {
        launchCount++;
            try {
                Stage secondaryStage = new Stage();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/AddView.fxml"));
                Parent root = loader.load();
                AddViewController launchCtrl = loader.getController();
                Scene scene = new Scene(root);
                secondaryStage.setScene(scene);
                secondaryStage.showAndWait();
            } catch (Exception e) {
                e.printStackTrace();
            }
    }

    @FXML
    void delView(ActionEvent event) {
        delCount++;
        try {
            Stage secondaryStage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/AddView.fxml"));
            Parent root = loader.load();
            AddViewController delCtrl = loader.getController();
            Scene scene = new Scene(root);
            secondaryStage.setScene(scene);
            secondaryStage.showAndWait();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    void editView(ActionEvent event) {
        editCount++;
        try {
            Stage secondaryStage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/AddView.fxml"));
            Parent root = loader.load();
            AddViewController editCtrl = loader.getController();
            Scene scene = new Scene(root);
            //scene.getStylesheets().add(getClass().getResource("/resources/material-fx-v0_3.css").toExternalForm());
            secondaryStage.setScene(scene);
            secondaryStage.showAndWait();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void hisView(ActionEvent event) {
        historyCount++;
    }

    public void writeSpy() {            //Writes use stats to spy file "spy.txt"
        try {
            FileWriter writer = new FileWriter("spy.txt", true);
            PrintWriter pwriter = new PrintWriter(writer);
            pwriter.println("Add Views : " + String.valueOf(launchCount));
            pwriter.println("Edit Views : " + String.valueOf(editCount));
            pwriter.println("History Views : " + String.valueOf(historyCount));
            pwriter.println("Delete Views : " + String.valueOf(delCount));
            pwriter.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void exit() {        //Closes Application
        writeSpy();
        Platform.exit();
    }

}
