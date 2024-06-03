public class Employe extends Personne {
    private Role role;

    public Employe(Role role) {
        this.role = role;
    }

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
