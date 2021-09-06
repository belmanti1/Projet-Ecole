package ecoleh;




/**
 * 
 */
public class Professeur extends Employe {

    /**
     * Default constructor
     */
    public Professeur() {
    }

    private String Num_imm;
    private String Specialite;

    
    
    public String getNum_imm() {
        return Num_imm;
    }

    public void setNum_imm(String Num_imm) {
        this.Num_imm = Num_imm;
    }

    public String getSpecialite() {
        return Specialite;
    }

    public void setSpecialite(String Specialite) {
        this.Specialite = Specialite;
    }

    @Override
    public String toString() {
        return "Professeur{" + "Num_imm=" + Num_imm + ", Specialite=" + Specialite + '}';
    }



}