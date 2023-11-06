/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dpm.dbapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class addForm extends javax.swing.JFrame {

    
    Connection conn;
    PreparedStatement st;
    ResultSet rs1,rs2;
    public addForm() {
        initComponents();
        try {       
             Class.forName("com.mysql.jdbc.Driver");
                    conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/krupa",
                        "root", "");
               System.out.println("Connect");
            } catch (Exception e) {
                    System.out.println(e);
                }
            
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jid = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jdesk = new javax.swing.JLabel();
        txtdesk = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jloc = new javax.swing.JLabel();
        jdepart = new javax.swing.JLabel();
        junitcost = new javax.swing.JLabel();
        txtloc = new javax.swing.JTextField();
        txtdepart = new javax.swing.JTextField();
        txtuc = new javax.swing.JTextField();
        jstatus = new javax.swing.JLabel();
        txtstatus = new javax.swing.JTextField();
        jity = new javax.swing.JLabel();
        txttype = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Add New Row");

        jid.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jid.setForeground(new java.awt.Color(102, 102, 0));
        jid.setText("Item Id");

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        jdesk.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jdesk.setForeground(new java.awt.Color(102, 102, 0));
        jdesk.setText("Desktop No.");

        btnAdd.setBackground(new java.awt.Color(0, 204, 204));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jloc.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jloc.setForeground(new java.awt.Color(102, 102, 0));
        jloc.setText("Location");

        jdepart.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jdepart.setForeground(new java.awt.Color(102, 102, 0));
        jdepart.setText("Department");

        junitcost.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        junitcost.setForeground(new java.awt.Color(102, 102, 0));
        junitcost.setText("Unit Cost");

        txtloc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlocActionPerformed(evt);
            }
        });

        txtuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtucActionPerformed(evt);
            }
        });

        jstatus.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jstatus.setForeground(new java.awt.Color(102, 102, 0));
        jstatus.setText("Status");

        txtstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstatusActionPerformed(evt);
            }
        });

        jity.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jity.setForeground(new java.awt.Color(102, 102, 0));
        jity.setText("Item Type");

        txttype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdesk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jid, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jloc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jdepart, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jstatus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(junitcost, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)))
                                .addGap(0, 51, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtdesk)
                            .addComponent(txtloc)
                            .addComponent(txtdepart)
                            .addComponent(txtuc)
                            .addComponent(txtstatus)
                            .addComponent(txttype)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel1)))
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jid)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jdesk)
                    .addComponent(txtdesk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jity)
                    .addComponent(txttype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtloc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jloc))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jdepart)
                    .addComponent(txtdepart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(junitcost)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jstatus)
                    .addComponent(txtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if(validates())
        {try {
              String sqlstr ="Insert into ims values("+txtid.getText()+","+txtdesk.getText()+",'"+txttype.getText()+"','" +txtloc.getText()+"','"+txtdepart.getText()+"',"+txtuc.getText()+",'"+ txtstatus.getText()+"')";
              //System.out.println(sqlstr);
              st = (PreparedStatement) conn.prepareStatement(sqlstr);
              
            
            if(st.execute(sqlstr)== false)
            {
                JOptionPane.showMessageDialog(addForm.this, "Data inserted Successfully!!");
                this.setVisible(false);
                new MainUI().setVisible(true);
                conn.close();
            }
            else
            {
                JOptionPane.showMessageDialog(addForm.this, "Enter correct Data");
                
            }
         
        }
        catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                }
       
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtlocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlocActionPerformed

    private void txtucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtucActionPerformed

    private void txtstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstatusActionPerformed

    private void txttypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttypeActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addForm().setVisible(true);
            }
        });
    }
    
  public boolean validates()
  {     
      if(txtid.getText().trim().isEmpty())
      {
          JOptionPane.showMessageDialog(addForm.this, "Enter id");
          txtid.grabFocus();
          return false;
      }
      if(txtdesk.getText().trim().isEmpty())
      {
          JOptionPane.showMessageDialog(addForm.this, "Enter desktop no");
          txtdesk.grabFocus();
          return false;
      }
      if(txttype.getText().trim().isEmpty())
      {
          JOptionPane.showMessageDialog(addForm.this, "Enter item type");
          txttype.grabFocus();
          return false;
      }
      if(txtloc.getText().trim().isEmpty())
      {
          JOptionPane.showMessageDialog(addForm.this, "Enter location");
          txtloc.grabFocus();
          return false;
      }
      if(txtdepart.getText().trim().isEmpty())
      {
          JOptionPane.showMessageDialog(addForm.this, "Enter department");
          txtdepart.grabFocus();
          return false;
      }
      if(txtuc.getText().trim().isEmpty())
      {
          JOptionPane.showMessageDialog(addForm.this, "Enter unit cost");
          txtuc.grabFocus();
          return false;
      }
      if(txtstatus.getText().trim().isEmpty())
      {
          JOptionPane.showMessageDialog(addForm.this, "Enter status");
          txtstatus.grabFocus();
          return false;
      }
      return true;
  }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jdepart;
    private javax.swing.JLabel jdesk;
    private javax.swing.JLabel jid;
    private javax.swing.JLabel jity;
    private javax.swing.JLabel jloc;
    private javax.swing.JLabel jstatus;
    private javax.swing.JLabel junitcost;
    private javax.swing.JTextField txtdepart;
    private javax.swing.JTextField txtdesk;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtloc;
    private javax.swing.JTextField txtstatus;
    private javax.swing.JTextField txttype;
    private javax.swing.JTextField txtuc;
    // End of variables declaration//GEN-END:variables
}
