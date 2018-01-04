/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import control.authentification;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ConnectBDD;
import model.Entreprise;
import model.Tableau;

/**
 *
 * @author Ahmed Yassin
 */
public class NewClass {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{ 
        try{
            EnvoyerMail mail = new EnvoyerMail();
            mail.envoyer("zzzz","Ahmed.bousarehane@gmail.com","hbhb");
            
    } catch(Exception e){
        e.printStackTrace();
    }
   
}
    }
