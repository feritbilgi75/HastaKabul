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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class GetAppointment extends javax.swing.JFrame {

    /**
     * Creates new form PharmacyDisplayJFrame
     */
    
    private Integer id;
    
    public GetAppointment(Integer id) {
        initComponents();
        getClinics();
        this.id =id;
        randevuTarihi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "17/05/2024", "18/05/2024", "19/05/2024", "20/05/2024" }));
    }
    private void getClinics(){
        Connection con = asliDbConnection.connect();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            String sql = "Select name,branch,phoneNo,rowid from clinics ";
            ps = con.prepareStatement(sql);
           
            rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) klinikTable.getModel();
            model.setRowCount(0);

            //we are reading one row, so no need to loop
            while (rs.next()){
                model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)});
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

    private void getDoctors(Integer clinicId){
        Connection con = asliDbConnection.connect();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            String sql = "Select b.firstName,b.lastName,b.branch , b.rowid from doktorKlinikEsleme a , doctors b "
                    + "where a.clinic_rowID = ? and a.doctor_rowID = b.rowid ";
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, clinicId);
           
            rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) doctorsTable.getModel();
            model.setRowCount(0);

            //we are reading one row, so no need to loop
            while (rs.next()){
                model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)});
            }
        }catch(SQLException e){
            System.out.println(e.toString());
        }finally{
            try{
                if(rs != null){
                    rs.close();
                }
                
                ps.close();
                con.close();
            }catch(SQLException e){
                System.out.println(e.toString());
            }
            
        }
    }
    
    private void insert(){
        Connection con = asliDbConnection.connect();
        PreparedStatement ps = null;
        try{
            String sql = "INSERT INTO appointments(patientRowId , doctorRowId , clinicRowId,zaman) VALUES(?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1, this.id);
            
            Integer selectedRow = doctorsTable.getSelectedRow();
            String rowId = (String)doctorsTable.getValueAt(selectedRow, 3); 
        
            ps.setInt(2, Integer.parseInt(rowId));
            selectedRow = klinikTable.getSelectedRow();
            rowId = (String)klinikTable.getValueAt(selectedRow, 3); 

            ps.setInt(3, Integer.parseInt(rowId));

            ps.setString(4, randevuTarihi.getSelectedItem().toString());

            ps.execute();
            
            returnBack();
            System.out.println("Data has been inserted!");
        } catch(SQLException e){
            System.out.println(e.toString());
        }
    }
    
    private void returnBack(){
            JFrame frame = new appointments_patient(id);
            frame.setVisible(true);
            setVisible(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        klinikTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        doctorsTable = new javax.swing.JTable();
        randevuTarihi = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1440, 1024));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_component_assets/LOGO 2.png"))); // NOI18N
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 120, 110));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_component_assets/Arrow.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 160, 90, 40));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 0, 51), new java.awt.Color(255, 204, 0)));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.Y_AXIS));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Klinikler"));

        klinikTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Klinik Adı", "branch", "phoneNo", "rowid"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        klinikTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                klinikTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(klinikTable);
        if (klinikTable.getColumnModel().getColumnCount() > 0) {
            klinikTable.getColumnModel().getColumn(0).setResizable(false);
            klinikTable.getColumnModel().getColumn(1).setResizable(false);
            klinikTable.getColumnModel().getColumn(2).setResizable(false);
            klinikTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel2.add(jScrollPane1);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Doktorlar"));

        doctorsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "İsim", "Soyisim", "branch", "rowid"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(doctorsTable);
        if (doctorsTable.getColumnModel().getColumnCount() > 0) {
            doctorsTable.getColumnModel().getColumn(0).setResizable(false);
            doctorsTable.getColumnModel().getColumn(1).setResizable(false);
            doctorsTable.getColumnModel().getColumn(2).setResizable(false);
            doctorsTable.getColumnModel().getColumn(3).setResizable(false);
            doctorsTable.getColumnModel().getColumn(3).setPreferredWidth(0);
        }

        jPanel2.add(jScrollPane2);

        randevuTarihi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(randevuTarihi);

        jPanel1.setLayout(new java.awt.GridLayout());

        jButton2.setText("Randevu Ekle");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        jPanel2.add(jPanel1);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 1190, 730));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_component_assets/Frame 2 (3).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        returnBack();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        insert();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void klinikTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_klinikTableMouseClicked
        Integer selectedRow = klinikTable.getSelectedRow();
        String rowId = (String)klinikTable.getValueAt(selectedRow, 3); 
        getDoctors(Integer.parseInt(rowId));
    }//GEN-LAST:event_klinikTableMouseClicked

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
            java.util.logging.Logger.getLogger(GetAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GetAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GetAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GetAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GetAppointment(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable doctorsTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable klinikTable;
    private javax.swing.JComboBox<String> randevuTarihi;
    // End of variables declaration//GEN-END:variables
}
