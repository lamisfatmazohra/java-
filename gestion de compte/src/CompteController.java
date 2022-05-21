import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class CompteController implements Initializable {

    @FXML
    private TextField adresseF;

    @FXML
    private TableColumn<?, ?> adresseT;

    @FXML
    private Button ajouter;

    @FXML
    private TextField dateF;

    @FXML
    private TableColumn<?, ?> dateT;

    @FXML
    private Button depot;

    @FXML
    private TextField depotF;

    @FXML
    private TextField nomF;

    @FXML
    private TableColumn<?, ?> nomT;

    @FXML
    private TableColumn<?, ?> numeroT;

    @FXML
    private TextField prenomF;

    @FXML
    private TableColumn<?, ?> prenomT;

    @FXML
    private Button retrait;

    @FXML
    private TextField retraitF;

    @FXML
    private TableColumn<?, ?> soldeT;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub

    }

}
