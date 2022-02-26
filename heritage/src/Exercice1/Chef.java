package Exercice1;

public class Chef extends Employe {
    private String service, prop;

    public Chef(String nom, String prenom, int date, double salaire, String service, String prop) {
        super(nom, prenom, date, salaire);
        this.service = service;
        this.prop = prop;
        // TODO Auto-generated constructor stub
    }

    public String getService() {
        return this.service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getProp() {
        return this.prop;
    }

    public void setProp(String prop) {
        this.prop = prop;
    }

    public void Afficher() {
        super.Afficher();
        System.out.println(this.service + " " + this.prop);
    }

}
