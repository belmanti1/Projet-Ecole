package ecoleh
        
        
        
        
        
        ;





/**
 * 
 */
public  class Personne {

    /**
     * Default constructor
     */
    public Personne() {
    }
    
    private String CIN;
    private String Nom;
    private String Prenom;
    private String dateNaiss;
    private String Adresse;
    private String Tel;
    private String Email;
    private String PWD;
    private String type_personne;


    public Personne(String CIN, String Nom, String Prenom, String dateNaiss, String Adresse, String Tel, String Email, String PWD,String ty) {
        
        this.CIN = CIN;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.dateNaiss = dateNaiss;
        this.Adresse = Adresse;
        this.Tel = Tel;
        this.Email = Email;
        this.PWD = PWD;
         this.type_personne = ty;
    }

   
    
    

  
   
    
    
    public String getCIN() {
        return CIN;
    }

    public void setCIN(String CIN) {
        this.CIN = CIN;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
        
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPWD() {
        return PWD;
    }

    public void setPWD(String PWD) {
        this.PWD = PWD;
    }

    public String getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(String dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public String getType_personne() {
        return type_personne;
    }

    public void setType_personne(String type_personne) {
        this.type_personne = type_personne;
    }

    @Override
    public String toString() {
        return "Personne{CIN=" + CIN + ", Nom=" + Nom + ", Prenom=" + Prenom + ", dateNaiss=" + dateNaiss + ", Adresse=" + Adresse + ", Tel=" + Tel + ", Email=" + Email + ", PWD=" + PWD + ", type_personne=" + type_personne + '}';
    }

   

  
    
    
    
    
   
   
    
    public void Connect(){
            System.out.println("function not used");
                    }
    // authentifier etudiant par CNE + DatedeNaissance + PWD
    // authentifier professeur par Num_imm + Email + PWD
    // authentifier administration par Email + PWD
    
}