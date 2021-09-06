package ecoleh;
import java.util.*;

/**
 * 
 */
public class Cours {
      private Date Date_cours;

 
    private int duree;

  
    private String Salle;
    /**
     * Default constructor
     */
    public Cours() {
    }



    public Date getDate_cours() {
        return Date_cours;
    }

    public void setDate_cours(Date Date_cours) {
        this.Date_cours = Date_cours;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getSalle() {
        return Salle;
    }

    public void setSalle(String Salle) {
        this.Salle = Salle;
    }

    @Override
    public String toString() {
        return "Cours{" + "Date_cours=" + Date_cours + ", duree=" + duree + ", Salle=" + Salle + '}';
    }
    
    

}