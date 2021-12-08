public class Domino {
    private int A, B;

    public Domino() {

    }

    public Domino(int A, int B) {
        this.A = A;
        this.B = B;
    }

    public void affichePoints() {
        System.out.println(this.A + " " + this.B);
    }

    public int totale() {
        return this.A + this.B;
    }

}
