package green_supermarket.dao;

import connection.MyConnection;
import green_supermarket.user.ForgotPassword;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ForgotPasswordDao {

    Connection con;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;

    public ForgotPasswordDao() throws SQLException {
        this.con = MyConnection.getConnection();
    }

    //check email already exists
    public boolean isEmailExist(String email) {
        try {
            ps = con.prepareStatement("select * from user where uemail = ?");
            ps.setString(1, email);
            rs = ps.executeQuery();
            if (rs.next()) {
                ForgotPassword.jTextField3.setText(rs.getString(6));
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Email address doesn't exist");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ForgotPasswordDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //getting secuirity answer
    public boolean getans(String email, String newAns) {
        try {
            ps = con.prepareStatement("select * from user where uemail = ?");
            ps.setString(1, email);
            rs = ps.executeQuery();
            if (rs.next()) {
                String oldAns = rs.getString(7);
                if (newAns.equals(oldAns)) {
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "Security answer didn't match");
                    return false;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ForgotPasswordDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    //set new password
    public void setPassword(String email,String password){
        String sql = "update user set upassword = ? where uemail = ?";
        try {        
            ps = con.prepareStatement(sql);
            ps.setString(1,password);
            ps.setString(2,email);
            if(ps.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Password updated successfully!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ForgotPasswordDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
