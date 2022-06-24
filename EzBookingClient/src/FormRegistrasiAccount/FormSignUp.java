/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FormRegistrasiAccount;

import FormRestaurant.FormInputDataRestaurant;
import com.ubaya.disprog.Account;
import javax.swing.JOptionPane;

/**
 *
 * @author ardel
 */
public class FormSignUp extends javax.swing.JFrame {

    /**
     * Creates new form FormSignUp
     */
    public FormSignUp() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        txtRePassword = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        cboRole = new javax.swing.JComboBox<>();
        btnSignUp = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();
        btnSignUp1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        jLabel6.setText("Sign Up");

        jLabel7.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel7.setText("Email:");

        txtEmail.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtEmail.setName(""); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel3.setText("Username:");

        txtUsername.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel5.setText("Password:");

        jLabel9.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel9.setText("Retype Password:");

        jLabel8.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel8.setText("Role:");

        cboRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pelanggan", "Partner Restaurant", "Administrator" }));

        btnSignUp.setBackground(new java.awt.Color(255, 195, 0));
        btnSignUp.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        btnSignUp.setText("Sign Up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        btnSignUp1.setBackground(new java.awt.Color(255, 195, 0));
        btnSignUp1.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        btnSignUp1.setText("Back to login");
        btnSignUp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUp1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(92, 92, 92))
                        .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cboRole, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtRePassword, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSignUp1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboRole)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSignUp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSignUp1)
                .addGap(84, 84, 84))
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblImage)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        String newUsername = txtUsername.getText();
        String newMail = txtEmail.getText();
        String newPassword = String.valueOf(txtPassword.getPassword());
        String newRetypepassword = String.valueOf(txtRePassword.getPassword());
        String role = (String) cboRole.getSelectedItem();

        try {
            if (!newPassword.equals(newRetypepassword)) {
                JOptionPane.showMessageDialog(this, "Registration failed, password and your re type password doesn't match.");
            } else {
                if (newUsername.isEmpty() || newMail.isEmpty() || newPassword.isEmpty() || newRetypepassword.isEmpty() || role.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Registration failed, please input the require data in the text box");
                } else {
                    if(checkUsername(newUsername)){
                        registrasiAccount(newUsername, newMail, newPassword, role);
                        if (role.equals("Partner")) {
                            JOptionPane.showMessageDialog(this, "Registration account success, now please fill in the details of the restaurant.");
                            this.setVisible(false);
                            new FormInputDataRestaurant().setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(this, "Registration success, now please log in with the new account you just created.");
                            this.setVisible(false);
                            FormLogIn formLogin = new FormLogIn();
                            formLogin.setVisible(true);
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Username already, please change username");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error pada register, pesan error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void btnSignUp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUp1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        FormLogIn formLogin = new FormLogIn();
        formLogin.setVisible(true);
    }//GEN-LAST:event_btnSignUp1ActionPerformed

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
            java.util.logging.Logger.getLogger(FormSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignUp;
    private javax.swing.JButton btnSignUp1;
    private javax.swing.JComboBox<String> cboRole;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblImage;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtRePassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private static boolean registrasiAccount(java.lang.String username, java.lang.String email, java.lang.String password, java.lang.String role) {
        com.ubaya.disprog.EzBookingWebService_Service service = new com.ubaya.disprog.EzBookingWebService_Service();
        com.ubaya.disprog.EzBookingWebService port = service.getEzBookingWebServicePort();
        return port.registrasiAccount(username, email, password, role);
    }

    private static boolean checkUsername(java.lang.String username) {
        com.ubaya.disprog.EzBookingWebService_Service service = new com.ubaya.disprog.EzBookingWebService_Service();
        com.ubaya.disprog.EzBookingWebService port = service.getEzBookingWebServicePort();
        return port.checkUsername(username);
    }
}
