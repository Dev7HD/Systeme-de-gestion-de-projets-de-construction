import java.util.List;

/**
 * Classe principale pour exécuter le système de gestion de projets de construction.
 */
public class Main {
    public static void main(String[] args) {
        // Création d'un nouveau projet
        Projet projet = new Projet("Projet de construction d'une maison");

        // Création d'une nouvelle tâche et ajout d'employés et de ressources à la tâche
        Tache tache1 = new Tache("Fondations", 10);

        // Création de deux employés en utilisant le polymorphisme
        Personne personne1 = new Employe("Ahmed",5500,112233,26,"Ahmed@gmail.com","0680345678",Role.CONSTRUCTEUR);
        Personne personne2 = new Employe("Ali",16500,223344,32,"Ali@gmail.com","0661345678",Role.INGENIEUR);

        // Assignés les employés à la tache
        tache1.ajouterEmploye((Employe) personne1);
        tache1.ajouterEmploye((Employe) personne2);

        // Définir les resources matérielle nécessaire à la tache
        tache1.ajouterRessource(new RessourceMaterielle("Béton", 1000));

        // L'ajout de la tache au projet
        projet.ajouterTache(tache1);

        // Affichage des informations du projet
        System.out.println("Nom du projet : " + projet.getNom());
        System.out.println("Liste des tâches : ");

        // Parcours des tâches du projet pour afficher les détails
        for (Tache tache : projet.getTaches()) {
            System.out.printf("- %s, Durée estimée : %d jours.%n", tache.getNom(), tache.getDureeEstimee());

            // Affichage des employés assignés à la tâche
            List<Employe> liste = tache.getEmployes();
            System.out.println("  - List des employes du tache : " );
            for (Employe employe : liste) {
                System.out.printf("   + %s, Mle %d, son role: %s %n", employe.getNom(),employe.getMatricule(), employe.getRole());
            }

            // Affichage des ressources matérielles assignées à la tâche
            List<RessourceMaterielle> listRessourceMaterielle = tache.getRessources();
            for (RessourceMaterielle ressourceMaterielle : listRessourceMaterielle) {
                System.out.printf("  - Les ressources du tache : %s, d'une quantitée de %d Kg%n", ressourceMaterielle.getNom(), ressourceMaterielle.getQuantite() );
            }
    }
}

}
