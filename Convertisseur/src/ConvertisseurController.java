import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class ConvertisseurController<Button> implements Initializable {

    @FXML
    private Text Convertisseur;

    @FXML
    private TextField nombre;

    @FXML
    private TextField resultat;

    @FXML
    private TextField unite;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub

    }

    @FXML
    public void ConvertirNombre() {
        String unite = this.unite.getText();
        double nombre = Double.valueOf(this.nombre.getText());
        if (unite.equals("kg"))
            this.resultat.setText(String.valueOf(nombre / 1000));
        else
            this.resultat.setText(String.valueOf(nombre * 1000));
    }

}
