/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FormAdmin;

/**
 *
 * @author asus
 */
public class FormHomeAdmin extends javax.swing.JFrame {
    public String usernameAccount;
    com.ubaya.disprog.EzBookingWebService_Service service;
    com.ubaya.disprog.EzBookingWebService port;
    /**
     * Creates new form homeAdminForm
     */
    public FormHomeAdmin() {
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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel2 = new javax.swing.JLabel();
        btnCreateReport = new javax.swing.JButton();
        btnReportHistory = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

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

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setBackground(new java.awt.Color(255, 195, 0));
        jLabel2.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("EZBOOKING");

        btnCreateReport.setBackground(new java.awt.Color(255, 195, 0));
        btnCreateReport.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        btnCreateReport.setIcon(new javax.swing.ImageIcon("F:\\Ubaya\\Materi\\1604C044 Distributed Programming KP B\\github\\Project-Disprog\\EzBookingClient\\src\\FormAdmin\\report (1).png")); // NOI18N
        btnCreateReport.setText("Create Report");
        btnCreateReport.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 24, 24), 2));
        btnCreateReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateReportActionPerformed(evt);
            }
        });

        btnReportHistory.setBackground(new java.awt.Color(255, 195, 0));
        btnReportHistory.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        btnReportHistory.setIcon(new javax.swing.ImageIcon("F:\\Ubaya\\Materi\\1604C044 Distributed Programming KP B\\github\\Project-Disprog\\EzBookingClient\\src\\FormAdmin\\history (1).png")); // NOI18N
        btnReportHistory.setText("Report History");
        btnReportHistory.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 24, 24), 2));
        btnReportHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportHistoryActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(255, 195, 0));
        jComboBox1.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Restaurant", "Number of Table", "Total Customers", "Rating" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 24, 24)));

        jTextField1.setBackground(new java.awt.Color(255, 195, 0));
        jTextField1.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jTextField1.setText("jTextField1");

        jButton1.setBackground(new java.awt.Color(255, 195, 0));
        jButton1.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jButton1.setText("Ascending");

        jButton2.setBackground(new java.awt.Color(255, 195, 0));
        jButton2.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jButton2.setText("Descending");

        jTable2.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Restaurant", "Alamat", "Number of Table", "Total Customers", "Rating"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class
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
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, 0, 214, Short.MAX_VALUE)
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(176, 176, 176))
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCreateReport, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReportHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateReport, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReportHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateReportActionPerformed
        FormCreateReport formCreateReport = new FormCreateReport();
        formCreateReport.setVisible(true);
    }//GEN-LAST:event_btnCreateReportActionPerformed

    private void btnReportHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportHistoryActionPerformed
        FormShowReportHistory formShowReportHistory = new FormShowReportHistory();
        formShowReportHistory.setVisible(true);
                
    }//GEN-LAST:event_btnReportHistoryActionPerformed

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
            java.util.logging.Logger.getLogger(FormHomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormHomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormHomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormHomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormHomeAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateReport;
    private javax.swing.JButton btnReportHistory;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
