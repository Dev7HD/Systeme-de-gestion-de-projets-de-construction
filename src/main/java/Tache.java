import java.util.ArrayList;
import java.util.List;

public class Tache {
    private String nom;
    private int dureeEstimee;
    private List<Employe> employes;
    private List<RessourceMaterielle> ressources;

    public Tache(String nom, int dureeEstimee) {
        this.nom = nom;
        this.dureeEstimee = dureeEstimee;
        this.employes = new ArrayList<>();
        this.ressources = new ArrayList<>();
    }

    public void ajouterEmploye(Employe employe) {
        if (!employes.contains(employe)) {
            employes.add(employe);
        }
    }

    public void ajouterRessource(RessourceMaterielle ressource) {
        ressources.add(ressource);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDureeEstimee() {
        return dureeEstimee;
    }

    public void setDureeEstimee(int dureeEstimee) {
        this.dureeEstimee = dureeEstimee;
    }

    public List<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }

    public List<RessourceMaterielle> getRessources() {
        return ressources;
    }

    public void setRessources(List<RessourceMaterielle> ressources) {
        this.ressources = ressources;
    }
}
