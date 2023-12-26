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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class Statistics {

    Connection con;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    
    public Statistics() throws SQLException {
        this.con = MyConnection.getConnection();
    }

    public int total(String tableName) {
        int total = 0;
        try {
            st = con.createStatement();
            rs = st.executeQuery("select count(*) as 'total' from " + tableName + "");
            if (rs.next()) {
                total = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Statistics.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }

    public double totalSales() {
        double total = 0.0;
        try {
            st = con.createStatement();
            rs = st.executeQuery("select sum(total) as 'total' from purchase");
            if (rs.next()) {
                total = rs.getDouble(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Statistics.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }

    public double todaySales() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date date = new Date();
        String today = sdf.format(date);
        double total = 0.0;
        try {
            st = con.createStatement();
            rs = st.executeQuery("select sum(total) as 'total' from purchase where p_date = "+today+"");
            if (rs.next()) {
                total = rs.getDouble(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Statistics.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }
    
    public double totalPurchase(int id) {
        double total = 0.0;
        try {
            st = con.createStatement();
            rs = st.executeQuery("select sum(total) as 'total' from purchase where uid = "+id+"");
            if (rs.next()) {
                total = rs.getDouble(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Statistics.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }

    //admin dashhboard
//    video 27 time-9.43 tp 13.54
    
    //user
    public void user(int id){
        UserDashboard.jCat.setText(String.valueOf(total("category")));
        UserDashboard.jPro.setText(String.valueOf(total("product")));
        UserDashboard.jPur.setText(String.valueOf(totalPurchase(id)));
    }
}
