public class Cercle implements Forme {
    private Point p;
    private double rayon;

    public Cercle(Point p, double rayon) {
        this.p = p;
        this.rayon = rayon;
    }

    public Point getP() {
        return this.p;
    }

    public void setP(Point p) {
        this.p = p;
    }

    public double getRayon() {
        return this.rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public double Aire() {
        return Math.pow(this.rayon, 2) * Math.PI;
    }

    public double Contour() {
        return 2 * Math.PI * this.rayon;
    }

    @Override
    public void getInfos() {
        System.out.println("cerle:\n" +
                this.p.toString() +
                "\n rayon " + this.rayon +
                "\n aire " + this.Aire()
                + "\n contour " + this.Contour());

        // TODO Auto-generated method stub

    }

}
