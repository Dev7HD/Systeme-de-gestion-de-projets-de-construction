import java.util.List;

public class Main {
    public static void main(String[] args) {
        Projet projet = new Projet("Projet de construction d'une maison");

        Tache tache1 = new Tache("Fondations", 10);
        Personne personne1 = new Employe("Ahmed",5500,112233,26,"Ahmed@gmail.com","0680345678",Role.CONSTRUCTEUR);
        Personne personne2 = new Employe("Ali",16500,223344,32,"Ali@gmail.com","0661345678",Role.INGENIEUR);
        tache1.ajouterEmploye((Employe) personne1);
        tache1.ajouterEmploye((Employe) personne2);
        tache1.ajouterRessource(new RessourceMaterielle("Béton", 1000));
        projet.ajouterTache(tache1);

        System.out.println("Nom du projet : " + projet.getNom());
        System.out.println("Liste des tâches : ");
        for (Tache tache : projet.getTaches()) {
            System.out.printf("- %s, Durée estimée : %d jours.%n", tache.getNom(), tache.getDureeEstimee());
            List<Employe> liste = tache.getEmployes();
            System.out.println("  - List des employes du tache : " );
            for (Employe employe : liste) {
                System.out.printf("   + %s, Mle %d, son role: %s %n", employe.getNom(),employe.getMatricule(), employe.getRole());
            }
            List<RessourceMaterielle> listRessourceMaterielle = tache.getRessources();
            for (RessourceMaterielle ressourceMaterielle : listRessourceMaterielle) {
                System.out.printf("  - Les ressources du tache : %s, d'une quantitée de %d Kg%n", ressourceMaterielle.getNom(), ressourceMaterielle.getQuantite() );
            }
    }
}

}
