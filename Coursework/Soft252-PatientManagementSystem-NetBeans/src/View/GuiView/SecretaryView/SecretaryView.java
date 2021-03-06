/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.GuiView.SecretaryView;

import Model.Users.Secretary;
import View.GuiView.LogInView;

/**
 *
 * @author jonat
 */
public class SecretaryView extends javax.swing.JFrame {
    private Secretary secretary;
    /**
     * Creates new form SecretaryView
     */
    public SecretaryView() {
        initComponents();
    }
    
    public SecretaryView(Secretary secretary) {
        initComponents();
        this.secretary = secretary;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHome = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnApproveAccounts = new javax.swing.JButton();
        btnApproveAppointments = new javax.swing.JButton();
        btnGiveMedicine = new javax.swing.JButton();
        btnRemovePatients = new javax.swing.JButton();
        btnApproveDeletes = new javax.swing.JButton();
        btnStockMedicine = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblHome.setText("Secretary Home Page");

        btnExit.setText("Log out");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnApproveAccounts.setText("Approve Accounts");
        btnApproveAccounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveAccountsActionPerformed(evt);
            }
        });

        btnApproveAppointments.setText("Approve Appointments");
        btnApproveAppointments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveAppointmentsActionPerformed(evt);
            }
        });

        btnGiveMedicine.setText("Give Medicine");
        btnGiveMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiveMedicineActionPerformed(evt);
            }
        });

        btnRemovePatients.setText("Remove Patient");
        btnRemovePatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemovePatientsActionPerformed(evt);
            }
        });

        btnApproveDeletes.setText("Approve Deletes");
        btnApproveDeletes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveDeletesActionPerformed(evt);
            }
        });

        btnStockMedicine.setText("Stock Medicine");
        btnStockMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStockMedicineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHome)
                            .addComponent(btnExit))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 118, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnApproveDeletes, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnApproveAppointments, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnApproveAccounts, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRemovePatients, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGiveMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnStockMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(124, 124, 124))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnApproveAccounts, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnApproveAppointments, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnApproveDeletes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemovePatients, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGiveMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnStockMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.setVisible(false);
        new LogInView().setVisible(true);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnApproveAccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveAccountsActionPerformed
        this.setVisible(false);
        new SecretaryApproveAccount(secretary).setVisible(true);
    }//GEN-LAST:event_btnApproveAccountsActionPerformed

    private void btnApproveDeletesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveDeletesActionPerformed
        this.setVisible(false);
        new SecretaryApproveDelete(secretary).setVisible(true);
    }//GEN-LAST:event_btnApproveDeletesActionPerformed

    private void btnApproveAppointmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveAppointmentsActionPerformed
        this.setVisible(false);
        new SecretaryApproveAppointments(secretary).setVisible(true);
    }//GEN-LAST:event_btnApproveAppointmentsActionPerformed

    private void btnRemovePatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemovePatientsActionPerformed
        this.setVisible(false);
        new SecretaryRemovePatient(secretary).setVisible(true);
    }//GEN-LAST:event_btnRemovePatientsActionPerformed

    private void btnGiveMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiveMedicineActionPerformed
        this.setVisible(false);
        new SecretaryGiveMedicine(secretary).setVisible(true);
    }//GEN-LAST:event_btnGiveMedicineActionPerformed

    private void btnStockMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStockMedicineActionPerformed
        this.setVisible(false);
        new SecretaryAddStock(secretary).setVisible(true);
    }//GEN-LAST:event_btnStockMedicineActionPerformed

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
            java.util.logging.Logger.getLogger(SecretaryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecretaryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecretaryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecretaryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecretaryView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApproveAccounts;
    private javax.swing.JButton btnApproveAppointments;
    private javax.swing.JButton btnApproveDeletes;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGiveMedicine;
    private javax.swing.JButton btnRemovePatients;
    private javax.swing.JButton btnStockMedicine;
    private javax.swing.JLabel lblHome;
    // End of variables declaration//GEN-END:variables
}
