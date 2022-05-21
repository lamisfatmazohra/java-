import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Client {
    private StringProperty nom, prenom, daten, adresse;

    public Client(String nom, String prenom, String daten, String adr) {
        this.nom = new SimpleStringProperty(nom);
        this.prenom = new SimpleStringProperty(prenom);
        this.daten = new SimpleStringProperty(daten);
        this.adresse = new SimpleStringProperty(adr);
    }

    public StringProperty getNomProperty() {
        return this.nom;
    }

    public String getNom() {
        return this.nom.get();
    }

    public void setNom(String nom) {
        this.nom.set(nom);
    }

    public StringProperty getPrenomProperty() {
        return this.prenom;
    }

    public String getPrenom() {
        return this.prenom.get();
    }

    public void setPrenom(String prenom) {
        this.prenom.set(prenom);
    }

    public StringProperty getDatenProperty() {
        return this.daten;
    }

    public String getDaten() {
        return this.daten.get();
    }

    public void setDaten(String daten) {
        this.daten.set(daten);
    }

    public StringProperty getAdresseProperty() {
        return this.adresse;
    }

    public String getAdresse() {
        return this.adresse.get();
    }

    public void setAdresse(String adresse) {
        this.adresse.set(adresse);
    }

}
