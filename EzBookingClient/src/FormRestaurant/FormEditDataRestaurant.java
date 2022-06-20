/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FormRestaurant;
import FormRegistrasiAccount.FormLogIn;
import javax.swing.JOptionPane;
import com.ubaya.disprog.Restaurant;
/**
 *
 * @author RUTH
 */
public class FormEditDataRestaurant extends javax.swing.JFrame {
    com.ubaya.disprog.EzBookingWebService_Service service;
    com.ubaya.disprog.EzBookingWebService port;
    /**
     * Creates new form EditRestaurant
     */
    public FormEditDataRestaurant() {
        initComponents();
        Restaurant restaurantt = restaurant(FormLogIn.txtUsername.getText());
        txtName.setText(restaurantt.getNamaPemilik());
        txtRestaurantName.setText(restaurantt.getNamaRestaurant());
        txtAddress.setText(restaurantt.getAlamatRestaurant());
        txtMaxTable.setText(String.valueOf(restaurantt.getMaxTable()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    public boolean updateDataRestaurant(String ownerName, String namaResto, String alamatResto, int maxTable, int idResto) {
        service = new com.ubaya.disprog.EzBookingWebService_Service();
        port = service.getEzBookingWebServicePort();
        return port.updateDataRestaurant(ownerName, namaResto, alamatResto, maxTable, idResto);
    }
    public int idRestaurant(String username){
        service = new com.ubaya.disprog.EzBookingWebService_Service();
        port = service.getEzBookingWebServicePort();
        return port.getIdRestaurant(username);
    }
    
    public Restaurant restaurant(String username){
        service = new com.ubaya.disprog.EzBookingWebService_Service();
        port = service.getEzBookingWebServicePort();
        return port.showListDataRestaurant(username);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMaxTable = new javax.swing.JLabel();
        txtMaxTable = new javax.swing.JTextField();
        lblEditRestaurant = new javax.swing.JLabel();
        lblYourName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblRestaurantName = new javax.swing.JLabel();
        txtRestaurantName = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edit Restaurant");

        lblMaxTable.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        lblMaxTable.setText("Max Table:");

        txtMaxTable.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtMaxTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 195, 0)));

        lblEditRestaurant.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        lblEditRestaurant.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEditRestaurant.setText("EDIT RESTAURANT");
        lblEditRestaurant.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblYourName.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        lblYourName.setText("Your Name: ");

        txtName.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 195, 0)));

        lblRestaurantName.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        lblRestaurantName.setText("Restaurant Name: ");

        txtRestaurantName.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtRestaurantName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 195, 0)));

        btnConfirm.setBackground(new java.awt.Color(255, 195, 0));
        btnConfirm.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        btnConfirm.setText("CONFIRM");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        lblAddress.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        lblAddress.setText("Address: ");

        txtAddress.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 195, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblYourName)
                    .addComponent(lblRestaurantName)
                    .addComponent(txtRestaurantName, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                    .addComponent(lblAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                    .addComponent(lblMaxTable)
                    .addComponent(txtMaxTable, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                    .addComponent(btnConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtName))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lblEditRestaurant, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblEditRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblYourName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblRestaurantName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblAddress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblMaxTable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaxTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        String namaPemilik = txtName.getText();
        String namaRestaurant = txtRestaurantName.getText();
        String alamatRestaurant = txtAddress.getText();
        String usernameRestaurant = FormLogIn.txtUsername.getText();
        int jumlahTable = Integer.parseInt(txtMaxTable.getText());
        int idResto = idRestaurant(usernameRestaurant);
        
        boolean hasil = this.updateDataRestaurant(namaPemilik, namaRestaurant, alamatRestaurant, jumlahTable, idResto);
        if(hasil == true){
            JOptionPane.showMessageDialog(this, "Successful Update Data Restaurant!");
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

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
            java.util.logging.Logger.getLogger(FormEditDataRestaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEditDataRestaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEditDataRestaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEditDataRestaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormEditDataRestaurant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirm;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblEditRestaurant;
    private javax.swing.JLabel lblMaxTable;
    private javax.swing.JLabel lblRestaurantName;
    private javax.swing.JLabel lblYourName;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtMaxTable;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRestaurantName;
    // End of variables declaration//GEN-END:variables
}
