import GestionEmploye.Employe;
import GestionEtudiant.Etudiant;

public class App {
    public static void main(String[] args) throws Exception {
        Etudiant etd;
        etd = new Etudiant("lamis");
        etd.ajouterNote(17);
        etd.ajouterNote(16);
        etd.ajouterNote(16.5);
        System.out.println(etd.toString());
        Employe emp;
        emp = new Employe(15826, "lamis", "fatma", 100000000);
        emp.ajoutezPrime(256900);
        emp.Affichage();

    }

}
