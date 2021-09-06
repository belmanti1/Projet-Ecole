package ecoleh;


/**
 * 
 */
public class Employe extends Personne {

    /**
     * Default constructor
     */
    public Employe() {
    }

  
    private String ID_emp;
    private String Salaire;
    private String Date_emb;
    private String Grade;
    
    
    

    public String getID_emp() {
        return ID_emp;
    }

    public void setID_emp(String ID_emp) {
        this.ID_emp = ID_emp;
    }

    public String getSalaire() {
        return Salaire;
    }

    public void setSalaire(String Salaire) {
        this.Salaire = Salaire;
    }

    public String getDate_emb() {
        return Date_emb;
    }

    public void setDate_emb(String Date_emb) {
        this.Date_emb = Date_emb;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String Grade) {
        this.Grade = Grade;
    }

    @Override
    public String toString() {
        return "Employe{" + "ID_emp=" + ID_emp + ", Salaire=" + Salaire + ", Date_emb=" + Date_emb + ", Grade=" + Grade + '}';
    }

    @Override
    public void Connect() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    

}