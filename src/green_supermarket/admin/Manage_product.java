/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package green_supermarket.admin;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nimesh
 */
public class Manage_product extends javax.swing.JFrame {

    Client client = new Client();
    /**
     * Creates new form Manage_product
     */
    public Manage_product() {
        initComponents();
        
        client.productTable(jTable3);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        btn_user = new javax.swing.JButton();
        add_supplier = new javax.swing.JButton();
        btn_msupplier = new javax.swing.JButton();
        btn_categories = new javax.swing.JButton();
        btn_Transation = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txt_pname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_pcategory = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_quantity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btn_add = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        btn_refresh = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_pid1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_price = new javax.swing.JTextField();
        btn_clear2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_cid2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(975, 561));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 255, 51));
        jLabel1.setFont(new java.awt.Font("sansserif", 1, 27)); // NOI18N
        jLabel1.setText("      DASHBOARD");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 52));

        jButton7.setBackground(new java.awt.Color(0, 102, 102));
        jButton7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Manage Supplier");
        jButton7.setBorder(null);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 210, 50));

        btn_user.setBackground(new java.awt.Color(0, 102, 102));
        btn_user.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_user.setForeground(new java.awt.Color(255, 255, 255));
        btn_user.setText("Manage Users");
        btn_user.setBorder(null);
        btn_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_userActionPerformed(evt);
            }
        });
        jPanel2.add(btn_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 210, 50));

        add_supplier.setBackground(new java.awt.Color(0, 102, 102));
        add_supplier.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        add_supplier.setForeground(new java.awt.Color(255, 255, 255));
        add_supplier.setText("Add Supplier");
        add_supplier.setBorder(null);
        add_supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_supplierActionPerformed(evt);
            }
        });
        jPanel2.add(add_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 210, 50));

        btn_msupplier.setBackground(new java.awt.Color(0, 102, 102));
        btn_msupplier.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_msupplier.setForeground(new java.awt.Color(255, 255, 255));
        btn_msupplier.setText("Manage Supplier");
        btn_msupplier.setBorder(null);
        btn_msupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_msupplierActionPerformed(evt);
            }
        });
        jPanel2.add(btn_msupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 210, 50));

        btn_categories.setBackground(new java.awt.Color(0, 102, 102));
        btn_categories.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_categories.setForeground(new java.awt.Color(255, 255, 255));
        btn_categories.setText("Manage Categories");
        btn_categories.setBorder(null);
        btn_categories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_categoriesActionPerformed(evt);
            }
        });
        jPanel2.add(btn_categories, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 210, 50));

        btn_Transation.setBackground(new java.awt.Color(0, 102, 102));
        btn_Transation.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_Transation.setForeground(new java.awt.Color(255, 255, 255));
        btn_Transation.setText("Transation");
        btn_Transation.setBorder(null);
        btn_Transation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TransationActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Transation, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 210, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 630));

        jPanel3.setBackground(new java.awt.Color(0, 204, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(txt_pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 214, 37));

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Product Name");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 104, -1));
        jPanel3.add(txt_pcategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 214, 37));

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Category");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 117, -1));
        jPanel3.add(txt_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 214, 37));

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quantity");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 95, -1));

        btn_add.setBackground(new java.awt.Color(0, 102, 102));
        btn_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel3.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 508, 73, -1));

        btn_delete.setBackground(new java.awt.Color(0, 102, 102));
        btn_delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel3.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 508, 73, -1));

        btn_update.setBackground(new java.awt.Color(0, 102, 102));
        btn_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel3.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 508, 73, -1));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 22, 260, 37));

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Search");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 26, 79, -1));

        jTable3.setBackground(new java.awt.Color(255, 255, 255));
        jTable3.setBorder(null);
        jTable3.setForeground(new java.awt.Color(0, 0, 0));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Category Name ", "Quantity", "Price"
            }
        ));
        jTable3.setGridColor(new java.awt.Color(255, 255, 255));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable3);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 76, 557, 460));

        btn_refresh.setBackground(new java.awt.Color(0, 102, 102));
        btn_refresh.setForeground(new java.awt.Color(255, 255, 255));
        btn_refresh.setText("Refresh");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });
        jPanel3.add(btn_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 110, 40));

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Product ID");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 79, -1));
        jPanel3.add(txt_pid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 214, 37));

        jLabel9.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Price");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 79, -1));
        jPanel3.add(txt_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 214, 37));

        btn_clear2.setBackground(new java.awt.Color(0, 102, 102));
        btn_clear2.setForeground(new java.awt.Color(255, 255, 255));
        btn_clear2.setText("Clear");
        btn_clear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clear2ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_clear2, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 462, 73, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 830, 550));

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Manage Products");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Category ID");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel1.add(txt_cid2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1137, 667));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btn_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_userActionPerformed
        ManageUser user = new ManageUser();
        user.show();
        dispose();
    }//GEN-LAST:event_btn_userActionPerformed

    private void add_supplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_supplierActionPerformed
        AddSuppliers add = new AddSuppliers();
        add.show();
        dispose();
    }//GEN-LAST:event_add_supplierActionPerformed

    private void btn_msupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_msupplierActionPerformed
        MangeSuppliers suppliers = new MangeSuppliers();
        suppliers .show();
        dispose();
    }//GEN-LAST:event_btn_msupplierActionPerformed

    private void btn_categoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_categoriesActionPerformed
        AdminDashboard category = new AdminDashboard();
        category.show();
        dispose();

    }//GEN-LAST:event_btn_categoriesActionPerformed

    private void btn_TransationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TransationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_TransationActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed

        String name = txt_pname.getText();
        String category = txt_pcategory.getText();
        String quantity = txt_quantity.getText();
        String price = txt_price.getText();
        
      if( name.trim().equals("") || category.trim().equals("") || quantity.trim().equals("") || price.trim().equals("")  ){
          
          JOptionPane.showMessageDialog(rootPane, "Fill All Data");
      }
      else{
        if(client.Add_product(name, category,quantity,price)){
            JOptionPane.showMessageDialog(rootPane, "New Product Added Successfully");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Try agan");
        }
      }
        
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed

        
        try{
                 int id = Integer.valueOf(txt_pid1.getText());
                  
                  if(client.delete_product(id)){
            JOptionPane.showMessageDialog(rootPane, "Product Delete Successfully");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Try agan");
        }
            }
           catch(NumberFormatException ex){
                 JOptionPane.showMessageDialog(rootPane, "Fill id");
            }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed

      
        int id = 0;
        String username = txt_pname.getText();
        String category = txt_pcategory.getText();
        String quantity = txt_quantity.getText();
        String price = txt_price.getText();
        
       
        
        if(username.trim().equals("") || category.trim().equals("") || quantity.trim().equals("") ||price.trim().equals("") ){
          
          JOptionPane.showMessageDialog(rootPane, "Fill All Data");
      }
      else{
         
            try{
                   id = Integer.valueOf(txt_pid1.getText());
                   
                  
                  if(client.Update_product(id, username, category,quantity,price)){
            JOptionPane.showMessageDialog(rootPane, "Product Update Successfully");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Try agan");
        }
            }
           catch(NumberFormatException ex){
                 JOptionPane.showMessageDialog(rootPane, "Fill id");
            }
        
      }


    }//GEN-LAST:event_btn_updateActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked

        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        
        int rIndex = jTable3.getSelectedRow();
      
        txt_pid1.setText(model.getValueAt(rIndex, 0).toString());
        txt_pname.setText(model.getValueAt(rIndex, 1).toString());
        txt_pcategory.setText(model.getValueAt(rIndex, 2).toString());
        txt_quantity.setText(model.getValueAt(rIndex, 3).toString());
        txt_price.setText(model.getValueAt(rIndex, 4).toString());
        
    }//GEN-LAST:event_jTable3MouseClicked

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed

         jTable3.setModel(new DefaultTableModel(null,new Object[]{"Product ID","Product Name","Category Name","Quantity","Price"}));
        client.productTable(jTable3);
        

    }//GEN-LAST:event_btn_refreshActionPerformed

    private void btn_clear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clear2ActionPerformed
         txt_pid1.setText("");
         txt_pname.setText("");
         txt_pcategory.setText("");
         txt_quantity.setText("");
         txt_price.setText("");
    }//GEN-LAST:event_btn_clear2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Manage_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manage_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manage_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manage_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manage_product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_supplier;
    private javax.swing.JButton btn_Transation;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_categories;
    private javax.swing.JButton btn_clear2;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_msupplier;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton btn_user;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField txt_cid2;
    private javax.swing.JTextField txt_pcategory;
    private javax.swing.JTextField txt_pid1;
    private javax.swing.JTextField txt_pname;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_quantity;
    // End of variables declaration//GEN-END:variables
}
