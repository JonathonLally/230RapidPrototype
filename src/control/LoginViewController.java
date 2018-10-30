package control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginViewController {

    @FXML
    private TextField user_textfield;

    @FXML
    private PasswordField password_passfield;

    @FXML
    private Text invalid_text;

    @FXML
    void user_login(ActionEvent event) {
        try {
            Stage secondaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/view/MainView.fxml"));
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("/resources/material-fx-v0_3.css").toExternalForm());
            secondaryStage.setTitle("MainView");
            secondaryStage.setScene(scene);
            secondaryStage.show();
            Stage stage = (Stage) invalid_text.getScene().getWindow();
            stage.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
