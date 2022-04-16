import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class StockController implements Initializable {

    private ObservableList<Produit> produits;

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

        this.produits = FXCollections.observableArrayList();
        this.getProduit();
        codebarre.setCellValueFactory(cellData -> cellData.getValue().getcodeProperty());
        reference.setCellValueFactory(cellData -> cellData.getValue().getreferenceProperty());
        fournisseur.setCellValueFactory(cellData -> cellData.getValue().getfournaisseurProperty());
        designation.setCellValueFactory(cellData -> cellData.getValue().getDesigniationProperty());
        unite.setCellValueFactory(cellData -> cellData.getValue().getuniteProperty());
        prix.setCellValueFactory(cellData -> cellData.getValue().getprixProperty());
        quantite.setCellValueFactory(cellData -> cellData.getValue().getquantiteProperty());
        tableau.setItems(produits);

    }

    @FXML
    public void ajouterProduit() {
        String codebarr = this.codebarre1.getText();
        String reference = this.reference1.getText();
        String unite = this.unite1.getText();
        String fournisseur = this.fournisseur1.getText();
        String designiation = this.designation1.getText();
        int quantite = Integer.valueOf(this.quantite1.getText());
        Double prix = Double.valueOf(this.prix1.getText());
        Produit p = new Produit(codebarr, designiation, reference, fournisseur, unite, quantite, prix);
        this.produits.add(p);

        final Connection connection;
        DBHundler hundler = new DBHundler();
        PreparedStatement pst;
        String insert = "INSERT INTO produit VALUES (?,?,?,?,?,?,?)";
        connection = (Connection) hundler.getConnection();
        try {
            pst = (PreparedStatement) connection.prepareStatement(insert);
            pst.setString(1, codebarr);
            pst.setString(2, reference);
            pst.setString(3, unite);
            pst.setString(4, designiation);
            pst.setString(5, fournisseur);
            pst.setInt(6, quantite);
            pst.setDouble(7, prix);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText("le produit est inserer");
        a.show();

    }

    @FXML
    public void supprimerProduit() {
        Produit p = tableau.getSelectionModel().getSelectedItem();
        int index = tableau.getSelectionModel().getSelectedIndex();
        final Connection connection;
        DBHundler hundler = new DBHundler();
        PreparedStatement pst;
        String delete = "delete from produit where codebarr=?";
        connection = (Connection) hundler.getConnection();
        try {
            pst = (PreparedStatement) connection.prepareStatement(delete);
            pst.setString(1, p.getCodebarre());
            pst.executeUpdate();
            this.tableau.getItems().remove(index);
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText("le produit est supprimer");
            a.show();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private void getProduit() {
        final Connection connection;
        DBHundler hundler = new DBHundler();
        PreparedStatement pst;
        String select = "select * from produit";
        connection = (Connection) hundler.getConnection();
        try {
            pst = (PreparedStatement) connection.prepareStatement(select);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String codebarr = rs.getString("codebarr");
                String reference = rs.getString("reference");
                String unite = rs.getString("unite");
                String designiation = rs.getString("designiation");
                String fournisseur = rs.getString("fournaisseur");
                int quantite = rs.getInt("quantite");
                Double prix = rs.getDouble("prix");
                produits.add(new Produit(codebarr, designiation, reference, fournisseur, unite, quantite, prix));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
