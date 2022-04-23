import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.print.PrinterJob;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;

public class InventaireController implements Initializable {

    @FXML
    private Pane pane1;

    @FXML
    private TextArea text;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub

    }

    public void init(String text) {
        this.text.setText(text);
        PrinterJob job = PrinterJob.createPrinterJob();
        if (job != null) {
            boolean reussi = job.printPage(pane1);
            job.showPrintDialog(this.text.getScene().getWindow());
            if (reussi == true) {
                job.endJob();
                // this.text.getScene().getWindow().hide();
            }
        }
    }

}
