import java.util.ArrayList;
import java.util.Scanner;

import Exercice1.Chef;
import Exercice1.Employe;
import Exercice1.Personne;
import Exercice2.Palindrome;
import Exercice2.Palindrome2;

public class App {
    public static void main(String[] args) throws Exception {
        // exercice1
        // ArrayList<Personne> per = new ArrayList<Personne>();
        // per.add(new Employe("lamis", "zohra", 2001, 30000));
        // per.add(new Employe("nesrine", "zohra", 2001, 28000));
        // per.add(new Employe("fatiha", "zohra", 2000, 250000));
        // per.add(new Employe("manel", "asma", 2001, 10000));
        // per.add(new Employe("dua", "serine", 2001, 45000));
        // per.add(new Employe("yamina", "sonia", 2003, 50000));
        // per.add(new Chef("lamis", "zohra", 2001, 30000, "informatique",
        // "developpeur"));
        // per.add(new Chef("nesrine", "zohra", 2001, 28000, "informatique", "IA"));
        // for (Personne p : per) {
        // if (p instanceof Employe) {
        // ((Employe) p).Afficher();
        // } else {
        // ((Chef) p).Afficher();
        // }
        // System.out.println();
        // }
        // System.out.println("affichage des employes >=45000");

        // for (Personne p : per) {
        // if (p instanceof Employe) {
        // if (((Employe) p).getSalaire() >= 45000) {
        // ((Employe) p).Afficher();
        // }
        // }
        // }

        // exercice2

        Scanner sc = new Scanner(System.in);
        // System.out.println("donnez une chaine de caractere");
        // String chaine = sc.next();
        // Palindrome p = new Palindrome();
        // String Inverse = p.Inverse(chaine);
        // System.out.println("l'inverse de " + chaine + " est " + Inverse);
        // boolean palind = chaine.equals(Inverse);
        // if (palind == true)
        // System.out.println(chaine + " est palindrome");
        // else
        // System.out.println(chaine + " n'est pas palindrome");

        System.out.println("donnez une phrase");
        String phrase = sc.nextLine();
        Palindrome2 p2 = new Palindrome2();
        String phraseInverse = p2.Inverse(phrase);
        System.out.println("l'inverse de " + phrase + " est " + phraseInverse);
    }

}
