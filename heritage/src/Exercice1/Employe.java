package Exercice1;

public class Employe extends Personne {
    private double salaire;

    public Employe(String nom, String prenom, int date, double salaire) {
        super(nom, prenom, date);
        this.salaire = salaire;
        // TODO Auto-generated constructor stub
    }

    public double getSalaire() {
        return this.salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public void Afficher() {
        super.Afficher();
        System.out.println(this.salaire);
    }

}
