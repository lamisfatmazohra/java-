
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Handler;

import com.mysql.cj.xdevapi.Result;

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
        this.verifierSiVide();
        this.recupererPersonne();
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
        final Connection connection;
        DBHundler hundler = new DBHundler();
        PreparedStatement pst;
        String insert = "INSERT INTO personne(Nom,prenom,age)" + "VALUES (?,?,?)";
        connection = (Connection) hundler.getConnection();
        try {
            pst = (PreparedStatement) connection.prepareStatement(insert);
            pst.setString(1, nom); // Si le type de la colonne est string
            pst.setString(2, prenom); // Si le type de la colonne est int
            pst.setInt(3, Integer.valueOf(age));
            pst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void remplirBase() {
        final Connection connection;
        DBHundler hundler = new DBHundler();
        PreparedStatement pst;
        String insert = "INSERT INTO personne(Nom,prenom,age)" + "VALUES (?,?,?)";
        connection = (Connection) hundler.getConnection();
        try {
            for (int i = 0; i < 10; i++) {
                pst = (PreparedStatement) connection.prepareStatement(insert);
                pst.setString(1, "nom" + i); // Si le type de la colonne est string
                pst.setString(2, "prenom" + i); // Si le type de la colonne est int
                pst.setInt(3, i + 30);
                pst.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void recupererPersonne() {
        final Connection connection;
        DBHundler hundler = new DBHundler();
        PreparedStatement pst;
        String select = "select * from personne";
        connection = hundler.getConnection();
        try {
            pst = (PreparedStatement) connection.prepareStatement(select);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String nom = rs.getString("Nom");
                String prenom = rs.getString("prenom");
                int age = rs.getInt("age");
                this.personneData.add(new Personne(nom, prenom, age));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void verifierSiVide() {
        final Connection connection;
        DBHundler hundler = new DBHundler();
        PreparedStatement pst;
        String select = "select count(*) as taille from personne";
        connection = hundler.getConnection();
        try {
            pst = (PreparedStatement) connection.prepareStatement(select);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                int taille = rs.getInt("taille");
                if (taille == 0) {
                    this.remplirBase();
                }
            } else {
                this.remplirBase();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
