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
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class PatientEditPageJFrame extends javax.swing.JFrame {

    /**
     * Creates new form PatientEditPageJFrame
     */
    
    private Integer id;
    
    public PatientEditPageJFrame(Integer id) {
        initComponents();
        Connection con = asliDbConnection.connect();
        PreparedStatement ps = null;
        ResultSet rs = null;
        this.id =id;
        try{
            String sql = "Select * from patient where rowid = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            rs = ps.executeQuery();
            
            //we are reading one row, so no need to loop
            while (rs.next()){
                String firstName = rs.getString("name");
                String surname = rs.getString("surname");
                int age = rs.getInt("age");
                String gender = rs.getString("gender");
                String email = rs.getString("email");
                String password = rs.getString("password");
                int phoneNumber = rs.getInt("phoneNo");
                String city = rs.getString("city");
                String province = rs.getString("province");
            
                nameText.setText(firstName);
                surnameText.setText(surname);
                emailText.setText(email);
                ageText.setText(age + "");
                passwordField.setText(password);
                passwordField2.setText(password);
                phoneField.setText(phoneNumber + "");
                if(gender.equals("Erkek")){
                    jRadioButton1.isSelected();
                }
                else{
                    jRadioButton2.isSelected();
                }
                cityText.setText(city);
                provinceText.setText(province);
            }
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
        cityText = new javax.swing.JTextField();
        provinceText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
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
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
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

        cityText.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cityText, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 300, 530, 60));

        provinceText.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(provinceText, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 490, 530, 60));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel2.setText("İlçe");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 450, 110, 20));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel3.setText("Şehir");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 270, 110, 20));

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
        JFrame frame = new MainMenuPatient(id);
        frame.setVisible(true);
        setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public void edit(String emailStr){
        Connection con = asliDbConnection.connect();
        PreparedStatement ps = null;

        // Cinsiyet belirleme
        String gender = "";
        if (jRadioButton1.isSelected()) {
            gender = "Erkek";
        } else if (jRadioButton2.isSelected()) {
            gender = "Kadın";
        }

        // Şifre kontrolü
        String password1 = passwordField.getText();
        String password2 = passwordField2.getText();
        String actualPassword = "";

        if (password1.equals(password2)) {
            actualPassword = password1;
        } else {
            JOptionPane.showMessageDialog(null, "Şifre aynı olmak zorunda");
            throw new IllegalArgumentException();
        }

        // SQL sorgusu
        String sql = "UPDATE patient SET name = ?, surname = ?, gender = ?, age = ?, email = ?, password = ?, phoneNo = ?, city = ?, province = ? WHERE email = ?";

        try {
            ps = con.prepareStatement(sql);

            // Parametreleri ayarlama
            ps.setString(1, nameText.getText());
            ps.setString(2, surnameText.getText());
            ps.setString(3, gender);
            ps.setInt(4, Integer.parseInt(ageText.getText()));
            ps.setString(5, emailText.getText());
            ps.setString(6, actualPassword);
            ps.setString(7, phoneField.getText()); // Assuming phone number is stored as a String
            ps.setString(8, cityText.getText().trim()); // Assuming phone number is stored as a String

            ps.setString(9, provinceText.getText()); // Assuming phone number is stored as a String

            ps.setString(10, emailStr); // WHERE clause için email

            // Sorguyu çalıştırma
            ps.executeUpdate();
            System.out.println("Data has been updated");
        } catch (SQLException e) {
            System.out.println(e.toString());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    

        JFrame frame = new MainMenuPatient(emailText.getText());
        frame.setVisible(true);
        setVisible(false);

    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //Bilgileri database'de girilenlere göre değiştirerek ana sayfaya döner (Constructor ayarlanmalı).
        edit(emailText.getText());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

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
                new PatientEditPageJFrame(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageText;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cityText;
    private javax.swing.JTextField emailText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTextField passwordField2;
    private javax.swing.JTextField phoneField;
    private javax.swing.JTextField provinceText;
    private javax.swing.JTextField surnameText;
    // End of variables declaration//GEN-END:variables
}
