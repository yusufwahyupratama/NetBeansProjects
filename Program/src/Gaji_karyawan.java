/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author yusuf
 */
public class Gaji_karyawan extends javax.swing.JFrame {
    int gajjipokok,gajibersih,txtanak,txtTunj;
    String jum_anak,total_gaji;
    /**
     * Creates new form Gaji_karyawan
     */
    public Gaji_karyawan() {
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

        nama = new javax.swing.JLabel();
        cmbjabatan = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        s = new javax.swing.JLabel();
        txtpokok = new javax.swing.JLabel();
        tun_anak = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        cmbjabata = new javax.swing.JComboBox<>();
        go = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnmenikah = new javax.swing.JRadioButton();
        btnbelummenikah = new javax.swing.JRadioButton();
        txtanak = new javax.swing.JTextField();
        txtgapok = new javax.swing.JTextField();
        total_gaji = new javax.swing.JTextField();
        txtTunj = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nama.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nama.setText("Nama Pegawai");

        cmbjabatan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbjabatan.setText("Jabatan");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Status");

        s.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        s.setText("Jumlah Anak");

        txtpokok.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtpokok.setText("Gaji Pokok");

        tun_anak.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tun_anak.setText("Tunjangan anak");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Total Gaji");

        cmbjabata.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Direktur", "Manager", "Sersonalia", "Staf" }));
        cmbjabata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbjabataActionPerformed(evt);
            }
        });

        go.setText("GO");
        go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goActionPerformed(evt);
            }
        });

        jButton2.setText("Bersih");

        btnmenikah.setText("Menikah");
        btnmenikah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenikahActionPerformed(evt);
            }
        });

        btnbelummenikah.setText("Belum Menikah");
        btnbelummenikah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbelummenikahActionPerformed(evt);
            }
        });

        txtanak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtanakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tun_anak)
                            .addComponent(txtpokok)
                            .addComponent(jLabel3)
                            .addComponent(cmbjabatan))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbjabata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(btnmenikah)
                                .addGap(18, 18, 18)
                                .addComponent(btnbelummenikah))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtgapok)
                                    .addComponent(txtTunj)
                                    .addComponent(total_gaji, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(75, 75, 75))))
                    .addComponent(jLabel7)
                    .addComponent(nama)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(s)
                        .addGap(99, 99, 99)
                        .addComponent(txtanak, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(go)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nama)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbjabatan)
                    .addComponent(cmbjabata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(go)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnmenikah)
                                .addComponent(btnbelummenikah)))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(s)
                            .addComponent(txtanak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtpokok)
                            .addComponent(txtgapok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTunj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tun_anak))
                                .addGap(18, 18, 18)
                                .addComponent(total_gaji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbjabataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbjabataActionPerformed
    int pilihan = cmbjabatan.getSelectedIndex();
    switch(pilihan) {
        case 0:
            txtgapok.setText("2000000");
        break;
        case 1:
            txtgapok.setText("3000000");
        break;
        case 2:
            txtgapok.setText("4000000");
        break;
        case 3:
            txtgapok.setText("5000000");
        break;
    }//GEN-LAST:event_cmbjabataActionPerformed

    private void btnmenikahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenikahActionPerformed
        txtanak.setEnabel();
        txtTunj.setEnabel();
        
        gajipokok = Integer.valueOf(txtgapok.getText());
        
        txtanak = Integer.valueOf(txtgapok.getText());
        
        if(txtanak<=2 && txtanak>=1){
            txtTunj = (( 10 *gajipokok)/100) *txtanak;
        }
        
        else if(txtanak>=2){
            txtTunj = (( 10 *gajipokok)/100) *2;
        }
        else
            txtTunj = 0;
        }
    }//GEN-LAST:event_btnmenikahActionPerformed

    private void txtanakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtanakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanakActionPerformed

    private void btnbelummenikahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbelummenikahActionPerformed
       tun_anak = o;
       txtTunj.setText("0");
       txtanak.setText("0");
       txtTunj.setEnabel(false);
       txtanak.setEnabel(false);
       
// TODO add your handling code here:
    }//GEN-LAST:event_btnbelummenikahActionPerformed

    private void goActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goActionPerformed
    gajibersih = gajipokok + tun_anak;
    
    gajibersih_1 = gajipokok + tun_anak;
    txtTotal.setText(gajibersih);
    
// TODO add your handling code here:
    }//GEN-LAST:event_goActionPerformed

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
            java.util.logging.Logger.getLogger(Gaji_karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gaji_karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gaji_karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gaji_karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gaji_karyawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnbelummenikah;
    private javax.swing.JRadioButton btnmenikah;
    private javax.swing.JComboBox<String> cmbjabata;
    private javax.swing.JLabel cmbjabatan;
    private javax.swing.JButton go;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel nama;
    private javax.swing.JLabel s;
    private javax.swing.JTextField total_gaji;
    private javax.swing.JLabel tun_anak;
    private javax.swing.JTextField txtTunj;
    private javax.swing.JTextField txtanak;
    private javax.swing.JTextField txtgapok;
    private javax.swing.JTextField txtnama;
    private javax.swing.JLabel txtpokok;
    // End of variables declaration//GEN-END:variables
}
