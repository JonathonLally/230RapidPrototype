package control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddViewController {

    @FXML
    private TextField dID;

    @FXML
    private TextField dStart;

    @FXML
    private TextField dDest;

    @FXML
    private TextField dLen;

    @FXML
    private TextField dWeight;

    @FXML
    private TextField dCust;

    @FXML
    private TextField dArrival;

    @FXML
    void addAction(ActionEvent event) {
        Stage stage = (Stage) dID.getScene().getWindow();
        stage.close();
    }

}
