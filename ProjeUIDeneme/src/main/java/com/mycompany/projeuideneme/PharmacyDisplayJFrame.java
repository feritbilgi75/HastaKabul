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
public class PharmacyDisplayJFrame extends javax.swing.JFrame {

    /**
     * Creates new form PharmacyDisplayJFrame
     */
    
    private Integer id;
    
    public PharmacyDisplayJFrame(Integer id) {
        initComponents();
        jTextField1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton10.setVisible(false);
        this.id = id;
        
        Connection con = asliDbConnection.connect();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
           
            String sql = "Select name , address , phone from pharmaces ";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                addDynamicPnl(rs.getString("name"),rs.getString("address"),rs.getString("phone"));
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

        jScrollPane1 = new javax.swing.JScrollPane();
        pnlDinamik = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1440, 1024));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setHorizontalScrollBar(null);
        jScrollPane1.setRowHeaderView(null);

        pnlDinamik.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 51, 51), new java.awt.Color(102, 255, 255), new java.awt.Color(51, 255, 0), new java.awt.Color(51, 0, 255)));
        pnlDinamik.setAutoscrolls(true);
        pnlDinamik.setMinimumSize(new java.awt.Dimension(50, 50));
        pnlDinamik.setPreferredSize(new java.awt.Dimension(50, 50));
        pnlDinamik.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane1.setViewportView(pnlDinamik);
        pnlDinamik.getAccessibleContext().setAccessibleName("pnlDinamik");

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 1220, 840));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_component_assets/LOGO 2.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 120, 110));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 400, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_component_assets/SearchIcon.png"))); // NOI18N
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 70, 40));

        jButton3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("Randevularım");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 170, 30));

        jButton4.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 51, 0));
        jButton4.setText("Sigortalarım");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 60, 160, 30));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_component_assets/Arrow.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 160, 90, 40));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_component_assets/User_Button.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 50, 130, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_component_assets/Frame 2 (3).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, -1));

        jTextField2.setText("jTextField2");
        jPanel1.add(jTextField2);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 1070, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addDynamicPnl(String isim , String adres , String telefon){
        javax.swing.JPanel pnlDinamikIc = new  javax.swing.JPanel();
                
        pnlDinamikIc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 51, 204), new java.awt.Color(0, 204, 204), new java.awt.Color(51, 204, 0), new java.awt.Color(255, 255, 0)));
        pnlDinamikIc.setPreferredSize(new java.awt.Dimension(200, 25    ));

        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel7 = new javax.swing.JLabel();

        jLabel5.setText(isim);
        jLabel5.setMinimumSize(new java.awt.Dimension(1337, 16));
        jLabel5.setPreferredSize(new java.awt.Dimension(1000, 32));
        pnlDinamikIc.add(jLabel5);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_component_assets/yer_isareti.png"))); // NOI18N
        jLabel6.setText(adres);
        jLabel6.setMinimumSize(new java.awt.Dimension(1337, 16));
        jLabel6.setPreferredSize(new java.awt.Dimension(1000, 32));
        pnlDinamikIc.add(jLabel6);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_component_assets/telefon.png"))); // NOI18N
        jLabel7.setText(telefon);
        jLabel7.setMinimumSize(new java.awt.Dimension(1337, 16));
        jLabel7.setPreferredSize(new java.awt.Dimension(1000, 32));
        pnlDinamikIc.add(jLabel7);
        
        pnlDinamik.add(pnlDinamikIc);
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        /*JFrame frame = new MainMenuPatient(email);
        frame.setVisible(true);
        setVisible(false);*/
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        /*JFrame frame = new PatientEditPageJFrame(email);
        frame.setVisible(true);
        setVisible(false);*/
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      /*  JFrame frame = new appointments_clinic(rowID);
        frame.setVisible(true);
        setVisible(false);*/
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         JFrame frame = new MainMenuPatient(id);
        frame.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(PharmacyDisplayJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PharmacyDisplayJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PharmacyDisplayJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PharmacyDisplayJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PharmacyDisplayJFrame(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel pnlDinamik;
    // End of variables declaration//GEN-END:variables
}
