/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasippdb;
import controller.Data_Pembayaran;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import java.util.HashMap;
/**
 *
 * @author LENOVO
 */
public class DataPembayaran extends javax.swing.JFrame {
private void ViewData(){
    Data_Pembayaran ck = new Data_Pembayaran();
    try{
        tbPembayaran.setModel(DbUtils.resultSetToTableModel(ck.UpdatetblPembayaran()));
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
    }
    
}
private void AmbilKelompok(String kelompok){
    String[]ag = {"Kelompok 1, Kelompok 2, Kelompok 3"};
    cbKelompok.removeAllItems();
    cbKelompok.addItem(kelompok);
    for(int i = 0;i<ag.length;i++){
        cbKelompok.addItem(ag[i]);
    }
}

private void AmbilBiaya(String biaya){
    String[]e = {"1.000.000, 1.500.000, 2.000.000"};
    cbBiaya.removeAllItems();
    cbBiaya.addItem(biaya);
    for(int i = 0;i<e.length;i++){
        cbBiaya.addItem(e[i]);
    }
}

    /**
     * Creates new form DataPembayaran
     */
    public DataPembayaran() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbKelompok = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbBiaya = new javax.swing.JComboBox<>();
        btnSimpan = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPembayaran = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/2704332.png"))); // NOI18N
        jLabel1.setText("Data Pembayaran");

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Id Pembayaran");

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Kelompok");

        cbKelompok.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        cbKelompok.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kelompok 1", "Kelompok 2", "Kelompok 3" }));
        cbKelompok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKelompokActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Biaya");

        cbBiaya.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        cbBiaya.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.000.000", "1.500.000", "2.00.000" }));

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnHapus.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        tbPembayaran.setModel(new javax.swing.table.DefaultTableModel(
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
        tbPembayaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPembayaranMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPembayaran);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/x.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSimpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnClear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnHapus))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbKelompok, 0, 153, Short.MAX_VALUE)
                                    .addComponent(cbBiaya, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(idTF))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbKelompok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbBiaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSimpan)
                            .addComponent(btnEdit)
                            .addComponent(btnClear)
                            .addComponent(btnHapus))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbKelompokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKelompokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbKelompokActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        Data_Pembayaran ck = new Data_Pembayaran();
        ck.id_pembayaran = idTF.getText();
        ck.kelompok =(String)cbKelompok.getSelectedItem();
        ck.biaya =(String)cbBiaya.getSelectedItem();
        try{
            ck.simpan();
            JOptionPane.showMessageDialog(null, "Simpan");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }ViewData();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        this.hide();
        Home frm=new Home();
        frm.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void tbPembayaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPembayaranMouseClicked
        // TODO add your handling code here:
         int row = tbPembayaran.getSelectedRow();
        idTF.setText(tbPembayaran.getModel().getValueAt(row, 0).toString());
        String kelompok=tbPembayaran.getModel().getValueAt(row, 1).toString();
        String biaya=tbPembayaran.getModel().getValueAt(row, 2).toString();
        
    }//GEN-LAST:event_tbPembayaranMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        ViewData();
    }//GEN-LAST:event_formWindowOpened

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        Data_Pembayaran ck = new Data_Pembayaran();
        ck.id_pembayaran = idTF.getText();
        ck.kelompok =(String)cbKelompok.getSelectedItem();
        ck.biaya =(String)cbBiaya.getSelectedItem();
        try{
            ck.edit();
            JOptionPane.showMessageDialog(null, "Edit");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }ViewData();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        idTF.setText("");
        cbKelompok.setSelectedItem("");
        cbBiaya.setSelectedItem("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        String ObjButtons[]={"Yes","Now"};
        int PromptResult = JOptionPane.showOptionDialog(null, "Yakin Ingin Menghapus ?", "Massage", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, ObjButtons, ObjButtons[1]);
        if(PromptResult==0){
            Data_Pembayaran ck = new Data_Pembayaran();
            ck.id_pembayaran = idTF.getText();
            try{
                ck.hapus();
                JOptionPane.showMessageDialog(null, "Hapus");
                ViewData();
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

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
            java.util.logging.Logger.getLogger(DataPembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataPembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataPembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataPembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataPembayaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cbBiaya;
    private javax.swing.JComboBox<String> cbKelompok;
    private javax.swing.JTextField idTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbPembayaran;
    // End of variables declaration//GEN-END:variables
}
