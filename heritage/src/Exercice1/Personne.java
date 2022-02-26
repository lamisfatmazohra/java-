package Exercice1;

public class Personne {
    private String nom, prenom;
    private int date;

    public Personne(String nom, String prenom, int date) {
        this.nom = nom;
        this.prenom = prenom;
        this.date = date;
    }

    public String getNom() {
        return this.nom;
    }

    public String prenom() {
        return this.prenom;
    }

    public int getDate() {
        return this.date;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void Afficher() {
        System.out.println(this.nom + " " + this.prenom + " " + this.date);
    }

}
