/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.GuiView;

import Controller.Medicines.MedicinesController;
import Model.Medicines.Medicine;
import Model.Medicines.MedicineList;
import Model.Users.HospitalPeople;
import Model.Users.Secretary;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author jonat
 */
public class SecretaryGiveMedicine extends javax.swing.JFrame {
    private Secretary secretary;
    /**
     * Creates new form SecretaryGiveMedicine
     */
    public SecretaryGiveMedicine() {
        initComponents();
        fillList();
    }
    
    public SecretaryGiveMedicine(Secretary secretary){
        initComponents();
        this.secretary = secretary;
        fillList();
    }

     private void fillList(){
        DefaultListModel listModel = new DefaultListModel();
        DefaultListModel listModelStock = new DefaultListModel();
        MedicineList allMedicinesList = null;
        try {
            allMedicinesList = MedicinesController.getAllMedicines();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(SecretaryGiveMedicine.class.getName()).log(Level.SEVERE, null, ex);
        }
        ArrayList<Medicine> allMedicines = allMedicinesList.getAllMedicines();
        if (allMedicines != null) {
            for (Medicine medicine : allMedicines) {
                listModel.addElement(medicine.getName());
                listModelStock.addElement(medicine.getQuantity());
            }
        }
        
        
        listMedicine.setModel(listModel);
        listQuantity.setModel(listModelStock);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        lblHome = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listMedicine = new javax.swing.JList<>();
        btnApprove = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listQuantity = new javax.swing.JList<>();
        txtAmount = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblHome.setText("Give Medicine");

        jScrollPane1.setViewportView(listMedicine);

        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(listQuantity);

        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });

        jLabel1.setText("Amount:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHome)
                            .addComponent(btnBack)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btnBack))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        String medicineName = listMedicine.getSelectedValue();
        String strAmount = txtAmount.getText();
        int amount = 0;
        boolean valid = true;
        try{
            amount = Integer.parseInt(strAmount);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(new JFrame(), "Please select a valid amount(in integer)","Required input",JOptionPane.ERROR_MESSAGE);
            valid = false;
        }
        if (medicineName == null) {
            JOptionPane.showMessageDialog(new JFrame(), "Please select a medicine to remove","Required input",JOptionPane.ERROR_MESSAGE);
            valid = false;
        }
        if (valid) {
            MedicineList allMedicinesList = null;
            try {
                allMedicinesList = MedicinesController.getAllMedicines();
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(SecretaryGiveMedicine.class.getName()).log(Level.SEVERE, null, ex);
            }
            ArrayList<Medicine> allMedicines = allMedicinesList.getAllMedicines();
            if (allMedicines != null) {
                for (Medicine medicine : allMedicines) {
                    if (medicine.getName().equals(medicineName)) {
                        int stock = medicine.getQuantity();
                        medicine.setQuantity(stock - amount);
                    try {
                        MedicinesController.editMedicine(medicine);
                        } catch (IOException | ClassNotFoundException e) {
                            e.printStackTrace();
                        }   
                        fillList();
                        JOptionPane.showMessageDialog(null, "Medicine successfully given: Stock reduced ", "Success", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }  
        }
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        new SecretaryView(secretary).setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountActionPerformed

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
            java.util.logging.Logger.getLogger(SecretaryGiveMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecretaryGiveMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecretaryGiveMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecretaryGiveMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecretaryGiveMedicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblHome;
    private javax.swing.JList<String> listMedicine;
    private javax.swing.JList<String> listQuantity;
    private javax.swing.JTextField txtAmount;
    // End of variables declaration//GEN-END:variables
}
