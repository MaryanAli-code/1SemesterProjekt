package semKloeverly.presentation.controllers;

import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import semKloeverly.domain.Resident;
import semKloeverly.persistence.DataManager;

public class ViewResientsController {

    @FXML
    private TableColumn<Resident, String> residentName ;

    @FXML
    private TableColumn <Resident, String> residentsAddress;

    @FXML
    private TableColumn <Resident, String> residentsNumber;

    @FXML
    private TableColumn <Resident, Integer> residentsPoints;

    @FXML
    private TextField pointFieldId;

    @FXML
    private TableView <Resident> residentViewTable;

    private DataManager dataManager;


    public void onEditResident() {
        
    }

    public void pointInputField() {
    }

    public void onAddPointsButton() {
    }
    public void onRemovePointsButton() {
    }
}
