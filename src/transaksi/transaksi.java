/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaksi;

//import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import koneksi.config;

/**
 *
 * @author reisa
 */
public class transaksi extends javax.swing.JFrame {

    /**
     * Creates new form transaksi
     */
    public transaksi() {
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

        jLabel1 = new javax.swing.JLabel();
        kdTransaksi = new javax.swing.JTextField();
        namaTransaksi = new javax.swing.JTextField();
        telp = new javax.swing.JTextField();
        kdBarang = new javax.swing.JTextField();
        namaBarang = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        harga = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jumlah = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        totalHarga = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        diskon = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        simpan = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        kembali = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Kode Transaksi");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));
        getContentPane().add(kdTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 110, -1));
        getContentPane().add(namaTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 130, -1));
        getContentPane().add(telp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 140, -1));
        getContentPane().add(kdBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 110, -1));
        getContentPane().add(namaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 130, -1));

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel3.setText("Telp");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel4.setText("Kode Barang");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel5.setText("Nama barang");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, -1));

        harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargaActionPerformed(evt);
            }
        });
        getContentPane().add(harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 120, -1));

        jLabel6.setText("Harga");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, -1));

        jumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jumlahKeyReleased(evt);
            }
        });
        getContentPane().add(jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 100, -1));

        jLabel7.setText("Jumlah");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, -1));
        getContentPane().add(totalHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 120, -1));

        jLabel8.setText("Total");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, -1, -1));
        getContentPane().add(diskon, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 120, -1));

        jLabel9.setText("Diskon");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, -1, -1));

        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        getContentPane().add(simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, -1, -1));

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, -1, -1));

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 170, -1, -1));

        kembali.setText("Kembali");
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });
        getContentPane().add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 780, 210));

        jButton5.setText("Cari");
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        setSize(new java.awt.Dimension(814, 524));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_kembaliActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "INSERT INTO transaksi VALUES ('"+kdTransaksi.getText()+"','"+namaTransaksi.getText()+
                    "','"+telp.getText()+"','"+kdBarang.getText()+"','"+
                    namaBarang.getText()+"','"+harga.getText()+"','"+
                    jumlah.getText()+"','"+totalHarga.getText()+"','"+
                    diskon.getText()+"')";
            java.sql.Connection conn=(Connection)config.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Data berhasil disimpan.");
            //tampilData();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Data gagal Disimpan!","Kesalahan", JOptionPane.ERROR_MESSAGE);
                //Logger.getLogger(member.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_simpanActionPerformed

    private void hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hargaActionPerformed

    private void jumlahKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jumlahKeyReleased
        // TODO add your handling code here:
        int a,b,diskonHarga;
        a = Integer.parseInt(harga.getText());
        b = Integer.parseInt(jumlah.getText());
        int total;
        total = a*b;
        totalHarga.setText(String.valueOf(total));
        //
        if (total>=20000){
            diskonHarga=(total-((total*5)/100));
            diskon.setText(String.valueOf(diskonHarga));
        }else if (total>=30000){
            diskonHarga=(total-((total*10)/100));
            diskon.setText(String.valueOf(diskonHarga));
        }else {
            diskon.setText("0");
        }
    }//GEN-LAST:event_jumlahKeyReleased

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "UPDATE transaksi set nama=?,telp=?,kodeb=?,barang=?,"
                    + "harga=?,jumlah=?,total=?,diskon=?  where transaksi=?";
            java.sql.Connection conn=(Connection)config.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, namaTransaksi.getText());
            pst.setString(2, telp.getText());
            pst.setString(3, kdBarang.getText());
            pst.setString(4, namaBarang.getText());
            pst.setString(5, harga.getText());
            pst.setString(6, jumlah.getText());
            pst.setString(7, totalHarga.getText());
            pst.setString(7, diskon.getText());
            pst.setString(8, kdTransaksi.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Data berhasil disimpan.");
            //tampilData();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Data gagal Disimpan!","Kesalahan", JOptionPane.ERROR_MESSAGE);
                //Logger.getLogger(member.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(null, "Apakah anda yakin "
                + "ingin menghapus data tersebut?", "Konfirmasi", 
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (confirm == 0){
            try{
              java.sql.Connection conn=(Connection)config.configDB();    
              String sql = "DELETE FROM transaksi where id ='" + kdTransaksi.getText() + "'";
              java.sql.PreparedStatement pst = conn.prepareStatement(sql);
              pst.executeUpdate();
              JOptionPane.showMessageDialog(null, "Data berhasil dihapus", "Pesan", JOptionPane.INFORMATION_MESSAGE);
              //tampilData();
                kdTransaksi.setText("");
                namaTransaksi.setText("");
                telp.setText("");
                kdBarang.setText("");
                namaBarang.setText("");
                harga.setText("");
                jumlah.setText("");
                totalHarga.setText("");
                diskon.setText("");
            }catch (SQLException e){
                JOptionPane.showMessageDialog(null, "Data gagal di hapus" + e.getMessage(), "Pesan", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JTextField diskon;
    private javax.swing.JTextField harga;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jumlah;
    private javax.swing.JTextField kdBarang;
    private javax.swing.JTextField kdTransaksi;
    private javax.swing.JButton kembali;
    private javax.swing.JTextField namaBarang;
    private javax.swing.JTextField namaTransaksi;
    private javax.swing.JButton simpan;
    private javax.swing.JTextField telp;
    private javax.swing.JTextField totalHarga;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
