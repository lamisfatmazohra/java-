import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class StockController implements Initializable {

    @FXML
    private Button ajouter;

    @FXML
    private TableColumn<Produit, String> codebarre;

    @FXML
    private TextField codebarre1;

    @FXML
    private TableColumn<Produit, String> designation;

    @FXML
    private TextField designation1;

    @FXML
    private TableColumn<Produit, String> fournisseur;

    @FXML
    private TextField fournisseur1;

    @FXML
    private Button imprimer;

    @FXML
    private TextArea inventaire;

    @FXML
    private Button modifier;

    @FXML
    private TableColumn<Produit, Double> prix;

    @FXML
    private TextField prix1;

    @FXML
    private TableColumn<Produit, Integer> quantite;

    @FXML
    private TextField quantite1;

    @FXML
    private TableColumn<Produit, String> reference;

    @FXML
    private TextField reference1;

    @FXML
    private Button supprimer;

    @FXML
    private TableView<Produit> tableau;

    @FXML
    private TableColumn<Produit, String> unite;

    @FXML
    private TextField unite1;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub

    }

}
