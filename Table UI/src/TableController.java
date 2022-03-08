import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class TableController implements Initializable {
    @FXML
    private TableColumn<?, ?> agecol;

    @FXML
    private TableColumn<?, ?> nomcol;

    @FXML
    private TableColumn<?, ?> prenomcol;

    @FXML
    private TableView<?> table;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub

    }

}
