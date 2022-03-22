import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class EtudiantController implements Initializable {

    @FXML
    private Text Age;

    @FXML
    private Text Matricule;

    @FXML
    private Text Nom;

    @FXML
    private TextField Pre;

    @FXML
    private Text Prenom;

    @FXML
    private Button add;

    @FXML
    private TextField agefield;

    @FXML
    private TextField matriculefield;

    @FXML
    private TextField nomfield;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub

    }

    @FXML
    public void afficherAction() {
        String nom = this.nomfield.getText();
        String prenom = this.Pre.getText();
        int age = Integer.valueOf(this.agefield.getText());
        String matricule = this.matriculefield.getText();
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText(nom + " " + prenom + " " + age + " " + matricule);
        a.show();
    }

}
