package control;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;

public class MainViewController {

    @FXML
    private MenuItem close;

    @FXML
    private Button launchAddView;

    @FXML
    private Button edit;

    @FXML
    private Button launchHistoryView;

    @FXML
    private Button delete;

    @FXML
    private ListView<?> DeliveryListView;

    @FXML
    private ListView<?> startListView;

    @FXML
    private ListView<?> destinationListView;

    @FXML
    private ListView<?> lengthListView;

    @FXML
    private ListView<?> weightListView;

    @FXML
    private ListView<?> customerListView;

    @FXML
    private ListView<?> arrivalListView;

}
