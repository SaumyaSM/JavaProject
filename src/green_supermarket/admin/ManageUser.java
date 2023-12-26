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
public class ManageUser extends javax.swing.JFrame {

     Client client = new Client();
    /**
     * Creates new form Manage_user
     */
    public ManageUser() {
        initComponents();
        
         client.userTable(jTable2);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        btn_categories = new javax.swing.JButton();
        add_supplier = new javax.swing.JButton();
        btn_msupplier = new javax.swing.JButton();
        btn_products = new javax.swing.JButton();
        btn_Transation = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btn_udelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txt_uid = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_uemail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_upassword = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_uphone = new javax.swing.JTextField();
        txt_usecurity = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_uanswer = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_uaddress1 = new javax.swing.JTextField();
        tex_uaddress2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btn_update = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        txt_search = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btn_refresh = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        jPanel2.add(btn_categories, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 210, 50));

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

        btn_products.setBackground(new java.awt.Color(0, 102, 102));
        btn_products.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_products.setForeground(new java.awt.Color(255, 255, 255));
        btn_products.setText("Manage Products");
        btn_products.setBorder(null);
        btn_products.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_productsActionPerformed(evt);
            }
        });
        jPanel2.add(btn_products, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 210, 50));

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

        jPanel3.setBackground(new java.awt.Color(0, 204, 102));

        btn_udelete.setBackground(new java.awt.Color(0, 102, 102));
        btn_udelete.setForeground(new java.awt.Color(255, 255, 255));
        btn_udelete.setText("Delete");
        btn_udelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_udeleteActionPerformed(evt);
            }
        });

        jTable2.setBackground(new java.awt.Color(255, 255, 255));
        jTable2.setForeground(new java.awt.Color(0, 0, 0));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Uesrname", "Email", "Password", "Phone", "Security Q", "Answer", "Address L1", "Address L2"
            }
        ));
        jTable2.setGridColor(new java.awt.Color(255, 255, 255));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable2);

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("User ID");

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Username");

        jLabel9.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Email");

        jLabel10.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Password");

        jLabel11.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Phone");

        jLabel12.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText(" Security Question");

        jLabel13.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Answer");

        jLabel15.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Address Line(Stete & Area)");

        jLabel16.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Address Line2 (country)");

        btn_update.setBackground(new java.awt.Color(0, 102, 102));
        btn_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_clear.setBackground(new java.awt.Color(0, 102, 102));
        btn_clear.setForeground(new java.awt.Color(255, 255, 255));
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Search");

        btn_refresh.setBackground(new java.awt.Color(0, 102, 102));
        btn_refresh.setForeground(new java.awt.Color(255, 255, 255));
        btn_refresh.setText("Refresh");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(411, 411, 411)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_uid, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_uemail, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_upassword, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_uphone, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_usecurity, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_uanswer, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_uaddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tex_uaddress2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btn_udelete, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_usecurity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_uanswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_uaddress1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tex_uaddress2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_update)
                            .addComponent(btn_udelete)
                            .addComponent(btn_clear))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(btn_refresh)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_uid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_uemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_upassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_uphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Manage User");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(jLabel6))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6)
                        .addGap(8, 8, 8)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        setSize(new java.awt.Dimension(1134, 667));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btn_categoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_categoriesActionPerformed
        AdminDashboard category = new AdminDashboard();
        category.show();
        dispose();
    }//GEN-LAST:event_btn_categoriesActionPerformed

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

    private void btn_productsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_productsActionPerformed
        Manage_product product = new Manage_product();
        product.show();
        dispose();

    }//GEN-LAST:event_btn_productsActionPerformed

    private void btn_TransationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TransationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_TransationActionPerformed

    private void btn_udeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_udeleteActionPerformed

           try{
                 int id = Integer.valueOf(txt_uid.getText());
                  
                  if(client.delete_user(id)){
                        JOptionPane.showMessageDialog(rootPane, "Categor Delete Successfully");
                          }
                 else{
                      JOptionPane.showMessageDialog(rootPane, "Try agan");
             }
            }
           catch(NumberFormatException ex){
                 JOptionPane.showMessageDialog(rootPane, "Fill id");
            }
    }//GEN-LAST:event_btn_udeleteActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
              DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        
        int rIndex = jTable2.getSelectedRow();
      
        txt_uid.setText(model.getValueAt(rIndex, 0).toString());
        txt_username.setText(model.getValueAt(rIndex, 1).toString());
        txt_uemail.setText(model.getValueAt(rIndex, 2).toString());
        txt_upassword.setText(model.getValueAt(rIndex, 3).toString());
        txt_uphone.setText(model.getValueAt(rIndex, 4).toString());
        txt_usecurity.setText(model.getValueAt(rIndex, 5).toString());
        txt_uanswer.setText(model.getValueAt(rIndex, 6).toString());
        txt_uaddress1.setText(model.getValueAt(rIndex, 7).toString());
        tex_uaddress2.setText(model.getValueAt(rIndex, 8).toString());
       
    }//GEN-LAST:event_jTable2MouseClicked

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
       
        
        int id = 0;
        String username = txt_username.getText();
        String email = txt_uemail.getText();
        String password = txt_upassword.getText();
        String phone = txt_uphone.getText();
        String security= txt_usecurity.getText();
        String answer = txt_uanswer.getText();
        String address1 = txt_uaddress1.getText();
        String address2 = tex_uaddress2.getText();
       
        
        if(username.trim().equals("") || email.trim().equals("") || password.trim().equals("") ||phone.trim().equals("") ||security.trim().equals("") ||answer.trim().equals("") || address1.trim().equals("") ||address2.trim().equals("") ){
          
          JOptionPane.showMessageDialog(rootPane, "Fill All Data");
      }
      else{
         
            try{
                   id = Integer.valueOf(txt_uid.getText());
                  
                  if(client.update_user(id, username, email,password,phone,security,answer,address1,address2)){
            JOptionPane.showMessageDialog(rootPane, "Categor Update Successfully");
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

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        txt_uid.setText("");
       txt_username.setText("");
       txt_uemail.setText("");
       txt_upassword.setText("");
       txt_uphone.setText("");
       txt_usecurity.setText("");
       txt_uanswer.setText("");
       txt_uaddress1.setText("");
       tex_uaddress2.setText("");
      
       
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
         jTable2.setModel(new DefaultTableModel(null,new Object[]{"ID","Username","Email","Password","Phone","Security Q","Answer","Address L1","address L2"}));
        client.userTable(jTable2);
    }//GEN-LAST:event_btn_refreshActionPerformed

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
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_supplier;
    private javax.swing.JButton btn_Transation;
    private javax.swing.JButton btn_categories;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_msupplier;
    private javax.swing.JButton btn_products;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_udelete;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField tex_uaddress2;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_uaddress1;
    private javax.swing.JTextField txt_uanswer;
    private javax.swing.JTextField txt_uemail;
    private javax.swing.JTextField txt_uid;
    private javax.swing.JTextField txt_upassword;
    private javax.swing.JTextField txt_uphone;
    private javax.swing.JTextField txt_usecurity;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
