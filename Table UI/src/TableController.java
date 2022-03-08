import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class TableController implements Initializable {
    @FXML
    private TableColumn<Personne, Integer> agecol;

    @FXML
    private TableColumn<Personne, String> nomcol;

    @FXML
    private TableColumn<Personne, String> prenomcol;

    @FXML
    private TableView<Personne> table;
    private ObservableList<Personne> personneData;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
        personneData = FXCollections.observableArrayList();
        personneData.add(new Personne("fatma zohra", "lamis", 20));
        personneData.add(new Personne("bounouh", "nesrine", 24));
        personneData.add(new Personne("douaa", "yousra", 19));
        this.nomcol.setCellValueFactory(cellData -> cellData.getValue().getNomProperty());
        this.prenomcol.setCellValueFactory(cellData -> cellData.getValue().getPrenomProperty());
        this.agecol.setCellValueFactory(cellData -> cellData.getValue().getAgeProperty());
        this.table.setItems(this.personneData);
    }

}
