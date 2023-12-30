/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package green_supermarket.supplier;

import green_supermarket.dao.SupplierDao;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class SupplierAccount extends javax.swing.JFrame {

    SupplierDao supplier;
    Color textPrimaryColor = new Color(30, 30, 30);
    Color primaryColor = new Color(255, 255, 255);
    int xx, xy;
    private int sID;
    String[] value = new String[7];

    public SupplierAccount() throws SQLException {
        this.supplier = new SupplierDao();
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField6 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(0, 153, 102));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 153, 102));
        jLabel3.setFont(new java.awt.Font("Apple LiSung", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Supplier Account");
        jLabel3.setOpaque(true);
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(204, 204, 204));
        jTextField3.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 115, 325, 30));

        jTextField4.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 177, 325, 30));

        jTextField5.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jPanel3.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 236, 325, 30));

        jPasswordField1.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jPanel3.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 301, 325, 30));

        jTextField6.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });
        jPanel3.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 325, 30));

        jTextField8.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jPanel3.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 325, 30));

        jTextField9.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jPanel3.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 325, 30));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jLabel4.setText("Supplier ID");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jLabel5.setText("Suppliername");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 151, -1, -1));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jLabel6.setText("Email");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 213, -1, -1));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jLabel7.setText("Password");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 278, -1, -1));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jLabel8.setText("Phone");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, -1));

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jLabel11.setText("Address LIne 1");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, -1, -1));

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jLabel12.setText("Address LIne 2");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, -1, -1));

        btnUpdate.setBackground(new java.awt.Color(51, 204, 0));
        btnUpdate.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel3.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 140, -1));

        jLabel13.setBackground(new java.awt.Color(51, 204, 0));
        jLabel13.setFont(new java.awt.Font("Kannada MN", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("X");
        jLabel13.setOpaque(true);
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 30, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/green_supermarket/ic/visible.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 301, 30, 30));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/green_supermarket/ic/hide.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 301, 30, 30));

        btnDelete.setBackground(new java.awt.Color(51, 204, 0));
        btnDelete.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, 140, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/green_supermarket/ic/g4.png"))); // NOI18N
        jLabel16.setText("jLabel14");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 429, 220, 126));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void init(){
        setLocation(410,300);
        sID = supplier.getSupplierId(SupplierDashboard.SupplierEmail.getText());
        value = supplier.getSupplierValue(sID);
        setValue();
    }
    
    private void setValue(){
        jTextField3.setText(value[0]);
        jTextField4.setText(value[1]);
        jTextField5.setText(value[2]);
        jPasswordField1.setText(value[3]);
        jTextField6.setText(value[4]);
        jTextField8.setText(value[5]);
        jTextField9.setText(value[6]);
    }
    
    public boolean isEmpty(){
        if(jTextField4.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Supplier name is required", "Warning", 2);
            return false;
        }
        if (jTextField5.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Email is required", "Warning", 2);
            return false;
        }
        if (!jTextField5.getText().matches("^.+\\..+$")) {
            JOptionPane.showMessageDialog(this, "Invalid Email", "Warning", 2);
            return false;
        }
        if (String.valueOf(jPasswordField1.getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(this, "Password is required", "Warning", 2);
        }
        if(jTextField6.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Phone number is required", "Warning", 2);
            return false;
        }
        if(jTextField6.getText().length()>11){
            JOptionPane.showMessageDialog(this, "Phone number is too long", "Warning", 2);
            return false;
        }
        if(jTextField6.getText().length()<10){
            JOptionPane.showMessageDialog(this, "Phone number is short", "Warning", 2);
            return false;
        }        
        if(jTextField8.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Address Line 1 is required", "Warning", 2);
            return false;
        }
        if(jTextField9.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Address Line 2 is required", "Warning", 2);
            return false;
        }
        return true;
    }
    
    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        char input = evt.getKeyChar();
        if (!(input < '0' || input > '9') && input != '\b') {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Username doesn't contain numbers!", "Warning", 2);
        }
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField6KeyTyped

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (isEmpty()) {
            if (!check()) {
                int sID = Integer.parseInt(jTextField3.getText());
                String sname = jTextField4.getText();
                String semail = jTextField5.getText();
                String spassword = String.valueOf(jPasswordField1.getPassword());
                String sphone = jTextField6.getText();
                String saddress1 = jTextField8.getText();
                String saddress2 = jTextField9.getText();
                supplier.update(sID, sname, semail, spassword, sphone, saddress1, saddress2);
                this.dispose();
                setDefault();
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    
    private boolean check(){        
        String newEmail = jTextField5.getText();
        String newPhone = jTextField6.getText();
        if(newEmail.equals(value[2]) && newPhone.equals(value[4])){
            return false;
        }else{
            if(!newEmail.equals(value[2])){
                boolean x = supplier.isEmailExist(newEmail);
                if(x){
                    JOptionPane.showMessageDialog(this, "This email already exists", "warning",2);
                }
                return x;
            }
            if(!newPhone.equals(value[4])){
                boolean x = supplier.isPhonelExist(newPhone);
                if(x){
                    JOptionPane.showMessageDialog(this, "This phone number already exists", "warning",2);
                }
                return x;
            }
        }
        return false;
    }
    
    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        setDefault();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        jPasswordField1.setEchoChar((char) 0);
        jLabel12.setVisible(false);
        jLabel13.setVisible(true);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        jPasswordField1.setEchoChar('*');
        jLabel12.setVisible(true);
        jLabel13.setVisible(false);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        supplier.deleteSupplier(sID);
        System.exit(0);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        int xx = 0;
        int xy = 0;
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel3MouseDragged

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        int xx = evt.getX();
        int xy = evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    private void setDefault() {
        setVisible(false);
        SupplierDashboard.jPanel11.setBackground(primaryColor);
        SupplierDashboard.jPanel12.setBackground(primaryColor);
        SupplierDashboard.jLabel11.setForeground(textPrimaryColor);
        SupplierDashboard.jLabel12.setVisible(true);
        SupplierDashboard.jLabel20.setVisible(false);
    }

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
            java.util.logging.Logger.getLogger(SupplierAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SupplierAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SupplierAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SupplierAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new SupplierAccount().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(SupplierAccount.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

}
