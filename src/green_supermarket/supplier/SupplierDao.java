/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package green_supermarket.supplier;

import connection.MyConnection;
import green_supermarket.dao.Statistics;
import green_supermarket.dao.UserDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class SupplierDao {
    Connection con;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;

    public SupplierDao() throws SQLException {
        this.con = MyConnection.getConnection();
    }
    
    //get supplier table max row
    public int getMaxRow() {
        int row = 0;
        try {
            st = con.createStatement();
            rs = st.executeQuery("select max(sid) from supplier");
            while (rs.next()) {
                row = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row + 1;
    }

    //check email already exists
    public boolean isEmailExist(String email) {
        try {
            ps = con.prepareStatement("select * from supplier where semail = ?");
            ps.setString(1, email);
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //check phone number already exists
    public boolean isPhonelExist(String phone) {
        try {
            ps = con.prepareStatement("select * from supplier where sphone = ?");
            ps.setString(1, phone);
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //insert data into supplier table
    public void insert(int sid, String sname, String semail, String spassword, String sphone, String saddress1, String saddress2) {
        String sql = "insert into user values(?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, sid);
            ps.setString(2, sname);
            ps.setString(3, semail);
            ps.setString(4, spassword);
            ps.setString(5, sphone);
            ps.setString(6, saddress1);
            ps.setString(7, saddress2);
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Supplier added successfully");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //update supplier data
    public void update(int sid, String sname, String semail, String spassword, String sphone, String saddress1, String saddress2){
        String sql = "update user set sname = ?, semail =?, spassword = ?, sphone =?, saddress1 = ?, saddress2 = ? where sid = ?";
        try {        
            ps = con.prepareStatement(sql);
            ps.setString(1,sname);
            ps.setString(2,semail);
            ps.setString(3,spassword);
            ps.setString(4,sphone);
            ps.setString(5,saddress1);
            ps.setString(6,saddress2);
            ps.setInt(7, sid);
            if(ps.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Data updated successfully!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //delete supplier
    public void deleteSupplier(int id){
        int x = JOptionPane.showConfirmDialog(null, "Are you sure to delete this account?","Delete Account",JOptionPane.OK_CANCEL_OPTION,0);
        if(x == JOptionPane.OK_OPTION){
            try {
                ps = con.prepareStatement("Delete from supplier where sid = ?");
                ps.setInt(1,id);
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null, "Account deleted!");
                }
            } catch (SQLException ex) {
                Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public int countSuppliers(){
        int total = 0;
        try {
            st = con.createStatement ();
            rs = st.executeQuery ("select count (*) as 'total' from supplier");
            if(rs.next ()){
                total = rs.getInt (1) ;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }
    
    //get supplier value
    public String[] getSupplierValue(int id) {
        String[] value = new String[9];
        try {
            ps = con.prepareStatement("select * from supplier where sid = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                value[0] = rs.getString(1);
                value[1] = rs.getString(2);
                value[2] = rs.getString(3);
                value[3] = rs.getString(4);
                value[4] = rs.getString(5);
                value[5] = rs.getString(6);
                value[6] = rs.getString(7);
                value[7] = rs.getString(8);
                value[8] = rs.getString(9);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return value;
    }
    
    //get supplier id
    public int getSupplierId(String email) {
        int id = 0;
        try {
            ps = con.prepareStatement("select sid from user where semail = ?");
            ps.setString(1, email);
            rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            return id;
    }
}
