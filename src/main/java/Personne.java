public class Personne {
    private String nom;
    private double salaire;
    private long matricule;
    private int age;
    private String email;
    private String numTel;

    public Personne() {

    }
    public Personne(String nom, double salaire, long matricule, int age, String email, String numTel) {
        this.nom = nom;
        this.salaire = salaire;
        this.matricule = matricule;
        this.age = age;
        this.email = email;
        this.numTel = numTel;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public long getMatricule() {
        return matricule;
    }

    public void setMatricule(long matricule) {
        this.matricule = matricule;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }
}
