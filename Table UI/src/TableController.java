
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class TableController<Button> implements Initializable {
    @FXML
    private TableColumn<Personne, Integer> agecol;

    @FXML
    private TableColumn<Personne, String> nomcol;

    @FXML
    private TableColumn<Personne, String> prenomcol;

    @FXML
    private TableView<Personne> table;
    private ObservableList<Personne> personneData;

    @FXML
    private Button delete;

    @FXML
    private Button ajouter;

    @FXML
    private TextField nom;

    @FXML
    private TextField prenom, age;

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

    @FXML
    public void deleteAction() {
        int index = this.table.getSelectionModel().getSelectedIndex();
        Personne p = this.table.getSelectionModel().getSelectedItem();
        this.table.getItems().remove(index);
    }

    @FXML
    public void ajouterAction() {
        String nom = this.nom.getText();
        String prenom = this.prenom.getText();
        String age = this.age.getText();
        Personne p = new Personne(nom, prenom, Integer.valueOf(age));
        this.table.getItems().add(p);
        this.nom.setText("");
        this.prenom.setText("");
        this.age.setText("");
    }
}
