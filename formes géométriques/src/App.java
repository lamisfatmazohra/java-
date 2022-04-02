public class App {
    public static void main(String[] args) throws Exception {
        Cercle c = new Cercle(new Point(25.2, 10), 10.3);
        Segment s = new Segment(new Point(10.8, 50), new Point(18, 14.5));
        Carre r = new Carre(new Point(25, 48), new Point(2.5, 4), new Point(5, 5), new Point(36, 42));
        c.getInfos();
        s.getInfos();
        r.getInfos();
    }
}
