public class Segment implements Forme {
    private Point p1, p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return this.p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return this.p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public double Longeur() {
        return this.p1.Dist(this.p2);
    }

    @Override
    public void getInfos() {
        System.out.println(
                "segment \n" +
                        this.p1.toString() +
                        "\n p2 " + this.p2.toString() +
                        "\n longeur " + this.Longeur());
        // TODO Auto-generated method stub

    }
}
