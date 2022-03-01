package hellofx;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Controller implements Initializable {

    @FXML
    private Text affichage;

    @FXML
    private Button code;

    @FXML
    private Button enumeration;

    @FXML
    private Button exception;

    @FXML
    private Button inherit;

    @FXML
    private Button interfac;

    @FXML
    private Text javacontent;

    @FXML
    private Button serverside;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
        // this.affichage.setVisible(false);

    }

    @FXML
    public void clicClass() {
        this.affichage.setText("j'ai cliquer sur " + this.code.getText());
        this.affichage.setVisible(true);
    }

    @FXML
    public void clicInherit() {
        this.affichage.setText("j'ai cliquer sur " + this.inherit.getText());
        this.affichage.setVisible(true);
    }

    @FXML
    public void clicException() {
        this.affichage.setText("j'ai cliquer sur " + this.exception.getText());
        this.affichage.setVisible(true);
    }

    @FXML
    public void clicEnumeration() {
        this.affichage.setText("j'ai cliquer sur " + this.enumeration.getText());
        this.affichage.setVisible(true);
    }

    @FXML
    public void clicInterfac() {
        this.affichage.setText("j'ai cliquer sur " + this.interfac.getText());
        this.affichage.setVisible(true);
    }

    @FXML
    public void clicServerSide() {
        this.affichage.setText("j'ai cliquer sur " + this.serverside.getText());
        this.affichage.setVisible(true);
    }

}
