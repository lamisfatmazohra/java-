public class App {
    public static void main(String[] args) throws Exception {
        CompteBancaire compte = new CompteBancaire("lamis", 100000000);
        compte.affiche();
        compte.depot(1456000);
        compte.affiche();
        compte.retrait(1470);
        compte.affiche();
    }
}
