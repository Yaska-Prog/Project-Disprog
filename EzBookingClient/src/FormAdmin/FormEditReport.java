/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FormAdmin;

import FormRegistrasiAccount.FormLogIn;
import com.ubaya.disprog.Report;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ardel
 */
public class FormEditReport extends javax.swing.JFrame {

    /**
     * Creates new form FormEditReport
     */
    com.ubaya.disprog.AdminWebService_Service service;
    com.ubaya.disprog.AdminWebService port;

    public FormEditReport() {
        initComponents();

        service = new com.ubaya.disprog.AdminWebService_Service();
        port = service.getAdminWebServicePort();

        List<Report> report = new ArrayList<Report>();
        report = port.listYangSudahDireport(FormLogIn.txtUsername.getText());
        for (int i = 0; i < report.size(); ++i) {
            cboEditRestoId.addItem(String.valueOf(report.get(i).getIdRestaurant()));
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

        btnBack = new javax.swing.JButton();
        lblReport = new javax.swing.JLabel();
        lblQuality1 = new javax.swing.JLabel();
        cboEditRestoId = new javax.swing.JComboBox<>();
        lblQuality = new javax.swing.JLabel();
        spinEditQualityOfService = new javax.swing.JSpinner();
        lblFood = new javax.swing.JLabel();
        spinEditFoodQuality = new javax.swing.JSpinner();
        lblReview = new javax.swing.JLabel();
        txtEditReview = new javax.swing.JTextField();
        btnEditConfirm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblReport.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        lblReport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReport.setText("EDIT REPORT");
        lblReport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblQuality1.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        lblQuality1.setText("Restaurant Id");

        cboEditRestoId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEditRestoIdActionPerformed(evt);
            }
        });

        lblQuality.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        lblQuality.setText("Quality of Service:");

        lblFood.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        lblFood.setText("Food Quality:");

        lblReview.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        lblReview.setText("Review:");

        txtEditReview.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtEditReview.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 195, 0)));

        btnEditConfirm.setBackground(new java.awt.Color(255, 195, 0));
        btnEditConfirm.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        btnEditConfirm.setText("CONFIRM");
        btnEditConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEditReview)
                            .addComponent(lblReport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblReview)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(65, 65, 65))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQuality1)
                            .addComponent(cboEditRestoId, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQuality)
                            .addComponent(spinEditQualityOfService, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFood)
                            .addComponent(spinEditFoodQuality, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblReport, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblQuality1)
                        .addGap(9, 9, 9)
                        .addComponent(cboEditRestoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQuality)
                            .addComponent(lblFood))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spinEditQualityOfService)
                            .addComponent(spinEditFoodQuality))))
                .addGap(22, 22, 22)
                .addComponent(lblReview)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEditReview, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditConfirm)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        FormHomeAdmin frm = new FormHomeAdmin();
        frm.setEnabled(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnEditConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditConfirmActionPerformed
        Double qualityService = Double.parseDouble(spinEditQualityOfService.getValue().toString());
        Double foodQuality = Double.parseDouble(spinEditFoodQuality.getValue().toString());
        String review = txtEditReview.getText();
        int idRestaurant = Integer.valueOf((String) cboEditRestoId.getSelectedItem());
        String usernameAccount = FormLogIn.txtUsername.getText();

        if (qualityService > 5.0 || foodQuality > 5.0) {
            JOptionPane.showMessageDialog(this, "Quality of service atau food quality tidak boleh lebih dari 5");
        } else {
            service = new com.ubaya.disprog.AdminWebService_Service();
            port = service.getAdminWebServicePort();
            boolean resultSave = true;//port.updateReport(usernameAccount, idRestaurant, qualityService, foodQuality, review);
            if (resultSave == true) {
                JOptionPane.showMessageDialog(this, "Successful!");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Failed!");
            }
        }
    }//GEN-LAST:event_btnEditConfirmActionPerformed

    private void cboEditRestoIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEditRestoIdActionPerformed
        service = new com.ubaya.disprog.AdminWebService_Service();
        port = service.getAdminWebServicePort();

        List<Report> report = new ArrayList<Report>();
        report = port.listYangSudahDireport(FormLogIn.txtUsername.getText());
        int idSel = Integer.parseInt(cboEditRestoId.getSelectedItem().toString());
        for (int i = 0; i < report.size(); ++i) {
            if (report.get(i).getIdRestaurant() == idSel) {
                spinEditFoodQuality.setValue(report.get(i).getFoodQuality());
                spinEditQualityOfService.setValue(report.get(i).getQualityOfService());
                txtEditReview.setText(report.get(i).getReview());
            }
        }
    }//GEN-LAST:event_cboEditRestoIdActionPerformed

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
            java.util.logging.Logger.getLogger(FormEditReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEditReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEditReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEditReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormEditReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEditConfirm;
    private javax.swing.JComboBox<String> cboEditRestoId;
    private javax.swing.JLabel lblFood;
    private javax.swing.JLabel lblQuality;
    private javax.swing.JLabel lblQuality1;
    private javax.swing.JLabel lblReport;
    private javax.swing.JLabel lblReview;
    private javax.swing.JSpinner spinEditFoodQuality;
    private javax.swing.JSpinner spinEditQualityOfService;
    private javax.swing.JTextField txtEditReview;
    // End of variables declaration//GEN-END:variables
}
