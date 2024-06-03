import java.util.ArrayList;
import java.util.List;

public class Projet {
    private String nom;
    private List<Tache> taches;

    public Projet(String nom) {
        this.nom = nom;
        this.taches = new ArrayList<>();
    }

    public Projet() {
    }

    public void ajouterTache(Tache tache) {
        taches.add(tache);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Tache> getTaches() {
        return taches;
    }

    public void setTaches(List<Tache> taches) {
        this.taches = taches;
    }
}
