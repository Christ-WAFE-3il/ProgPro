package model;

public class Parent {
    private int idParent;
    private String nomParent;
    private String telephone;
    private String email;
    private String adresse;

    public Parent(int idParent, String nomParent, String telephone, String email, String adresse) {
        this.idParent = idParent;
        this.nomParent = nomParent;
        this.telephone = telephone;
        this.email = email;
        this.adresse = adresse;
    }

    // Getters et setters
    public int getIdParent() {
        return idParent;
    }

    public String getNomParent() {
        return nomParent;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public String getAdresse() {
        return adresse;
    }

    // Redéfinition toString()
    @Override
    public String toString() {
        return "Parent{" +
                "idParent=" + idParent +
                ", nom='" + nomParent + '\'' +
                ", téléphone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }
}
