/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.GuiView.DoctorView;

import Model.Appointments.Appointment;
import Model.Users.Doctor;
import View.DoctorState.AppointmentView;
import View.DoctorState.DoctorState;
import static View.DoctorState.DoctorView.getAppointments;
import View.DoctorState.IState;
import View.GuiView.LogInView;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author jonat
 */
public class DoctorView extends javax.swing.JFrame implements IState{
private Doctor doctor;
    /**
     * Creates new form DoctorView
     */
    public DoctorView() {
        initComponents();
        fillList();
    }
    
    public DoctorView(Doctor doctor) {
        initComponents();
        this.doctor = doctor;
        fillList();
    }
    
    private void fillList(){
        DefaultListModel listModel = new DefaultListModel();
        ArrayList<Appointment> allAppointments = doctor.getAppointments();
        if (allAppointments != null) {
            for (Appointment appointment : allAppointments) {
                int id = appointment.getAppointmentID();
                String strId = Integer.toString(id);
                listModel.addElement(strId);
            }
        }
        else {
        listModel.addElement("No appointments");}
        listAppointments.setModel(listModel); 
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
        btnCreateAppointment = new javax.swing.JButton();
        btnEnterAppointment = new javax.swing.JButton();
        btnCreateMedicine = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listAppointments = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        btnViewAppointment = new javax.swing.JButton();
        btnViewFeedback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblHome.setText("Doctor Home Page");

        btnExit.setText("Log out");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnCreateAppointment.setText("Create Appointment");
        btnCreateAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAppointmentActionPerformed(evt);
            }
        });

        btnEnterAppointment.setText("Enter Appointment");
        btnEnterAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterAppointmentActionPerformed(evt);
            }
        });

        btnCreateMedicine.setText("Create Medicine");
        btnCreateMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateMedicineActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(listAppointments);

        jLabel1.setText("Appointments:");

        btnViewAppointment.setText("View Appointment");
        btnViewAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAppointmentActionPerformed(evt);
            }
        });

        btnViewFeedback.setText("View Feedback");
        btnViewFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewFeedbackActionPerformed(evt);
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
                        .addComponent(lblHome)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnExit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnViewAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnEnterAppointment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCreateAppointment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                    .addComponent(btnCreateMedicine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnViewFeedback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))))
                        .addGap(38, 38, 38))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHome)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEnterAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(btnCreateAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCreateMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(btnViewFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnViewAppointment)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.setVisible(false);
        new LogInView().setVisible(true);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnEnterAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterAppointmentActionPerformed
        String strAppointmentId = listAppointments.getSelectedValue();
        int appointmentId = Integer.parseInt(strAppointmentId);
        ArrayList<Appointment> allAppointments = doctor.getAppointments();
        if (allAppointments != null) {
            for (Appointment appointment:allAppointments) {
                if (appointmentId == appointment.getAppointmentID()) {
                    this.setVisible(false);
                    new DoctorAppointmentView(doctor,appointment).setVisible(true);
                }
            }
        }

    }//GEN-LAST:event_btnEnterAppointmentActionPerformed

    private void btnViewAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAppointmentActionPerformed
        String strAppointmentId = listAppointments.getSelectedValue().toString();
        int appointmentId = Integer.parseInt(strAppointmentId);
        if (listAppointments.getSelectedIndex() == -1) {
              JOptionPane.showMessageDialog(new JFrame(), "Please choose a valid appointment","Required input",JOptionPane.ERROR_MESSAGE);  
        }
        else{
            ArrayList<Appointment> allAppointments = doctor.getAppointments();
            for (Appointment appointment:allAppointments) {
            if (appointmentId == appointment.getAppointmentID()) {
                this.setVisible(false);
                new DoctorViewAppointments(doctor,appointment).setVisible(true);
            }
        }  
        }
    }//GEN-LAST:event_btnViewAppointmentActionPerformed

    private void btnCreateAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAppointmentActionPerformed
        this.setVisible(false);
        new DoctorCreateAppointment(doctor).setVisible(true);
    }//GEN-LAST:event_btnCreateAppointmentActionPerformed

    private void btnCreateMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateMedicineActionPerformed
        this.setVisible(false);
        new DoctorCreateMedicine(doctor).setVisible(true);
    }//GEN-LAST:event_btnCreateMedicineActionPerformed

    private void btnViewFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewFeedbackActionPerformed
        this.setVisible(false);
        new DoctorViewFeedback(doctor).setVisible(true);
    }//GEN-LAST:event_btnViewFeedbackActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateAppointment;
    private javax.swing.JButton btnCreateMedicine;
    private javax.swing.JButton btnEnterAppointment;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnViewAppointment;
    private javax.swing.JButton btnViewFeedback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHome;
    private javax.swing.JList<String> listAppointments;
    // End of variables declaration//GEN-END:variables

    @Override
    public void enterAppointment(Doctor doctor, DoctorState doctorState, Appointment appointment) {    
        doctorState.setAppointment(appointment);
        System.out.println("Entering appointment view");
        AppointmentView.appointmentHome(doctor,doctorState.getAppointment());
        doctorState.setState(new AppointmentView());
    }

    @Override
    public void exitAppointment(Doctor doctor, DoctorState doctorState, Appointment appointment) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}