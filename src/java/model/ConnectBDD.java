package model;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ConnectBDD {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    
    static Connection connection = null; 
    static Statement statement = null;
    static ResultSet resultSet ;
    static ResultSetMetaData metaData;
    
public static void init(){
 try{         
             Class.forName("com.mysql.jdbc.Driver");
             connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/cvtheque?zeroDateTimeBehavior=convertToNull","root","");
        }catch(Exception e){
             e.printStackTrace();
        }
}
public static List<Tableau> RechercheSimple(String Promotion,String Genie){
    try{
            PreparedStatement ps = connection.prepareStatement("select * from emistecv where Promotion=? and Genie=?");
            ps.setString(1, Promotion);
            ps.setString(2, Genie);
            resultSet = ps.executeQuery();
            List<Tableau> list = new ArrayList<>();
            while(resultSet.next()){
                    Tableau ligne= new Tableau(resultSet.getInt("Matricule"),resultSet.getString("Nom"),resultSet.getString("Prenom"),resultSet.getDate("Date_N"),resultSet.getString("Genie"),resultSet.getInt("Promotion"));
                    list.add(ligne);
            }
            return list;
            
    } catch(Exception e){
        e.printStackTrace();
    }
    return null;
}
public static List<Tableau> RechercheAvancée(String Promotion,String Genie,String Nom, String Prenom ,String TF , String TE){
    try{
            if("".equals(Nom) && !"".equals(Prenom)){
                PreparedStatement ps = connection.prepareStatement("Select * from emistecv,formation,experience where emistecv.Promotion=? and emistecv.Genie=? and emistecv.Prenom=? and formation.Type=? and experience.Type=? and Formation.id_f=emistecv.id_f and experience.id_xp=emistecv.id_xp");
                ps.setString(1, Promotion);
                ps.setString(2, Genie);
                ps.setString(3, Prenom);
                ps.setString(4, TF);
                ps.setString(5, TE);
                resultSet = ps.executeQuery();
            }
            else if("".equals(Prenom) && !"".equals(Nom) ){
                PreparedStatement ps = connection.prepareStatement("Select * from emistecv,formation,experience where emistecv.Promotion=? and emistecv.Genie=? and emistecv.Nom=? and formation.Type=? and experience.Type=? and Formation.id_f=emistecv.id_f and experience.id_xp=emistecv.id_xp");
                ps.setString(1, Promotion);
                ps.setString(2, Genie);
                ps.setString(3, Nom);
                ps.setString(4, TF);
                ps.setString(5, TE);
                resultSet = ps.executeQuery();
            }
            else if("".equals(Nom) && "".equals(Prenom)){
                PreparedStatement ps = connection.prepareStatement("Select * from emistecv,formation,experience where emistecv.Promotion=? and emistecv.Genie=? and formation.Type=? and experience.Type=? and Formation.id_f=emistecv.id_f and experience.id_xp=emistecv.id_xp");
                ps.setString(1, Promotion);
                ps.setString(2, Genie);
                ps.setString(3, TF);
                ps.setString(4, TE);
                resultSet = ps.executeQuery();
            }
            else{
                PreparedStatement ps = connection.prepareStatement("Select * from emistecv,formation,experience where emistecv.Promotion=? and emistecv.Genie=? and emistecv.Nom=? and emistecv.Prenom=? and formation.Type=? and experience.Type=? and Formation.id_f=emistecv.id_f and experience.id_xp=emistecv.id_xp");
                ps.setString(1, Promotion);
                ps.setString(2, Genie);
                ps.setString(3, Nom);
                ps.setString(4, Prenom);
                ps.setString(5, TF);
                ps.setString(6, TE);
                resultSet = ps.executeQuery();
            }
            List<Tableau> list = new ArrayList<>();
            while(resultSet.next()){
                    Tableau ligne= new Tableau(resultSet.getInt("Matricule"),resultSet.getString("Nom"),resultSet.getString("Prenom"),resultSet.getDate("Date_N"),resultSet.getString("Genie"),resultSet.getInt("Promotion"));
                    list.add(ligne);
            }
            return list;
            
            
            
    } catch(Exception e){
        e.printStackTrace();
    }
    return null;
}
public static List<Entreprise> RechercheEntreprise(String Domaine,String Secteur){
    try{
            PreparedStatement ps = connection.prepareStatement("select * from entreprise where Domaine=? and Secteur=?");
            ps.setString(1, Domaine);
            ps.setString(2, Secteur);
            resultSet = ps.executeQuery();
            List<Entreprise> list = new ArrayList<>();
            while(resultSet.next()){
                    Entreprise ligne= new Entreprise(resultSet.getString("Name"),resultSet.getString("Domaine"),resultSet.getString("Secteur"),resultSet.getString("description"),resultSet.getInt("tel"),resultSet.getInt("fax"));
                    list.add(ligne);
            }
            return list;
            
    } catch(Exception e){
        e.printStackTrace();
    }
    return null;
}
}
