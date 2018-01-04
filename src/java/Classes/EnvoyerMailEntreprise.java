/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


/**
 *
 * @author Ahmed Yassin
 */
public class EnvoyerMailEntreprise {
    private String username="cv.theque.emi@gmail.com";
    private String password="azerty.123";
    
    public void envoyer(String email,String nomentreprise){
        Properties props= new Properties();
        props.put("mail.smtp.auth","true");
        props.put("mail.smtp.starttls.enable","true");
        props.put("mail.smtp.host","smtp.gmail.com");
        props.put("mail.smtp.port","587");
        
        Session session = Session.getInstance(props,
                 new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
            }            
                 });
    
    try {
            // Etape 2 : Création de l'objet Message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("cv.theque.emi@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
            InternetAddress.parse(email));
            message.setSubject("Autorisation d'accès pour le site E-ME.");
            message.setText("Bonjour "+nomentreprise+ ", \nL'accès au site E-ME est désormais possible.\nCordialement,\n\nL'équipe E-ME.");
            // Etape 3 : Envoyer le message
            Transport.send(message);
            System.out.println("Message_envoye");
    } catch (MessagingException e) {
            throw new RuntimeException(e);
            } 
    }

}
