import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Produit {
    private StringProperty codebarre, designiation, reference, fournisseur, unite;
    private IntegerProperty quantite;
    private DoubleProperty prix;

    public Produit(String codebarre, String designiation, String reference, String fournisseur, String unite,
            int quantite, double prix) {
        this.codebarre = new SimpleStringProperty(codebarre);
        this.designiation = new SimpleStringProperty(designiation);
        this.reference = new SimpleStringProperty(reference);
        this.fournisseur = new SimpleStringProperty(fournisseur);
        this.unite = new SimpleStringProperty(unite);
        this.quantite = new SimpleIntegerProperty(quantite);
        this.prix = new SimpleDoubleProperty(prix);
    }

    public String getCodebarre() {
        return this.codebarre.get();
    }

    public void setCodebarre(String codebarre) {
        this.codebarre.set(codebarre);
    }

    public StringProperty getcodeProperty() {
        return this.codebarre;
    }

    public String getDesigniation() {
        return this.designiation.get();
    }

    public void setDesigniation(String designiation) {
        this.designiation.set(designiation);
    }

    public StringProperty getDesigniationProperty() {
        return this.designiation;
    }

    public String getReference() {
        return this.reference.get();
    }

    public void setReference(String reference) {
        this.reference.set(reference);
    }

    public StringProperty getreferenceProperty() {
        return this.reference;
    }

    public String getFournaisseur() {
        return this.fournisseur.get();
    }

    public void setFournaisseur(String fournaisseur) {
        this.fournisseur.set(fournaisseur);
    }

    public StringProperty getfournaisseurProperty() {
        return this.fournisseur;
    }

    public String getUnite() {
        return this.unite.get();
    }

    public void setUnite(String unite) {
        this.unite.set(unite);
    }

    public StringProperty getuniteProperty() {
        return this.unite;
    }

    public int getQuantite() {
        return this.quantite.get();
    }

    public void setQuantite(int quantite) {
        this.quantite.set(quantite);
    }

    public IntegerProperty getquantiteProperty() {
        return this.quantite;
    }

    public double getPrix() {
        return this.prix.get();
    }

    public void setPrix(double prix) {
        this.prix.set(prix);
    }

    public DoubleProperty getprixProperty() {
        return this.prix;
    }

}
