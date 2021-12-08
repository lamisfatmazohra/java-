public class CompteBancaire {
    private String nomTitulaire;
    private double solde = 0;

    public CompteBancaire() {

    }

    public CompteBancaire(String nom, double solde) {
        this.nomTitulaire = nom;
        this.solde = solde;
    }

    public CompteBancaire(String nom) {
        this.nomTitulaire = nom;
    }

    public void depot(double somme) {
        this.solde = this.solde + somme;
    }

    public void retrait(double somme) {
        this.solde = this.solde - somme;
    }

    public void affiche() {
        System.out.println(this.solde);
    }
}