/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FormCustomer;

import FormRegistrasiAccount.FormLogIn;
import javax.swing.JOptionPane;

/**
 *
 * @author RUTH
 */
public class FormReview extends javax.swing.JFrame {

    /**
     * Creates new form FormReview
     */
    public FormReview() {
        initComponents();
        lblStar5.setVisible(true);
        lblStar4.setVisible(false);
        lblStar3.setVisible(false);
        lblStar2.setVisible(false);
        lblStar1.setVisible(false);
        setExtendedState(MAXIMIZED_BOTH);
        jComboBox1.setSelectedIndex(4);
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
        lblLogOut = new java.awt.Label();
        lblStar1 = new javax.swing.JLabel();
        lblStar5 = new javax.swing.JLabel();
        lblStar4 = new javax.swing.JLabel();
        lblStar3 = new javax.swing.JLabel();
        lblStar2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButtonSubmit = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1000, 1000));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(236, 236, 236));

        lblLogOut.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblLogOut.setForeground(new java.awt.Color(255, 0, 0));
        lblLogOut.setText("Log Out");
        lblLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogOutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(2662, Short.MAX_VALUE)
                .addComponent(lblLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 2743, 30);

        lblStar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FormCustomer/star 5.png"))); // NOI18N
        lblStar1.setDisabledIcon(null);
        lblStar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblStar1.setIconTextGap(0);
        getContentPane().add(lblStar1);
        lblStar1.setBounds(60, 220, 670, 125);

        lblStar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FormCustomer/star 1.png"))); // NOI18N
        lblStar5.setLabelFor(lblStar5);
        lblStar5.setDisabledIcon(null);
        lblStar5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblStar5.setIconTextGap(0);
        getContentPane().add(lblStar5);
        lblStar5.setBounds(60, 220, 670, 130);

        lblStar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FormCustomer/star 2.png"))); // NOI18N
        lblStar4.setDisabledIcon(null);
        lblStar4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblStar4.setIconTextGap(0);
        getContentPane().add(lblStar4);
        lblStar4.setBounds(60, 220, 670, 125);

        lblStar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FormCustomer/star 3.png"))); // NOI18N
        lblStar3.setDisabledIcon(null);
        lblStar3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblStar3.setIconTextGap(0);
        getContentPane().add(lblStar3);
        lblStar3.setBounds(60, 220, 670, 125);

        lblStar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FormCustomer/star 4.png"))); // NOI18N
        lblStar2.setDisabledIcon(null);
        lblStar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblStar2.setIconTextGap(0);
        getContentPane().add(lblStar2);
        lblStar2.setBounds(60, 220, 670, 125);

        jComboBox1.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Star", "2 Stars", "3 Stars", "4 Stars", "5 Stars" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(320, 390, 110, 38);

        jLabel2.setBackground(new java.awt.Color(255, 195, 0));
        jLabel2.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("1 Stars : Very Bad");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 190, 800, 20);

        jLabel8.setBackground(new java.awt.Color(255, 195, 0));
        jLabel8.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Please select to give rating !");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(270, 360, 230, 20);

        jLabel10.setBackground(new java.awt.Color(255, 195, 0));
        jLabel10.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("5 Stars : Excellent");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 110, 800, 20);

        jLabel11.setBackground(new java.awt.Color(255, 195, 0));
        jLabel11.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("4 Stars : Very well");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 130, 800, 20);

        jLabel12.setBackground(new java.awt.Color(255, 195, 0));
        jLabel12.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("3 Stars : Good");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, 150, 800, 20);

        jLabel13.setBackground(new java.awt.Color(255, 195, 0));
        jLabel13.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("2 Stars : Poor");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel13);
        jLabel13.setBounds(0, 170, 800, 20);

        jButton1.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jButton1.setText("BACK TO HOME");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 530, 170, 41);

        jButtonSubmit.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jButtonSubmit.setText("SUBMIT");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSubmit);
        jButtonSubmit.setBounds(310, 440, 130, 41);

        jLabel9.setBackground(new java.awt.Color(255, 195, 0));
        jLabel9.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Star Description : ");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 60, 800, 40);

        jLabel7.setBackground(new java.awt.Color(255, 195, 0));
        jLabel7.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("RATING");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 20, 799, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int rating = 0;
    private void lblLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogOutMouseClicked
        this.setVisible(false);
        FormLogIn formLogin = new FormLogIn();
        formLogin.setVisible(true);
    }//GEN-LAST:event_lblLogOutMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        FormHomeCustomer frm = new FormHomeCustomer();
        this.setVisible(false);
        frm.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        Object selectedItem = jComboBox1.getSelectedItem();
        if (selectedItem.equals("1 Star")) {
            rating = 1;
            lblStar1.setVisible(true);
            lblStar4.setVisible(false);
            lblStar3.setVisible(false);
            lblStar2.setVisible(false);
            lblStar5.setVisible(false);
        } else if (selectedItem.equals("2 Stars")) {
            rating = 2;
            lblStar1.setVisible(false);
            lblStar4.setVisible(false);
            lblStar1.setVisible(false);
            lblStar3.setVisible(false);
            lblStar2.setVisible(true);
            lblStar5.setVisible(false);
        } else if (selectedItem.equals("3 Stars")) {
            rating = 3;
            lblStar1.setVisible(false);
            lblStar4.setVisible(false);
            lblStar1.setVisible(false);
            lblStar3.setVisible(true);
            lblStar2.setVisible(false);
            lblStar5.setVisible(false);
        } else if (selectedItem.equals("4 Stars")) {
            rating = 4;
            lblStar1.setVisible(false);
            lblStar4.setVisible(true);
            lblStar1.setVisible(false);
            lblStar3.setVisible(false);
            lblStar2.setVisible(false);
            lblStar5.setVisible(false);
        } else if (selectedItem.equals("5 Stars")) {
            rating = 5;
            lblStar1.setVisible(false);
            lblStar4.setVisible(false);
            lblStar1.setVisible(false);
            lblStar3.setVisible(false);
            lblStar2.setVisible(false);
            lblStar5.setVisible(true);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed

        try {
            boolean status = false;
            status = giveRating(FormHistoryReservation.id_reservasi, rating);
            if (status == true) {
                JOptionPane.showMessageDialog(this, "Berhasil memberi rating, silahkan kembali ke form home user");
                FormHomeCustomer frm = new FormHomeCustomer();
                this.setVisible(false);
                frm.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Gagal memberi rating");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButtonSubmitActionPerformed

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
            java.util.logging.Logger.getLogger(FormReview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormReview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormReview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormReview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormReview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label lblLogOut;
    private javax.swing.JLabel lblStar1;
    private javax.swing.JLabel lblStar2;
    private javax.swing.JLabel lblStar3;
    private javax.swing.JLabel lblStar4;
    private javax.swing.JLabel lblStar5;
    // End of variables declaration//GEN-END:variables

    private static boolean giveRating(int idReservasi, int bintang) {
        com.ubaya.disprog.EzBookingWebService_Service service = new com.ubaya.disprog.EzBookingWebService_Service();
        com.ubaya.disprog.EzBookingWebService port = service.getEzBookingWebServicePort();
        return port.giveRating(idReservasi, bintang);
    }
}
