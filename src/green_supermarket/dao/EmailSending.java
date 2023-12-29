/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package green_supermarket.dao;

import connection.MyConnection;
import green_supermarket.user.UserDashboard;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailSending {

    Connection con;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;

    public EmailSending() throws SQLException {
        this.con = MyConnection.getConnection();
    }

    public void sendemail() {
        String Toemail = UserDashboard.UserEmail.getText();
        String Fromemail = "supermarketgreen4@gmail.com";
        String password = "lqnt kaex uqrb cjxc";
        String Subject = "Your email subject";
        
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
            @Override

            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("supermarketgreen4@gmail.com", "lqnt kaex uqrb cjxc");
            }
        });

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(Fromemail));
            message.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(Toemail));
            message.setSubject(Subject);
            message.setText("bill");
            Transport.send(message);
        } catch (Exception ex) {
            System.out.println("cha" + ex);
        }

    }

}
