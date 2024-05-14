/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projeuideneme;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class PatientEditPageJFrame extends javax.swing.JFrame {

    /**
     * Creates new form PatientEditPageJFrame
     */
    
    String email = "";
    
    public PatientEditPageJFrame(String emailString) {
        initComponents();
        Connection con = patientDbConnection.connect();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            String sql = "Select * from patients where email = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, emailString);
            email = emailString;
            rs = ps.executeQuery();
            
            //we are reading one row, so no need to loop
            // String firstName = rs.getString(1);
            // String statueOfDoctor = rs.getString("statue");
            // String name = statueOfDoctor + " Dr " + firstName;
            
            // String branchOfDoctor = rs.getString("branch");
            // doctorNameText.setText(name);
            // bracnhText.setText(branchOfDoctor);
            // locationText.setText("Ankara");
            // jTextArea1.setText(rs.getString("about"));
        }catch(SQLException e){
            System.out.println(e.toString());
        }finally{
            try{
                rs.close();
                ps.close();
                con.close();
            }catch(SQLException e){
                System.out.println(e.toString());
            }
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        nameText = new javax.swing.JTextField();
        surnameText = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        ageText = new javax.swing.JTextField();
        emailText = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        passwordField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        phoneField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1440, 1024));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_component_assets/LOGO_1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 240, 210));

        nameText.setBackground(new java.awt.Color(255, 255, 255));
        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });
        getContentPane().add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 540, 60));

        surnameText.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(surnameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 540, 60));

        buttonGroup1.add(jRadioButton1);
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 130, 40));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, -1, -1));

        ageText.setBackground(new java.awt.Color(255, 255, 255));
        ageText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTextActionPerformed(evt);
            }
        });
        getContentPane().add(ageText, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 540, 60));

        emailText.setBackground(new java.awt.Color(255, 255, 255));
        emailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextActionPerformed(evt);
            }
        });
        getContentPane().add(emailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 590, 540, 60));

        passwordField.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 700, 540, 60));

        passwordField2.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(passwordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 820, 540, 60));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_component_assets/EditButton.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 910, 280, 60));

        phoneField.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(phoneField, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 200, 530, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_component_assets/Edit_Menu_Patient.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void ageTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTextActionPerformed

    private void emailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //Editlemeden ana sayfaya döner
        JFrame frame = new MainMenuPatient(email);
        frame.setVisible(true);
        setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //Bilgileri database'de girilenlere göre değiştirerek ana sayfaya döner (Constructor ayarlanmalı).
        
        Connection con = patientDbConnection.connect();
        PreparedStatement ps = null;
                     
        //Update kısmı
        
        
        
        try{
            String sql = "UPDATE users set firstName = ? WHERE email = ?";
            //bu üstteki kısmı genişleterek belli if koşullarıyla uyarlayabilirsin.
            ps = con.prepareStatement(sql);
            ps.setString(1, "Ferit2İsim");
            ps.setString(2, "feritbilgi@gmail.com");
            ps.execute();
            System.out.println("Data has been updated");
        } catch(SQLException e){
            System.out.println(e.toString());
        }
        
        
        JFrame frame = new MainMenuPatient(email);
        frame.setVisible(true);
        setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(PatientEditPageJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientEditPageJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientEditPageJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientEditPageJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientEditPageJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageText;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField emailText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTextField passwordField2;
    private javax.swing.JTextField phoneField;
    private javax.swing.JTextField surnameText;
    // End of variables declaration//GEN-END:variables
}
