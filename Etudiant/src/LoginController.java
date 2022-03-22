import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class LoginController implements Initializable {

    @FXML
    private Button login;

    @FXML
    private TextField password;

    @FXML
    private TextField username;
    @FXML
    private Pane pane;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub

    }

    @FXML
    public void loginAction() throws IOException {
        String username = this.username.getText();
        String password = this.password.getText();
        if (username.equals("lamis") == true && password.equals("lamis12345")) {
            Parent parent = FXMLLoader.load(getClass().getResource("Etudiant.fxml"));
            Scene scene = new Scene(parent);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
            stage.setResizable(false);
            this.pane.getScene().getWindow().hide();
        } else {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("login failed");
            a.show();
        }

    }

}
