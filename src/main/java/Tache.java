import java.util.ArrayList;
import java.util.List;

/**
 * Représente une tâche dans un projet de construction.
 */
public class Tache {
    private String nom;
    private int dureeEstimee;
    private List<Employe> employes;
    private List<RessourceMaterielle> ressources;

    /**
     * Construit une Tache avec un nom et une durée estimée donnés.
     *
     * @param nom Le nom de la tâche.
     * @param dureeEstimee La durée estimée de la tâche en jours.
     */
    public Tache(String nom, int dureeEstimee) {
        this.nom = nom;
        this.dureeEstimee = dureeEstimee;
        this.employes = new ArrayList<>();
        this.ressources = new ArrayList<>();
    }

    /**
     * Ajoute un employé à la tâche s'il n'est pas déjà assigné.
     *
     * @param employe L'employé à ajouter.
     */
    public void ajouterEmploye(Employe employe) {
        if (!employes.contains(employe)) {
            employes.add(employe);
        }
    }


    /**
     * Ajoute une ressource matérielle à la tâche.
     *
     * @param ressource La ressource matérielle à ajouter.
     */
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
