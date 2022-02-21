package GestionEtudiant;

import java.util.ArrayList;

public class Etudiant {
    private String nom;
    private ArrayList<Double> notes;
    private double moyenne;

    public Etudiant(String nom) {
        this.nom = nom;
        this.moyenne = 0;
        this.notes = new ArrayList<Double>();
    }

    public String getNom() {
        return this.nom;
    }

    public ArrayList<Double> getNote() {
        return this.notes;
    }

    public double getMoyenne() {
        return this.moyenne;
    }

    public void ajouterNote(double note) {
        if (note < 0)
            note = 0;
        if (note > 20)
            note = 20;
        this.notes.add(note);
        if (this.notes.size() == 1)
            this.moyenne = note;
        else
            this.moyenne = (this.moyenne + note) / 2;
    }

    public String toString() {
        return this.nom + "(" + this.moyenne + ")";
    }
}
