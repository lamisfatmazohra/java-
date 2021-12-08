public class App {
    public static void main(String[] args) throws Exception {
        Domino domino = new Domino(25, 15);
        domino.affichePoints();
        int somme = domino.totale();
        System.out.println(somme);
    }
}
