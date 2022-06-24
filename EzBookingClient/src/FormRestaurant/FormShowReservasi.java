/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FormRestaurant;

import FormRegistrasiAccount.FormLogIn;
import com.ubaya.disprog.Report;
import com.ubaya.disprog.Reservasi;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author asus
 */
public class FormShowReservasi extends javax.swing.JFrame {

    com.ubaya.disprog.EzBookingWebService_Service service;
    com.ubaya.disprog.EzBookingWebService port;

    private static JButton btnAccept = new JButton();
    private static JButton btnDecline = new JButton();
    private static JButton btnArrived = new JButton();
    
    Reservasi reservasi = new Reservasi();

    /**
     * Creates new form form
     */
    public FormShowReservasi() {
        initComponents();
        service = new com.ubaya.disprog.EzBookingWebService_Service();
        port = service.getEzBookingWebServicePort();
        String usernameRestaurant = FormLogIn.txtUsername.getText();
        int idResto = idRestaurant(usernameRestaurant);
        List<Reservasi> res = new ArrayList<>();
        res = port.showReservasi(idResto);

        DefaultTableModel model = (DefaultTableModel) tableReservation.getModel();
        for (int i = 0; i < res.size(); i++) {
            reservasi = res.get(i);
            model.addRow(new Object[]{reservasi.getAccountUsername(), reservasi.getTanggalPesanan(), reservasi.getJumlahMeja(), reservasi.getJumlahOrang()});
            btnArrived.setEnabled(false);
            btnAccept.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    boolean hasil = true;
                    hasil = port.updateStatusReservasi("Confirm", reservasi.getId());
                    JOptionPane.showMessageDialog(null, "Success Confirm this reservation");
                    if (tableReservation.isCellSelected(tableReservation.getSelectedRow(), tableReservation.getSelectedColumn())) {
                        btnAccept.setEnabled(false);
                        btnArrived.setEnabled(true);
                    }

                }
            });

            btnDecline.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    boolean hasil;
                    hasil = port.updateStatusReservasi("Canceled", reservasi.getId());
                    JOptionPane.showMessageDialog(null, "Success Canceled this reservation");
                    btnAccept.setEnabled(false);
                }
            });

            btnArrived.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    boolean hasil;
                    hasil = port.updateStatusReservasi("Arrived", reservasi.getId());
                    JOptionPane.showMessageDialog(null, "Customers has been Arrived");
                    btnDecline.setEnabled(false);
                    btnArrived.setEnabled(false);
                }
            });
        }
        tableReservation.getColumn("Accept").setCellRenderer(new ButtonRendererAccept());
        tableReservation.getColumn("Accept").setCellEditor(new ButtonEditorAccept(new JCheckBox()));

        tableReservation.getColumn("Decline").setCellRenderer(new ButtonRendererDecline());
        tableReservation.getColumn("Decline").setCellEditor(new ButtonEditorDecline(new JCheckBox()));

        tableReservation.getColumn("Arrived").setCellRenderer(new ButtonRendererArrived());
        tableReservation.getColumn("Arrived").setCellEditor(new ButtonEditorArrived(new JCheckBox()));

    }

    public int idRestaurant(String username) {
        service = new com.ubaya.disprog.EzBookingWebService_Service();
        port = service.getEzBookingWebServicePort();
        return port.getIdRestaurant(username);
    }

    // BUTTON ACCEPT
    class ButtonRendererAccept extends JButton implements TableCellRenderer {

        public ButtonRendererAccept() {
            setOpaque(true);
        }

        public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
            setText((value == null) ? "Accept" : value.toString());
            return this;
        }
    }

    class ButtonEditorAccept extends DefaultCellEditor {

        private String label;

        public ButtonEditorAccept(JCheckBox checkBox) {
            super(checkBox);
        }

        public Component getTableCellEditorComponent(JTable table, Object value,
                boolean isSelected, int row, int column) {
            label = (value == null) ? "Accept" : value.toString();
            btnAccept.setText(label);
            return btnAccept;
        }

        public Object getCellEditorValue() {
            return new String(label);
        }
    }

    //BUTTON ARRIVED
    class ButtonRendererArrived extends JButton implements TableCellRenderer {

        public ButtonRendererArrived() {
            setOpaque(true);
        }

        public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
            setText((value == null) ? "Arrived" : value.toString());
            return this;
        }
    }

    class ButtonEditorArrived extends DefaultCellEditor {

        private String label;

        public ButtonEditorArrived(JCheckBox checkBox) {
            super(checkBox);
        }

        public Component getTableCellEditorComponent(JTable table, Object value,
                boolean isSelected, int row, int column) {
            label = (value == null) ? "Arrived" : value.toString();
            btnArrived.setText(label);
            return btnArrived;
        }

        public Object getCellEditorValue() {
            return new String(label);
        }
    }

    // BUTTON DECLINE
    class ButtonRendererDecline extends JButton implements TableCellRenderer {

        public ButtonRendererDecline() {
            setOpaque(true);
        }

        public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
            setText((value == null) ? "Decline" : value.toString());
            return this;
        }
    }

    class ButtonEditorDecline extends DefaultCellEditor {

        private String label;

        public ButtonEditorDecline(JCheckBox checkBox) {
            super(checkBox);
        }

        public Component getTableCellEditorComponent(JTable table, Object value,
                boolean isSelected, int row, int column) {
            label = (value == null) ? "Decline" : value.toString();
            btnDecline.setText(label);
            return btnDecline;
        }

        public Object getCellEditorValue() {
            return new String(label);
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

        lblReview = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableReservation = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblReview.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        lblReview.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReview.setText("TABLE RESERVATION");
        lblReview.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RESTAURANT RESERVATION");

        tableReservation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 195, 0)));
        tableReservation.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        tableReservation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reservant Name", "Reservation Date", "Total Table", "Number of People", "Accept", "Decline", "Arrived"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableReservation);
        if (tableReservation.getColumnModel().getColumnCount() > 0) {
            tableReservation.getColumnModel().getColumn(0).setResizable(false);
            tableReservation.getColumnModel().getColumn(1).setResizable(false);
            tableReservation.getColumnModel().getColumn(2).setResizable(false);
            tableReservation.getColumnModel().getColumn(3).setResizable(false);
            tableReservation.getColumnModel().getColumn(5).setResizable(false);
            tableReservation.getColumnModel().getColumn(6).setResizable(false);
        }

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(lblReview, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(4, 4, 4)
                .addComponent(lblReview, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        FormHomeRestaurant frm = new FormHomeRestaurant();
        frm.setEnabled(true);
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(FormShowReservasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormShowReservasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormShowReservasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormShowReservasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormShowReservasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblReview;
    private javax.swing.JTable tableReservation;
    // End of variables declaration//GEN-END:variables
}
