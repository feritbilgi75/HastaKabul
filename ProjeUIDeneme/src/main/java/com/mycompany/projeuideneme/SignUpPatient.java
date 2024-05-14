/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projeuideneme;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFrame;

/**
 *
 * @author feritbilgi
 */
public class SignUpPatient extends javax.swing.JFrame {

    /**
     * Creates new form ClientSignUpPage
     */
    public SignUpPatient() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderPatient = new javax.swing.ButtonGroup();
        name_textfield1 = new javax.swing.JTextField();
        surname_textfield = new javax.swing.JTextField();
        man = new javax.swing.JRadioButton();
        woman = new javax.swing.JRadioButton();
        age_textfield = new javax.swing.JTextField();
        email_textfield = new javax.swing.JTextField();
        password_field1 = new javax.swing.JPasswordField();
        password_field = new javax.swing.JPasswordField();
        signUp_button = new javax.swing.JButton();
        search_textfield = new javax.swing.JTextField();
        search_button = new javax.swing.JButton();
        login_section_button = new javax.swing.JButton();
        signUp_section_button = new javax.swing.JButton();
        phoneNumber_textField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(name_textfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 540, 70));
        getContentPane().add(surname_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 540, 70));

        genderPatient.add(man);
        man.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manActionPerformed(evt);
            }
        });
        getContentPane().add(man, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 40, -1));

        genderPatient.add(woman);
        woman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                womanActionPerformed(evt);
            }
        });
        getContentPane().add(woman, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 20, 20));
        getContentPane().add(age_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 540, 70));
        getContentPane().add(email_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 590, 540, 70));
        getContentPane().add(password_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 700, 540, 70));
        getContentPane().add(password_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 800, 540, 80));

        signUp_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_component_assets/SignUp_Button.png"))); // NOI18N
        signUp_button.setBorderPainted(false);
        signUp_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUp_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(signUp_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 900, 290, 70));
        getContentPane().add(search_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 540, 70));

        search_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_component_assets/SearchIcon.png"))); // NOI18N
        search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(search_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, -1, -1));

        login_section_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_component_assets/LogIn_Button.png"))); // NOI18N
        login_section_button.setBorderPainted(false);
        login_section_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_section_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(login_section_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 30, 230, 50));

        signUp_section_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_component_assets/SignUp_Button.png"))); // NOI18N
        signUp_section_button.setBorderPainted(false);
        signUp_section_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUp_section_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(signUp_section_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 30, 210, 50));
        getContentPane().add(phoneNumber_textField, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 190, 540, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_component_assets/SignUp_Menu_Patient.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, -1, 1010));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_buttonActionPerformed

    private void manActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manActionPerformed

    private void womanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_womanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_womanActionPerformed

    private void signUp_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUp_buttonActionPerformed
        // TODO add your handling code here:
        String firstName = name_textfield1.getText();
        String lastName = surname_textfield.getText();
        String gender = "";
        if(man.isSelected()){
            gender = "Erkek";
        }
        if(woman.isSelected()){
            gender = "Kadın";
        }
        int age = Integer.parseInt(age_textfield.getText());
        String email = email_textfield.getText();
        String password = "";
        if (password_field.getText().equals(password_field1.getText())){
            char[] pf = password_field.getPassword();
            password = new String(pf);
        }
        int phoneNumber = Integer.parseInt(phoneNumber_textField.getText());
        insert(firstName, lastName, gender, age, email, password, phoneNumber);
        
        
        //Main menu constructor yapılacak(üyelik işlemleri için)
        JFrame menu = new MainMenuPatient(email);
        menu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_signUp_buttonActionPerformed

    private void signUp_section_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUp_section_buttonActionPerformed
        // TODO add your handling code here:
        JFrame accChose = new AccountChooseJFrame();
        accChose.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_signUp_section_buttonActionPerformed

    private void login_section_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_section_buttonActionPerformed
        // TODO add your handling code here:
         JFrame accChose = new UIDeneme();
        accChose.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_login_section_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(SignUpPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpPatient().setVisible(true);
            }
        });
    }
    
    private static void insert(String firstName, String lastName, String gender, int age, String email, String password, int phoneNumber){
        Connection con = patientDbConnection.connect();
        PreparedStatement ps = null;
        try{
            String sql = "INSERT INTO patients(firstName, lastName, gender, age, email, password, phoneNumber) VALUES(?,?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setString(3, gender);
            ps.setInt(4, age);
            ps.setString(5, email);
            ps.setString(6, password);
            ps.setInt(7, phoneNumber);
            ps.execute();
            System.out.println("Data has been inserted!");
        } catch(SQLException e){
            System.out.println(e.toString());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age_textfield;
    private javax.swing.JTextField email_textfield;
    private javax.swing.ButtonGroup genderPatient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton login_section_button;
    private javax.swing.JRadioButton man;
    private javax.swing.JTextField name_textfield1;
    private javax.swing.JPasswordField password_field;
    private javax.swing.JPasswordField password_field1;
    private javax.swing.JTextField phoneNumber_textField;
    private javax.swing.JButton search_button;
    private javax.swing.JTextField search_textfield;
    private javax.swing.JButton signUp_button;
    private javax.swing.JButton signUp_section_button;
    private javax.swing.JTextField surname_textfield;
    private javax.swing.JRadioButton woman;
    // End of variables declaration//GEN-END:variables
}
