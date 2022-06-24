/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FormCustomer;

import FormRegistrasiAccount.FormLogIn;
import FormRestaurant.FormShowReservasi;
import com.ubaya.disprog.Reservasi;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author RUTH
 */
public class FormHistoryReservation extends javax.swing.JFrame {

    
    

    /**
     * Creates new form HistoryReservation
     */
    public static Reservasi reservasi;
    
    

    public FormHistoryReservation() {
        initComponents();
        try {
            Reservasi res = new Reservasi();
            ArrayList<Reservasi> collections = (ArrayList<Reservasi>) showReservasiUser(FormLogIn.GlobalUsername);
            DefaultTableModel model = (DefaultTableModel) jTableReservasi.getModel();

            for (int i = 0; i < collections.size(); i++) {
                Reservasi reserve = (Reservasi) collections.get(i);
                System.out.println("Menggunakan class:" + reserve.getTanggalPesanan());
                model.addRow(new Object[]{reserve.getAccountUsername(), reserve.getTanggalPesanan(), reserve.getJumlahMeja(), reserve.getJumlahOrang(), reserve.getStatus()});
            }
            
        } catch (Exception e) {
            System.out.println("Error, pesan error: " + e.getMessage());
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

        lblReservation = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableReservasi = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        btnRate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("History Reservation");

        lblReservation.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        lblReservation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReservation.setText("HISTORY");
        lblReservation.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTableReservasi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 195, 0)));
        jTableReservasi.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jTableReservasi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_reservation", "Reservant ", "Reservant Date", "Total Table", "Number of People", "Status Reservasi", "Restaurant ID"
            }
        ));
        jTableReservasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableReservasiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableReservasi);

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reservation History");

        jButtonBack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonBack.setText("Back to home");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        btnRate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnRate.setText("Give rating!");
        btnRate.setActionCommand("Give rating");
        btnRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblReservation, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(btnRate, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRate, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(167, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        // TODO add your handling code here:
        FormHomeCustomer frm = new FormHomeCustomer();
        this.setVisible(false);
        frm.setVisible(true);
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void btnRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRateActionPerformed

    private void jTableReservasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableReservasiMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTableReservasi.getModel();
        int row = jTableReservasi.getSelectedRow();
        String status = (String) jTableReservasi.getValueAt(row, 4);
        if(status.equals("Arrived")){
            FormReview frm = new FormReview();
            this.setVisible(false);
            frm.setVisible(true);
        }
    }//GEN-LAST:event_jTableReservasiMouseClicked

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
            java.util.logging.Logger.getLogger(FormHistoryReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormHistoryReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormHistoryReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormHistoryReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormHistoryReservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRate;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableReservasi;
    private javax.swing.JLabel lblReservation;
    // End of variables declaration//GEN-END:variables

    private static java.util.List<com.ubaya.disprog.Reservasi> showReservasiUser(java.lang.String accountName) {
        com.ubaya.disprog.EzBookingWebService_Service service = new com.ubaya.disprog.EzBookingWebService_Service();
        com.ubaya.disprog.EzBookingWebService port = service.getEzBookingWebServicePort();
        return port.showReservasiUser(accountName);
    }
}
