/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecoleh;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author badra
 */
public class LogFiles {
    /** Recueillir les donnees d'un utilisateur quand il se connecte
     * @param name Nom de la personne
     * @param type type de la personne (employe | etudiant)
     */
    static void log(String name, String type) throws IOException{
        Date aujourdhui = new Date();
        //module de formattage de la date
        DateFormat dateFormat = DateFormat.getDateTimeInstance(
        DateFormat.MEDIUM,
        DateFormat.MEDIUM, new Locale("FR","fr"));
        //Ecriture des informations
        FileWriter writer = new FileWriter("C:\\Users\\pc hp\\OneDrive\\Documents\\log_file.txt", true);
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write(name);
        buffer.newLine();
        buffer.write(type);
        buffer.newLine();
        buffer.write(dateFormat.format(aujourdhui));
        buffer.newLine();
        buffer.write("-------------------------------");
        buffer.newLine();
        buffer.close();
        
    }
}
