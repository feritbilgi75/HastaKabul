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
public class SignUpDoctorPage extends javax.swing.JFrame {

    /**
     * Creates new form SignUpDoctorPage
     */
    public SignUpDoctorPage() {
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

        gender = new javax.swing.ButtonGroup();
        statue = new javax.swing.ButtonGroup();
        woman = new javax.swing.JRadioButton();
        man = new javax.swing.JRadioButton();
        age_textfield = new javax.swing.JTextField();
        surname_textfield = new javax.swing.JTextField();
        email_textfield = new javax.swing.JTextField();
        branch_textfield = new javax.swing.JTextField();
        clinic_textfield = new javax.swing.JTextField();
        insurance_textfield = new javax.swing.JTextField();
        about_textfield = new javax.swing.JTextField();
        phone_number__textfield = new javax.swing.JTextField();
        search_textfield = new javax.swing.JTextField();
        password_field = new javax.swing.JPasswordField();
        password_field1 = new javax.swing.JPasswordField();
        name_textfield1 = new javax.swing.JTextField();
        search_button = new javax.swing.JButton();
        login_section_button = new javax.swing.JButton();
        signUp_button = new javax.swing.JButton();
        signUp_section_button = new javax.swing.JButton();
        upload_photo = new javax.swing.JButton();
        uzman = new javax.swing.JRadioButton();
        docent = new javax.swing.JRadioButton();
        professor = new javax.swing.JRadioButton();
        assistant = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gender.add(woman);
        getContentPane().add(woman, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, 20, 20));

