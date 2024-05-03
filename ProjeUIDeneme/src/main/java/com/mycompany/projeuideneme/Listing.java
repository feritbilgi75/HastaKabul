/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.projeuideneme;

/**
 *
 * @author feritbilgi
 */
public class Listing extends javax.swing.JPanel {

    /**
     * Creates new form Listing
     */
    public Listing() {
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

        DoctorNameText = new javax.swing.JLabel();
        LocationText = new javax.swing.JLabel();
        BracnhText = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        DoctorImage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DoctorNameText.setBackground(new java.awt.Color(255, 255, 255));
        DoctorNameText.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 36)); // NOI18N
        DoctorNameText.setForeground(new java.awt.Color(0, 0, 0));
        DoctorNameText.setText("DR. Name And Surname");
        add(DoctorNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 270, 110));

        LocationText.setBackground(new java.awt.Color(255, 255, 255));
        LocationText.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 36)); // NOI18N
        LocationText.setForeground(new java.awt.Color(0, 0, 0));
        LocationText.setText("Location Text");
        add(LocationText, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 270, 110));

        BracnhText.setBackground(new java.awt.Color(255, 255, 255));
        BracnhText.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 36)); // NOI18N
        BracnhText.setForeground(new java.awt.Color(0, 0, 0));
        BracnhText.setText("Branch Text");
        add(BracnhText, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 270, 110));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 660, 210));

        DoctorImage.setBackground(new java.awt.Color(255, 255, 255));
        DoctorImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_component_assets/DoctorImage.png"))); // NOI18N
        DoctorImage.setText("jLabel1");
        add(DoctorImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, -3, 300, 310));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_component_assets/hosLocationIcon.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 40, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_component_assets/Arrow.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 40, 40));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BracnhText;
    private javax.swing.JLabel DoctorImage;
    private javax.swing.JLabel DoctorNameText;
    private javax.swing.JLabel LocationText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}