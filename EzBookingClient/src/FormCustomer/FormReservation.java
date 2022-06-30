/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FormCustomer;

import FormRegistrasiAccount.FormLogIn;
import static FormRegistrasiAccount.FormLogIn.username;
import com.ubaya.disprog.Restaurant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RUTH
 */
public class FormReservation extends javax.swing.JFrame {

    /**
     * Creates new form Reservation
     */
    public static String namaResto;
    public static int id_resto;

    public FormReservation() {
        initComponents();
        txtReservant.setText(FormLogIn.GlobalUsername);
        txtReservant.enable(false);
        try {
            ArrayList<Restaurant> collections = (ArrayList<Restaurant>) showListRestaurant("none", "none");
            Date currentTime = Calendar.getInstance().getTime();
            String waktu = currentTime.toString();
            DefaultTableModel model = (DefaultTableModel) tableRestaurantList.getModel();
            for (int i = 0; i < collections.size(); i++) {
                Restaurant resto = collections.get(i);
                model.addRow(new Object[]{resto.getNamaRestaurant(), resto.getMaxTable(), jumlahKetersediaanMeja(resto.getId(), waktu), resto.getTotalBintang()});
            }
        } catch (Exception e) {
            System.out.println("Error pada form load, pesan: " + e.getMessage());
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
        lblReservant = new javax.swing.JLabel();
        txtReservant = new javax.swing.JTextField();
        lblDate = new javax.swing.JLabel();
        jdateTanggal = new com.toedter.calendar.JDateChooser();
        lblTable = new javax.swing.JLabel();
        jTotalTable = new javax.swing.JSpinner();
        lblPeople = new javax.swing.JLabel();
        tNumberPeople = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRestaurantList = new javax.swing.JTable();
        btnBook = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        btnBook1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reservation");

        lblReservation.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        lblReservation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReservation.setText("RESERVATION");
        lblReservation.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblReservant.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        lblReservant.setText("Reservant:");

        txtReservant.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtReservant.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 195, 0)));
        txtReservant.setEnabled(false);

        lblDate.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        lblDate.setText("Reservation Date:");

        jdateTanggal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 195, 0)));
        jdateTanggal.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jdateTanggal.setName("jdateTanggal"); // NOI18N
        jdateTanggal.setPreferredSize(new java.awt.Dimension(3, 26));
        jdateTanggal.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdateTanggalPropertyChange(evt);
            }
        });

        lblTable.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        lblTable.setText("Total Table:");

        jTotalTable.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jTotalTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 195, 0)));
        jTotalTable.setPreferredSize(new java.awt.Dimension(3, 26));

        lblPeople.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        lblPeople.setText("Number of People:");

        tNumberPeople.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        tNumberPeople.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 195, 0)));
        tNumberPeople.setPreferredSize(new java.awt.Dimension(3, 26));

        tableRestaurantList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 195, 0)));
        tableRestaurantList.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        tableRestaurantList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Restaurant Name", "Number of Table", "Available Table", "Rating"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableRestaurantList.setToolTipText("");
        tableRestaurantList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableRestaurantList.setInheritsPopupMenu(true);
        jScrollPane1.setViewportView(tableRestaurantList);

        btnBook.setBackground(new java.awt.Color(255, 195, 0));
        btnBook.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        btnBook.setText("BOOK NOW");
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Restaurant List");

        jButtonBack.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jButtonBack.setText("Back to home");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        btnBook1.setBackground(new java.awt.Color(255, 195, 0));
        btnBook1.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        btnBook1.setText("CHECK MENU");
        btnBook1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBook1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtReservant)
                    .addComponent(lblReservant)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDate)
                            .addComponent(jdateTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTotalTable, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTable))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPeople)
                            .addComponent(tNumberPeople, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBook, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBook1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addContainerGap(38, Short.MAX_VALUE))
            .addComponent(lblReservation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblReservant)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtReservant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDate)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTable)
                                .addComponent(lblPeople)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTotalTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tNumberPeople, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jdateTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBook1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        try {
            if (tableRestaurantList.getSelectionModel().isSelectionEmpty()) {
                JOptionPane.showMessageDialog(this, "Please select the restaurant you want to reserve!");
            } else {
                Date currentTime = Calendar.getInstance().getTime();
                String reservant = txtReservant.getText();
                java.sql.Date waktu = new java.sql.Date(jdateTanggal.getDate().getTime());
                if (waktu.before(currentTime)) {
                    JOptionPane.showMessageDialog(this, "You cannot reserve the past date!");
                } else {
                    String time = String.valueOf(waktu);
                    int totalTable = (int) jTotalTable.getValue();
                    int people = (int) tNumberPeople.getValue();
                    int row = tableRestaurantList.getSelectedRow();
                    String namaResto = (String) tableRestaurantList.getValueAt(row, 0);
                    int resto_id = ambilId(namaResto);
                    int availTable = (int) tableRestaurantList.getValueAt(row, 2);
                    if (totalTable <= 0 || people <= 0) {
                        JOptionPane.showMessageDialog(this, "Please input the right number for the reservation, don't input a negative or 0 number");
                    } else {
                        if (totalTable > people) {
                            JOptionPane.showMessageDialog(this, "Please input the number of people not less than total table");
                        } else {
                            if (availTable < totalTable) {
                                JOptionPane.showMessageDialog(this, "Error, restaurant don't have that much of available table");
                            } else {
                                boolean helper = insertDataReservasi(time, totalTable, people, "On Process", 5, resto_id, reservant);
                                if (helper) {
                                    JOptionPane.showMessageDialog(this, "Reservation succesful, now please wait for the restaurant to accept your reservation order.");
                                    FormHomeCustomer frm = new FormHomeCustomer();
                                    this.setVisible(false);
                                    frm.setVisible(true);
                                } else {
                                    JOptionPane.showMessageDialog(this, "Reservation failed, please re check your order");
                                }
                            }
                        }

                    }
                }

            }

        } catch (Exception e) {
            System.out.println("Error pada button, pesan error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnBookActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        // TODO add your handling code here:
        FormHomeCustomer frm = new FormHomeCustomer();
        this.setVisible(false);
        frm.setVisible(true);
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jdateTanggalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdateTanggalPropertyChange
        try {
            ArrayList<Restaurant> collections = (ArrayList<Restaurant>) showListRestaurant("none", "none");
            DefaultTableModel model = (DefaultTableModel) tableRestaurantList.getModel();
            model.setRowCount(0);
            java.sql.Date waktu = new java.sql.Date(jdateTanggal.getDate().getTime());
            String time = String.valueOf(waktu);
            for (int i = 0; i < collections.size(); i++) {
                Restaurant resto = collections.get(i);
                model.addRow(new Object[]{resto.getNamaRestaurant(), resto.getMaxTable(), jumlahKetersediaanMeja(resto.getId(), time), resto.getTotalBintang()});
            }
        } catch (Exception e) {
            System.out.println("Error pada jdatetanggal, pesan: " + e.getMessage());
        }
    }//GEN-LAST:event_jdateTanggalPropertyChange

    private void btnBook1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBook1ActionPerformed
        // TODO add your handling code here:
        try {
            if (tableRestaurantList.getSelectionModel().isSelectionEmpty()) {
                JOptionPane.showMessageDialog(this, "Please select the restaurant you want to reserve!");
            } else {
                int row = tableRestaurantList.getSelectedRow();
                namaResto = (String) tableRestaurantList.getValueAt(row, 0);
                id_resto= ambilId(namaResto);
                FormOrderMenu frm = new FormOrderMenu();
                this.setVisible(false);
                frm.setVisible(true);
            }
        } catch (Exception e) {
            System.out.println("Error pada penambahan menu, pesan: " + e.getMessage());
        }
    }//GEN-LAST:event_btnBook1ActionPerformed

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
            java.util.logging.Logger.getLogger(FormReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormReservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnBook1;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jTotalTable;
    private com.toedter.calendar.JDateChooser jdateTanggal;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblPeople;
    private javax.swing.JLabel lblReservant;
    private javax.swing.JLabel lblReservation;
    private javax.swing.JLabel lblTable;
    private javax.swing.JSpinner tNumberPeople;
    private javax.swing.JTable tableRestaurantList;
    private javax.swing.JTextField txtReservant;
    // End of variables declaration//GEN-END:variables

    private static java.util.List<java.lang.String> showListIdRestaurant() {
        com.ubaya.disprog.ReservationWebService_Service service = new com.ubaya.disprog.ReservationWebService_Service();
        com.ubaya.disprog.ReservationWebService port = service.getReservationWebServicePort();
        return port.showListIdRestaurant();
    }

    private static int jumlahKetersediaanMeja(int idRestaurant, String tglPesanan) {
        com.ubaya.disprog.ReservationWebService_Service service = new com.ubaya.disprog.ReservationWebService_Service();
        com.ubaya.disprog.ReservationWebService port = service.getReservationWebServicePort();
        return port.jumlahKetersediaanMeja(idRestaurant, tglPesanan);
    }

    private static java.util.List<com.ubaya.disprog.Restaurant> showListRestaurant(java.lang.String filter, java.lang.String value) {
        com.ubaya.disprog.ReservationWebService_Service service = new com.ubaya.disprog.ReservationWebService_Service();
        com.ubaya.disprog.ReservationWebService port = service.getReservationWebServicePort();
        return port.showListRestaurant(filter, value);
    }

    private static boolean insertDataReservasi(java.lang.String tanggalPemesanan, int jumlahMeja, int jumlahOrang, java.lang.String status, int penilaianBintang, int restaurantId, java.lang.String accountUsername) {
        com.ubaya.disprog.ReservationWebService_Service service = new com.ubaya.disprog.ReservationWebService_Service();
        com.ubaya.disprog.ReservationWebService port = service.getReservationWebServicePort();
        return port.insertDataReservasi(tanggalPemesanan, jumlahMeja, jumlahOrang, status, penilaianBintang, restaurantId, accountUsername);
    }

    private static int ambilId(java.lang.String username) {
        com.ubaya.disprog.ReservationWebService_Service service = new com.ubaya.disprog.ReservationWebService_Service();
        com.ubaya.disprog.ReservationWebService port = service.getReservationWebServicePort();
        return port.ambilId(username);
    }
}
