import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
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
    private Connection connection;
    private DBHundler hundler;
    private PreparedStatement pst;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
        hundler = new DBHundler();
    }

    @FXML
    public void ajouterClient() {
        String insert = "INSERT INTO client(nom,prenom,daten,adresse)" + "VALUES (?,?,?,?)";
        connection = hundler.getConnection();
        try {
            pst = (PreparedStatement) connection.prepareStatement(insert);
            pst.setString(1, this.nomF.getText()); // Si le type de la colonne est string
            pst.setString(2, this.prenomF.getText());
            pst.setString(3, this.dateF.getText());
            pst.setString(4, this.adresseF.getText());
            pst.executeUpdate();
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText("insertion reussite");
            a.show();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
