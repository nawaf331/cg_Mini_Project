/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class HospitalOrderForm extends javax.swing.JFrame {

    /**
     * Creates new form Hospitalform
     */
    public HospitalOrderForm() {
        initComponents();
        setLocation(200, 100);
        tHospital.requestFocus();

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
        lBloodtype = new javax.swing.JLabel();
        tPhone_no = new javax.swing.JTextField();
        tHospital = new javax.swing.JTextField();
        lQuantity = new javax.swing.JLabel();
        lHospital = new javax.swing.JLabel();
        lPhone_no = new javax.swing.JLabel();
        comboBloodtype = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        tCity = new javax.swing.JTextField();
        lState = new javax.swing.JLabel();
        comboState = new javax.swing.JComboBox();
        spinnerQuantity = new javax.swing.JSpinner();
        bOrder = new javax.swing.JButton();
        bReset = new javax.swing.JButton();
        bCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Blood Bank - Hospital Order");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel1.setText("Order Blood");

        lBloodtype.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        lBloodtype.setText("Blood Type");

        tPhone_no.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N

        tHospital.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N

        lQuantity.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        lQuantity.setText("Quantity");
        lQuantity.setToolTipText("Quanity in packets");

        lHospital.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        lHospital.setText("Hospital Name");

        lPhone_no.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        lPhone_no.setText("Phone_no");

        comboBloodtype.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        comboBloodtype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A+", "AB-", "A-", "B+", "B-", "O+", "O-", "AB+", " ", " " }));
        comboBloodtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBloodtypeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel2.setText("City");

        tCity.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N

        lState.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        lState.setText("State");

        comboState.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        comboState.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Karnataka", "Kerala", "Tamil Nadu", "Maharashtra", "Other" }));

        spinnerQuantity.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        spinnerQuantity.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        spinnerQuantity.setToolTipText("Quanity in packet");

        bOrder.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        bOrder.setText("Order");
        bOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOrderActionPerformed(evt);
            }
        });

        bReset.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        bReset.setText("Reset");
        bReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetActionPerformed(evt);
            }
        });

        bCancel.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        bCancel.setText("Cancel");
        bCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lBloodtype)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboBloodtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(lQuantity)
                        .addGap(18, 18, 18)
                        .addComponent(spinnerQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lHospital)
                            .addComponent(lPhone_no)
                            .addComponent(jLabel2)
                            .addComponent(lState)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(bOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tPhone_no)
                            .addComponent(tCity)
                            .addComponent(comboState, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tHospital, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(bReset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(bCancel)
                                .addGap(20, 20, 20)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bCancel, bOrder, bReset});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lHospital)
                            .addComponent(tHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lPhone_no))
                    .addComponent(tPhone_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lState, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboState))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lBloodtype)
                    .addComponent(comboBloodtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lQuantity)
                    .addComponent(spinnerQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bReset)
                    .addComponent(bCancel))
                .addGap(32, 32, 32))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bCancel, bOrder, bReset});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {comboBloodtype, comboState, spinnerQuantity, tCity});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBloodtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBloodtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBloodtypeActionPerformed

    private void bCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_bCancelActionPerformed

    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed
        tHospital.setText(null);
        tPhone_no.setText(null);
        tCity.setText(null);
        comboState.setSelectedIndex(0);
        comboBloodtype.setSelectedIndex(0);
        spinnerQuantity.setValue(1);
        tHospital.requestFocus();
    }//GEN-LAST:event_bResetActionPerformed

    private void bOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOrderActionPerformed
        BusinessLogic.OrderBloodBL order=new BusinessLogic.OrderBloodBL();
        order.IncrementBloodQuantity();
        JOptionPane.showConfirmDialog(this, "Your request is accepted. thank you", "Accepted", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bOrderActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HospitalOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HospitalOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HospitalOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HospitalOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new HospitalOrderForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancel;
    private javax.swing.JButton bOrder;
    private javax.swing.JButton bReset;
    private javax.swing.JComboBox comboBloodtype;
    private javax.swing.JComboBox comboState;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lBloodtype;
    private javax.swing.JLabel lHospital;
    private javax.swing.JLabel lPhone_no;
    private javax.swing.JLabel lQuantity;
    private javax.swing.JLabel lState;
    private javax.swing.JSpinner spinnerQuantity;
    private javax.swing.JTextField tCity;
    private javax.swing.JTextField tHospital;
    private javax.swing.JTextField tPhone_no;
    // End of variables declaration//GEN-END:variables
}
