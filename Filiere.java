    package ecoleh;
import java.util.*;

/**
 * 
 */
public class Filiere {

    /**
     * Default constructor
     */
    public Filiere() {
    }

 
    private String Ref_fil;
    private String Nom_fil;
    

    public String getRef_fil() {
        return Ref_fil;
    }

    public void setRef_fil(String Ref_fil) {
        this.Ref_fil = Ref_fil;
    }

    public String getNom_fil() {
        return Nom_fil;
    }

    public void setNom_fil(String Nom_fil) {
        this.Nom_fil = Nom_fil;
    }

    @Override
    public String toString() {
        return "Filiere{" + "Ref_fil=" + Ref_fil + ", Nom_fil=" + Nom_fil + '}';
    }


    
}