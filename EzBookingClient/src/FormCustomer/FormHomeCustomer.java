/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FormCustomer;

/**
 *
 * @author asus
 */
public class FormHomeCustomer extends javax.swing.JFrame {

    /**
     * Creates new form HomeAdminForm
     */
    public FormHomeCustomer() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnAvailableRestaurant = new javax.swing.JButton();
        btnReserveRestaurant = new javax.swing.JButton();
        btnHistoryReservation = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 195, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(236, 236, 236));

        jLabel2.setBackground(new java.awt.Color(255, 195, 0));
        jLabel2.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("EZBOOKING");

        btnAvailableRestaurant.setBackground(new java.awt.Color(255, 195, 0));
        btnAvailableRestaurant.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        btnAvailableRestaurant.setIcon(new javax.swing.ImageIcon("F:\\Ubaya\\Materi\\1604C044 Distributed Programming KP B\\github\\Project-Disprog\\EzBookingClient\\src\\FormCustomer\\restaurant (3).png")); // NOI18N
        btnAvailableRestaurant.setText("Available Restaurant");
        btnAvailableRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvailableRestaurantActionPerformed(evt);
            }
        });

        btnReserveRestaurant.setBackground(new java.awt.Color(255, 195, 0));
        btnReserveRestaurant.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        btnReserveRestaurant.setIcon(new javax.swing.ImageIcon("F:\\Ubaya\\Materi\\1604C044 Distributed Programming KP B\\github\\Project-Disprog\\EzBookingClient\\src\\FormCustomer\\scroll (2).png")); // NOI18N
        btnReserveRestaurant.setText("Reserve Restaurant");
        btnReserveRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReserveRestaurantActionPerformed(evt);
            }
        });

        btnHistoryReservation.setBackground(new java.awt.Color(255, 195, 0));
        btnHistoryReservation.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        btnHistoryReservation.setIcon(new javax.swing.ImageIcon("F:\\Ubaya\\Materi\\1604C044 Distributed Programming KP B\\github\\Project-Disprog\\EzBookingClient\\src\\FormCustomer\\history (2).png")); // NOI18N
        btnHistoryReservation.setText("History Reservation");
        btnHistoryReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoryReservationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnHistoryReservation)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAvailableRestaurant)
                        .addComponent(btnReserveRestaurant)))
                .addGap(230, 230, 230))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReserveRestaurant)
                .addGap(18, 18, 18)
                .addComponent(btnAvailableRestaurant)
                .addGap(18, 18, 18)
                .addComponent(btnHistoryReservation)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReserveRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReserveRestaurantActionPerformed
        FormReservation formReservation = new FormReservation();
        formReservation.setVisible(true);
    }//GEN-LAST:event_btnReserveRestaurantActionPerformed

    private void btnAvailableRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvailableRestaurantActionPerformed
        FormAvailableRestaurant formAvailableRestaurant = new FormAvailableRestaurant();
        formAvailableRestaurant.setVisible(true);       
    }//GEN-LAST:event_btnAvailableRestaurantActionPerformed

    private void btnHistoryReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoryReservationActionPerformed
        FormHistoryReservation formHistoryReservation = new FormHistoryReservation();
        formHistoryReservation.setVisible(true);
    }//GEN-LAST:event_btnHistoryReservationActionPerformed

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
            java.util.logging.Logger.getLogger(FormHomeCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormHomeCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormHomeCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormHomeCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormHomeCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvailableRestaurant;
    private javax.swing.JButton btnHistoryReservation;
    private javax.swing.JButton btnReserveRestaurant;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}