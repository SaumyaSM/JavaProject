
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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class CategoryDao {
    Connection con;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    
    public CategoryDao() throws SQLException {
        this.con = MyConnection.getConnection();
    }
    
    //get category table max row
    public int getMaxRow() {
        int row = 0;
        try {
            st = con.createStatement();
            rs = st.executeQuery("select max(cid) from category");
            while (rs.next()) {
                row = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row + 1;
    }
    
    //check category id exists
    public boolean isIDExist(int cid) {
        try {
            ps = con.prepareStatement("select * from category where cid = ?");
            ps.setInt(1, cid);
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
     //check category name exists
    public boolean isCategoryNameExist(String cname) {
        try {
            ps = con.prepareStatement("select * from category where cname = ?");
            ps.setString(1, cname);
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
     //insert data into category table
    public void insert(int cid, String cname, String desc) {
        String sql = "insert into category values(?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, cid);
            ps.setString(2, cname);
            ps.setString(3, desc);
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Category added successfully");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //delete category
    public void deleteCategory(int cid){
        int x = JOptionPane.showConfirmDialog(null, "Are you sure to delete this category?","Delete Category",JOptionPane.OK_CANCEL_OPTION,0);
        if(x == JOptionPane.OK_OPTION){
            try {
                ps = con.prepareStatement("Delete from category where cid = ?");
                ps.setInt(1,cid);
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null, "Category deleted!");
                }
            } catch (SQLException ex) {
                Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    //get category value
    public void getCategoryValue(JTable table,String search) {
        String sql = "select * from category where concat(cid, cname, cdesc) like ? order by cid desc";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, "%"+search+"%");
            rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object [] row;
            while (rs.next()) {
                row = new Object[3];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     //update category data
    public void update(int cid, String cname, String cdesc){
        String sql = "update category set cname = ?, cdesc =? where cid = ?";
        try {        
            ps = con.prepareStatement(sql);
            ps.setString(1,cname);
            ps.setString(2,cdesc);
            ps.setInt(3, cid);
            if(ps.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Data updated successfully!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}


