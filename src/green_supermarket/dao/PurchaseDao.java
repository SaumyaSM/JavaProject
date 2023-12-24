
package green_supermarket.dao;

import connection.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PurchaseDao {

    Connection con;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;

    public PurchaseDao() throws SQLException {
        this.con = MyConnection.getConnection();
    }
    
    //get purchase table max row
    public int getMaxRow() {
        int row = 0;
        try {
            st = con.createStatement();
            rs = st.executeQuery("select max(id) from purchase");
            while (rs.next()) {
                row = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row + 1;
    }
    
     //get user value
    public String[] getUserValue(String email) {
        String[] value = new String[5];
        String sql = "select uid,uname,uphone,uaddress1,uaddress2 from user where uemail = '"+email+"'";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                value[0] = rs.getString(1);
                value[1] = rs.getString(2);
                value[2] = rs.getString(3);
                value[3] = rs.getString(4);
                value[4] = rs.getString(5);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return value;
    }
    
    //insert data into user table
    public void insert(int id, int uid, String uname, String uphone, int pid, String pname, 
            int qty, double price, double total, String pDate, String address,String rDate,
            String supplier, String status){
        String sql = "insert into purchase values(?,?,?,?,?,?,?,?,?,?,?,?,?,?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setInt(2, uid);
            ps.setString(3, uname);
            ps.setString(4, uphone);
            ps.setInt(5, pid);
            ps.setString(6, pname);
            ps.setInt(7, qty);
            ps.setDouble(8, price);
            ps.setDouble(9, total);
            ps.setString(10, pDate);
            ps.setString(11, address);
            ps.setString(12, rDate);
            ps.setString(13, supplier);
            ps.setString(14, status);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //get product quantity
    public int getQty(int pid){
        int qty = 0;
        try {
            st = con.createStatement();
            rs = st.executeQuery("select pqty from product where pid = " + pid + "");
            if(rs.next())
                qty = rs.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return qty;
    }
    
    //update product quantity
    public void qtyUpdate(int pid, int qty){
        String sql = "update product set pqty = ? where pid = ?";
        try {        
            ps = con.prepareStatement(sql);      
            ps.setInt(1, qty);
            ps.setInt(2, pid);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

