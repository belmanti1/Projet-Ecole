package ecoleh;


/**
 * 
 */
public class Etudiant extends Personne {
    
    private String CNE;
    private String Niveau;
    private String Annee_entr;

    /**
     * Default constructor
     */
    public Etudiant() {
    }

    public Etudiant(String CIN, String Nom, String Prenom, String dateNaiss, String Adresse, String Tel, String Email, String PWD,String type_personne, String CNE, String Niveau, String Annee_entr) {
        super( CIN,  Nom,  Prenom,  dateNaiss,  Adresse,  Tel,  Email,  PWD, type_personne);
        this.CNE = CNE;
        this.Niveau = Niveau;
        this.Annee_entr = Annee_entr;
        
        
    }

 
    
    
  

    
    
    public String getCNE() {
        return CNE;
    }

    public void setCNE(String CNE) {
        this.CNE = CNE;
    }

    public String getNiveau() {
        return Niveau;
    }

    public void setNiveau(String Niveau) {
        this.Niveau = Niveau;
    }

    public String getAnnee_entr() {
        return Annee_entr;
    }

    public void setAnnee_entr(String Annee_entr) {
        this.Annee_entr = Annee_entr;
    }

    @Override
    public String toString() {
        return "Etudiant{" + "CNE=" + CNE + ", Niveau=" + Niveau + ", Annee_entr=" + Annee_entr + '}';
    }

    @Override
    public void Connect() {
       if (this.CNE=="2763" && super.getDateNaiss().toString().equals("12/10/2001") &&  super.getPWD().equals("etud12")){
           System.out.println("Authentification reussie");
       }
       
       else
           System.out.println("Informations erron�es : Veuillez r�-essayer");
                            
               }






}