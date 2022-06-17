/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FormAdmin;

import com.ubaya.disprog.Report;
import com.ubaya.disprog.Restaurant;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asus
 */
public class FormShowReportHistory extends javax.swing.JFrame {

    com.ubaya.disprog.EzBookingWebService_Service service;
    com.ubaya.disprog.EzBookingWebService port;

    /**
     * Creates new form reportHistoryForm
     */
    public FormShowReportHistory() {
        initComponents();
        try {
            
            List<Report> collections = new ArrayList<>();
            com.ubaya.disprog.EzBookingWebService_Service service = new com.ubaya.disprog.EzBookingWebService_Service();
            com.ubaya.disprog.EzBookingWebService port = service.getEzBookingWebServicePort();
            collections = port.showReport(0, "none");
            DefaultTableModel model = (DefaultTableModel) tableReport.getModel();
            model.setRowCount(0);
            for (int i = 0; i < collections.size(); i++) {
                Report report = collections.get(i);
                System.out.println("coba" + report.getAccountUsername());
                model.addRow(new Object[]{report.getAccountUsername(), report.getIdRestaurant(), report.getQualityOfService(), report.getFoodQuality(), report.getReview()});
            }
        } catch (Exception e) {
            System.out.println("Error, pesan: " + e.getMessage());
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

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableReport = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setBackground(new java.awt.Color(255, 195, 0));
        jLabel2.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("EZBOOKING");

        tableReport.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        tableReport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Account Username", "Id Restaurant", "Quality Of Service ", "Food Quality", "Review"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableReport);
        if (tableReport.getColumnModel().getColumnCount() > 0) {
            tableReport.getColumnModel().getColumn(0).setResizable(false);
            tableReport.getColumnModel().getColumn(1).setResizable(false);
            tableReport.getColumnModel().getColumn(2).setResizable(false);
            tableReport.getColumnModel().getColumn(3).setResizable(false);
            tableReport.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(228, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(435, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormShowReportHistory().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableReport;
    // End of variables declaration//GEN-END:variables

}
