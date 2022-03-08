package GestionEmploye;

public class Employe {
    private int id;
    private String nom, prenom;
    private double salaire, prime;

    public Employe(int id, String nom, String prenom, double salaire) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
        this.prime = 0;
    }

    public int getId() {
        return this.id;
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public double getSalaire() {
        return this.salaire;
    }

    public double getPrime() {
        return this.prime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public void setPrime(double prime) {
        this.prime = prime;
    }

    public void ajoutezPrime(double prime) {
        this.salaire = this.salaire + prime;
    }

    public void Affichage() {
        System.out.println(this.nom + " " + this.salaire);
    }
}