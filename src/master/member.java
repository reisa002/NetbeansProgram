/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package master;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.config;

/**
 *
 * @author reisa
 */
public class member extends javax.swing.JFrame {

    /**
     * Creates new form member
     */
    public member() throws SQLException {
        initComponents();
        this.tampilData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idMember = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        namaMember = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        alamatMember = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        telpMember = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        simpan = new javax.swing.JButton();
        update = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        kembali = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelMember = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(idMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 110, -1));

        jLabel1.setText("Id Member");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
        getContentPane().add(namaMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 120, -1));

        jLabel2.setText("Nama Member");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));
        getContentPane().add(alamatMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 100, -1));

        jLabel3.setText("Alamat");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));
        getContentPane().add(telpMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 120, -1));

        jLabel4.setText("Telp");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        getContentPane().add(simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        hapus.setText("Delete");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        getContentPane().add(hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));

        kembali.setText("Kembali");
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });
        getContentPane().add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        tabelMember.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMemberMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelMember);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, -1, 290));

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 80));

        setSize(new java.awt.Dimension(747, 448));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_kembaliActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        if(idMember.getText().equals("")||namaMember.getText().equals("")||alamatMember.getText()
                .equals("")||telpMember.getText().equals(""))
        {
        JOptionPane.showMessageDialog(null, "Masukkan data dengan benar !","Kesalahan", JOptionPane.ERROR_MESSAGE);
        return;
        } else
        try{
            String sql = "INSERT INTO member VALUES ('"+idMember.getText()+"','"+namaMember.getText()+
                    "','"+alamatMember.getText()+"','"+telpMember.getText()+"')";
            java.sql.Connection conn=(Connection)config.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Data berhasil disimpan.");
            tampilData();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Data gagal Disimpan!","Kesalahan", JOptionPane.ERROR_MESSAGE);
                //Logger.getLogger(member.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        idMember.setText("");
        namaMember.setText("");
        alamatMember.setText("");
        telpMember.setText("");
    }//GEN-LAST:event_simpanActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "UPDATE member set nama=?,alamat=?,telp=? where id=?";
            java.sql.Connection conn=(Connection)config.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, namaMember.getText());
            pst.setString(2, alamatMember.getText());
            pst.setString(3, telpMember.getText());
            pst.setString(4, idMember.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Data berhasil disimpan.");
            tampilData();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Data gagal Disimpan!","Kesalahan", JOptionPane.ERROR_MESSAGE);
                //Logger.getLogger(member.class.getName()).log(Level.SEVERE, null, ex);
        }
        idMember.setText("");
        namaMember.setText("");
        alamatMember.setText("");
        telpMember.setText("");
    }//GEN-LAST:event_updateActionPerformed

    private void tabelMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMemberMouseClicked
        // TODO add your handling code here:
        int mouseKlik = tabelMember.getSelectedRow();
        idMember.setText(tableModel.getValueAt(mouseKlik, 0).toString());
        namaMember.setText(tableModel.getValueAt(mouseKlik, 1).toString());
        alamatMember.setText(tableModel.getValueAt(mouseKlik, 2).toString());
        telpMember.setText(tableModel.getValueAt(mouseKlik, 3).toString());
    }//GEN-LAST:event_tabelMemberMouseClicked

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
       if(idMember.getText().equals("")||namaMember.getText().equals("")||alamatMember.getText()
                .equals("")||telpMember.getText().equals(""))
        {
        JOptionPane.showMessageDialog(null, "Masukkan data dengan benar !","Kesalahan", JOptionPane.ERROR_MESSAGE);
        return;
        }
           
        int confirm = JOptionPane.showConfirmDialog(null, "Apakah anda yakin "
                + "ingin menghapus data tersebut?", "Konfirmasi", 
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (confirm == 0){
            try{
              java.sql.Connection conn=(Connection)config.configDB();    
              String sql = "DELETE FROM member where id ='" + idMember.getText() + "'";
              java.sql.PreparedStatement pst = conn.prepareStatement(sql);
              pst.executeUpdate();
              JOptionPane.showMessageDialog(null, "Data berhasil dihapus", "Pesan", JOptionPane.INFORMATION_MESSAGE);
              tampilData();
                idMember.setText("");
                namaMember.setText("");
                alamatMember.setText("");
                telpMember.setText("");
                idMember.requestFocus();
            }catch (SQLException e){
                JOptionPane.showMessageDialog(null, "Data gagal di hapus" + e.getMessage(), "Pesan", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_hapusActionPerformed

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
            java.util.logging.Logger.getLogger(member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new member().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(member.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamatMember;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField idMember;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kembali;
    private javax.swing.JTextField namaMember;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tabelMember;
    private javax.swing.JTextField telpMember;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
private DefaultTableModel tableModel;
private String sql;
public void tampilData() throws SQLException{
    tableModel = new DefaultTableModel();
    tableModel.addColumn("ID Member");
    tableModel.addColumn("Nama Member");
    tableModel.addColumn("Alamat");
    tableModel.addColumn("Telp");
    tabelMember.setModel(tableModel);
    java.sql.Connection conn=(Connection)config.configDB();
    try{
        java.sql.Statement stm = conn.createStatement();
        sql ="SELECT * FROM member";
        java.sql.ResultSet res = stm.executeQuery(sql);
        while (res.next()){
            tableModel.addRow(new Object[]{
            res.getString("id"),
            res.getString("nama"),
            res.getString("alamat"),
            res.getString("telp")
        });
        }
    }catch (SQLException e){
        System.out.println(e.getMessage());
    }
}
}

