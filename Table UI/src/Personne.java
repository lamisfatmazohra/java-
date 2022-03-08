import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Personne {
    private StringProperty nom, prenom;
    private IntegerProperty age;

    public Personne(String nom, String prenom, int age) {
        this.nom = new SimpleStringProperty(nom);
        this.prenom = new SimpleStringProperty(prenom);
        this.age = new SimpleIntegerProperty(age);
    }

    public String getNom() {
        return this.nom.get();
    }

    public void setNom(String nom) {
        this.nom.set(nom);
        ;
    }

    public String getPrenom() {
        return this.prenom.get();
    }

    public void setPrenom(String prenom) {
        this.prenom.set(prenom);
    }

    public int getAge() {
        return this.age.get();
    }

    public void setAge(int age) {
        this.age.set(age);
        ;
    }

    public StringProperty getNomProperty() {
        return this.nom;
    }

    public StringProperty getPrenomProperty() {
        return this.prenom;
    }

    public IntegerProperty getAgProperty() {
        return this.age;
    }
}
