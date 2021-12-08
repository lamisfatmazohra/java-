public class TableMultiplication {
    private int A;
    private int i = 0;

    public TableMultiplication() {

    }

    public TableMultiplication(int A) {
        this.A = A;
    }

    public void prochain() {
        System.out.println(this.A * this.i);
        this.i = this.i + 1;
    }

}