        gender.add(man);
        getContentPane().add(man, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 40, -1));

        age_textfield.setBackground(new java.awt.Color(255, 255, 255));
        age_textfield.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(age_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 540, 70));

        surname_textfield.setBackground(new java.awt.Color(255, 255, 255));
        surname_textfield.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(surname_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 540, 70));

        email_textfield.setBackground(new java.awt.Color(255, 255, 255));
        email_textfield.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(email_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 590, 540, 70));

        branch_textfield.setBackground(new java.awt.Color(255, 255, 255));
        branch_textfield.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(branch_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 200, 540, 70));

        clinic_textfield.setBackground(new java.awt.Color(255, 255, 255));
        clinic_textfield.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(clinic_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 300, 540, 70));

        insurance_textfield.setBackground(new java.awt.Color(255, 255, 255));
        insurance_textfield.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(insurance_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 470, 540, 70));

        about_textfield.setBackground(new java.awt.Color(255, 255, 255));
        about_textfield.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(about_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 730, 540, 150));

        phone_number__textfield.setBackground(new java.awt.Color(255, 255, 255));
        phone_number__textfield.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(phone_number__textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 590, 540, 70));

        search_textfield.setBackground(new java.awt.Color(255, 255, 255));
        search_textfield.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(search_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 540, 70));

        password_field.setBackground(new java.awt.Color(255, 255, 255));
        password_field.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(password_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 820, 540, 70));

        password_field1.setBackground(new java.awt.Color(255, 255, 255));
        password_field1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(password_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 700, 540, 70));

        name_textfield1.setBackground(new java.awt.Color(255, 255, 255));
        name_textfield1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(name_textfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 540, 70));

        search_button.setBackground(new java.awt.Color(255, 255, 255));
        search_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_component_assets/SearchIcon.png"))); // NOI18N
        search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(search_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, -1, -1));

        login_section_button.setBackground(new java.awt.Color(255, 255, 255));
        login_section_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_component_assets/LogIn_Button.png"))); // NOI18N
        login_section_button.setBorderPainted(false);
        login_section_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_section_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(login_section_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 40, 230, 50));

        signUp_button.setBackground(new java.awt.Color(255, 255, 255));
        signUp_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_component_assets/SignUp_Button.png"))); // NOI18N
        signUp_button.setBorderPainted(false);
        signUp_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUp_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(signUp_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 920, 290, 60));

        signUp_section_button.setBackground(new java.awt.Color(255, 255, 255));
        signUp_section_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_component_assets/SignUp_Button.png"))); // NOI18N
        signUp_section_button.setBorderPainted(false);
        signUp_section_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUp_section_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(signUp_section_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 40, 210, 50));

        upload_photo.setBackground(new java.awt.Color(255, 255, 255));
        upload_photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_component_assets/UploadPhotoButton.png"))); // NOI18N
        upload_photo.setBorderPainted(false);
        getContentPane().add(upload_photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 920, 290, 60));

        statue.add(uzman);
        getContentPane().add(uzman, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 400, 30, 30));

        statue.add(docent);
        getContentPane().add(docent, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 400, 30, 30));

        statue.add(professor);
        getContentPane().add(professor, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 400, 30, 30));

        statue.add(assistant);
        getContentPane().add(assistant, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 400, 30, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_component_assets/SignUp_Menu_Doctor.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_buttonActionPerformed

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
        String branch = branch_textfield.getText();
        String clinic = clinic_textfield.getText();
        String statue = "";
        if(assistant.isSelected()){
            statue = "Asistan";
        }
        if(uzman.isSelected()){
            statue = "Uzman";
        }
        if(docent.isSelected()){
            statue = "Doçent";
        }
        if(professor.isSelected()){
            statue = "Profesör";
        }
        String insurance = insurance_textfield.getText();
        String about = about_textfield.getText();
        
        int phoneNumber = Integer.parseInt(phone_number__textfield.getText());
        insert(firstName, lastName, gender, age, email, password, branch, clinic, statue, insurance, phoneNumber,about);
        
        
        //Main menu constructor yapılacak(üyelik işlemleri için)
        JFrame menu = new MainMenuDoctor();
        menu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_signUp_buttonActionPerformed

    private void login_section_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_section_buttonActionPerformed
        // TODO add your handling code here:
        JFrame accChose = new UIDeneme();
        accChose.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_login_section_buttonActionPerformed

    private void signUp_section_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUp_section_buttonActionPerformed
        // TODO add your handling code here:
        JFrame accChose = new AccountChooseJFrame();
        accChose.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_signUp_section_buttonActionPerformed

    private static void insert(String firstName, String lastName, String gender, int age, String email, String password, String branch, String clinic, String statue, String insurance, int phoneNumber, String about){
        Connection con = doctorDbConnection.connect();
        PreparedStatement ps = null;
        try{
            String sql = "INSERT INTO doctors(firstName, lastName, gender, age, email, password, branch, clinic, statue, insurance, phoneNumber,about) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setString(3, gender);
            ps.setInt(4, age);
            ps.setString(5, email);
            ps.setString(6, password);
            ps.setString(7, branch);
            ps.setString(8, clinic);
            ps.setString(9, statue);
            ps.setString(10, insurance);
            ps.setInt(11, phoneNumber);
            ps.setString(12, about);
            ps.execute();
            System.out.println("Data has been inserted!");
        } catch(SQLException e){
            System.out.println(e.toString());
        }
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
            java.util.logging.Logger.getLogger(SignUpDoctorPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpDoctorPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpDoctorPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpDoctorPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpDoctorPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField about_textfield;
    private javax.swing.JTextField age_textfield;
    private javax.swing.JRadioButton assistant;
    private javax.swing.JTextField branch_textfield;
    private javax.swing.JTextField clinic_textfield;
    private javax.swing.JRadioButton docent;
    private javax.swing.JTextField email_textfield;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JTextField insurance_textfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton login_section_button;
    private javax.swing.JRadioButton man;
    private javax.swing.JTextField name_textfield1;
    private javax.swing.JPasswordField password_field;
    private javax.swing.JPasswordField password_field1;
    private javax.swing.JTextField phone_number__textfield;
    private javax.swing.JRadioButton professor;
    private javax.swing.JButton search_button;
    private javax.swing.JTextField search_textfield;
    private javax.swing.JButton signUp_button;
    private javax.swing.JButton signUp_section_button;
    private javax.swing.ButtonGroup statue;
    private javax.swing.JTextField surname_textfield;
    private javax.swing.JButton upload_photo;
    private javax.swing.JRadioButton uzman;
    private javax.swing.JRadioButton woman;
    // End of variables declaration//GEN-END:variables
}
