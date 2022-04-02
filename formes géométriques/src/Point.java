public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String toString() {
        return this.x + " " + this.y;
    }

    public double Dist(Point b) {
        return Math.sqrt(Math.abs(Math.pow((this.x - b.x), 2) - Math.pow((this.y - b.y), 2)));

    }
}
