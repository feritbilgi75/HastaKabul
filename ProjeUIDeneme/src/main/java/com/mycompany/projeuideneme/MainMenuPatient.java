/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projeuideneme;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
<<<<<<< HEAD
=======

>>>>>>> 416658a4eeffa75a6f130e66b79071d39490c1a8
import javax.swing.JFrame;

/**
 *
 * @author feritbilgi
 */
public class MainMenuPatient extends javax.swing.JFrame {

<<<<<<< HEAD
 
    private String email = "";
    
    public MainMenuPatient(){}
=======
    /**
     * Creates new form MainMenuPatient
     */
    
    String email = "";
<<<<<<< HEAD
>>>>>>> 416658a4eeffa75a6f130e66b79071d39490c1a8
=======
    static String staticMail = "";
>>>>>>> a6dfc04d3e3e43574090435ba3f3b437dcbe6f4b
    
    public MainMenuPatient(String emailString) {
        initComponents();
        Connection con = asliDbConnection.connect();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
<<<<<<< HEAD
<<<<<<< HEAD
            String sql = "Select * from doctors where email = ?";
=======
            String sql = "Select * from patients where email = ?";
>>>>>>> 416658a4eeffa75a6f130e66b79071d39490c1a8
=======
            String sql = "Select * from patient where email = ?";
>>>>>>> 42709109915da6a22539e17887bc267673bd7631
            ps = con.prepareStatement(sql);
            ps.setString(1, emailString);
            email = emailString;
            staticMail = emailString;
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

        jPanel1 = new javax.swing.JPanel();
        seePharmacyButton = new javax.swing.JButton();
        menuImage = new javax.swing.JLabel();
        search_textfield = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        search_button = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1360, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 630, 1360, 510));

        seePharmacyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_component_assets/PharmacyButton.png"))); // NOI18N
        seePharmacyButton.setBorderPainted(false);
        seePharmacyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seePharmacyButtonActionPerformed(evt);
            }
        });
        getContentPane().add(seePharmacyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 470, 200));
        getContentPane().add(menuImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 830, 430));

        search_textfield.setBackground(new java.awt.Color(255, 255, 255));
        search_textfield.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(search_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 500, 70));

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 0));
        jButton1.setText("Sigortalarım");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 40, 160, 60));

        jButton2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 0));
        jButton2.setText("Randevularım");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(708, 40, 150, 60));

        search_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_component_assets/SearchIcon.png"))); // NOI18N
        search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(search_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 50, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_component_assets/User_Button.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 50, 130, 50));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_component_assets/MainMenu.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_buttonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        JFrame frame = new PatientEditPageJFrame(email);
        frame.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void seePharmacyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seePharmacyButtonActionPerformed
        // TODO add your handling code here:
        //JFrame frame = new PharmacyDisplayJFrame();
        //frame.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_seePharmacyButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenuPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuPatient(staticMail).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel menuImage;
    private javax.swing.JButton search_button;
    private javax.swing.JTextField search_textfield;
    private javax.swing.JButton seePharmacyButton;
    // End of variables declaration//GEN-END:variables
}
