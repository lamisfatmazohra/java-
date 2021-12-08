public class Livre {
    private String nom;
    private int pages;

    public Livre() {

    }

    public Livre(String nom, int pages) {
        this.nom = nom;
        this.pages = pages;

    }

    public String getNom() {
        return this.nom;
    }

    public int getPages() {
        return this.pages;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String toString() {
        return this.nom + " " + this.pages + "pages";
    }
}
