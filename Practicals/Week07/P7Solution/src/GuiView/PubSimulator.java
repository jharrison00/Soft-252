package GuiView;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arahat
 */
import javax.swing.*;
import java.util.Enumeration;
import java.awt.event.ActionListener;

/**
 *
 * @author arahat
 */
public class PubSimulator extends javax.swing.JFrame {

    /**
     * Creates new form PubSimulator
     */
    
    private ButtonGroup bg = new ButtonGroup();
    
    /**
     *
     */
    public PubSimulator() {
        initComponents();
        groupButton();
    }
    
    private void groupButton(){
        bg.add(jRadioPint);
        bg.add(jRadioBottle);
        bg.add(jRadioCocktail);
        bg.add(jRadioCoffee);
        bg.add(jRadioLongDrink);
        bg.add(jRadioTea);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jRadioPint = new javax.swing.JRadioButton();
        jRadioBottle = new javax.swing.JRadioButton();
        jRadioTea = new javax.swing.JRadioButton();
        jRadioCoffee = new javax.swing.JRadioButton();
        jRadioLongDrink = new javax.swing.JRadioButton();
        jRadioCocktail = new javax.swing.JRadioButton();
        jOrderButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextGreetings = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextResponse = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Greetings");

        jRadioPint.setText("Pint");

        jRadioBottle.setText("Bottle");

        jRadioTea.setText("Tea");

        jRadioCoffee.setText("Coffee");

        jRadioLongDrink.setText("Long Drink");

        jRadioCocktail.setText("Cocktail");

        jOrderButton.setText("Order");
        jOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOrderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioTea)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioLongDrink)
                            .addComponent(jRadioCocktail)
                            .addComponent(jRadioPint)
                            .addComponent(jRadioBottle)
                            .addComponent(jRadioCoffee))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioPint)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioBottle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioTea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioCoffee)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioLongDrink)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioCocktail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jOrderButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Select Drink");

        jLabel3.setText("Response from Landlord");

        jTextGreetings.setEditable(false);
        jTextGreetings.setColumns(10);
        jTextGreetings.setRows(5);
        jTextGreetings.setPreferredSize(new java.awt.Dimension(4, 22));
        jScrollPane1.setViewportView(jTextGreetings);

        jTextResponse.setEditable(false);
        jTextResponse.setColumns(10);
        jTextResponse.setRows(5);
        jScrollPane2.setViewportView(jTextResponse);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(58, 58, 58))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOrderButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jOrderButtonActionPerformed


    /**
     * Setting the greetings text on the view. 
     * @param text
     */
    public void setGreetings(String text){
        jTextGreetings.setText(text);
    }
    
    /**
     * Setting the response text on the view. 
     * @param text
     */
    public void setResponse(String text){
        jTextResponse.setText(text);
    }
    
    /**
     * Get the selected choice by the user. 
     * @return Selected button text.
     */
    public String getChoice(){
        for (Enumeration<AbstractButton> buttons = bg.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                return button.getText();
            }
        }
        return null;
    }
    
    /**
     * An utility to display error messages. 
     * @param errorMessage The required error message.
     */
    public void DisplayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }
    
    /**
     * Set a particular listener strategy for an element on the view. 
     * @param strategy specific control strategy.
     */
    public void addButtonHandlerStrategy(ActionListener strategy){
        jOrderButton.addActionListener(strategy);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jOrderButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioBottle;
    private javax.swing.JRadioButton jRadioCocktail;
    private javax.swing.JRadioButton jRadioCoffee;
    private javax.swing.JRadioButton jRadioLongDrink;
    private javax.swing.JRadioButton jRadioPint;
    private javax.swing.JRadioButton jRadioTea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextGreetings;
    private javax.swing.JTextArea jTextResponse;
    // End of variables declaration//GEN-END:variables
}
