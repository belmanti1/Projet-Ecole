package ecoleh;


/**
 * 
 */
public class Administration extends Employe {

    /**
     * Default constructor
     */
    public Administration() {
    }

  
    private String Ref_admin;

   
    private String Responsabilite;

    public String getRef_admin() {
        return Ref_admin;
    }

    public void setRef_admin(String Ref_admin) {
        this.Ref_admin = Ref_admin;
    }

    public String getResponsabilite() {
        return Responsabilite;
    }

    public void setResponsabilite(String Responsabilite) {
        this.Responsabilite = Responsabilite;
    }

    @Override
    public String toString() {
        return "Administration{" + "Ref_admin=" + Ref_admin + ", Responsabilite=" + Responsabilite + '}';
    }

    
    
    
}