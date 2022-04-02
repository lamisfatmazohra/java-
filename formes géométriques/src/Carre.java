public class Carre implements Forme {
    private Point p1, p2, p3, p4;

    public Carre(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
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

    public Point getP3() {
        return this.p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    public Point getP4() {
        return this.p4;
    }

    public void setP4(Point p4) {
        this.p4 = p4;
    }

    public double Aire() {
        return Math.pow(this.p1.Dist(this.p2), 2);
    }

    public double Contour() {
        return (this.p1.Dist(this.p2)) * 4;
    }

    @Override
    public void getInfos() {
        System.out.println(
                "carre \n" +
                        this.p1.toString() +
                        "\n p2 " + this.p2.toString()
                        + "\n p3 " + this.p3.toString()
                        + "\n p4 " + this.p4.toString() +
                        "\n aire " + this.Aire()
                        + "\n contour " + this.Contour());

        // TODO Auto-generated method stub

    }

}
