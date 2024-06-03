/**
 * Représente un employé dans le projet de construction.
 */
public class Employe extends Personne {
    private Role role;

    /**
     * Construit un Employe avec le rôle spécifié.
     *
     * @param role Le rôle de l'employé.
     */
    public Employe(Role role) {
        this.role = role;
    }

    /**
     * Construit un Employe avec les détails spécifiés.
     *
     * @param nom Le nom de l'employé.
     * @param salaire Le salaire de l'employé.
     * @param matricule Le numéro de matricule de l'employé.
     * @param age L'âge de l'employé.
     * @param email L'email de l'employé.
     * @param numTel Le numéro de téléphone de l'employé.
     * @param role Le rôle de l'employé.
     */
    public Employe(String nom, double salaire, long matricule, int age, String email, String numTel, Role role) {
        super(nom, salaire, matricule, age, email, numTel);
        this.role = role;
    }

    public Employe() {
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
