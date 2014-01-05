/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class DonorsMainForm extends javax.swing.JFrame {

    /**
     * Creates new form DonorsMainForm
     */
    public DonorsMainForm() {
        initComponents();
        lWarning.setText(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lWelcome = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bDonateBlood = new javax.swing.JButton();
        bUpdateProfile = new javax.swing.JButton();
        bDeleteAccount = new javax.swing.JButton();
        bDonateCash = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lRegisteredWith = new javax.swing.JLabel();
        bRemindMe = new javax.swing.JButton();
        lNextBloodDonation = new javax.swing.JLabel();
        lLastBloodDonation = new javax.swing.JLabel();
        lWarning = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Blood Bank - Registered User");

        lWelcome.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        lWelcome.setText("Welcome, User");

        bDonateBlood.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        bDonateBlood.setText("Donate Blood");

        bUpdateProfile.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        bUpdateProfile.setText("Update My profile");

        bDeleteAccount.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        bDeleteAccount.setText("Delete My Account");
        bDeleteAccount.setToolTipText("");

        bDonateCash.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        bDonateCash.setText("Donate Cash");
        bDonateCash.setToolTipText("Provides information about Manager. You may donate cash to him and collect reciept");
        bDonateCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDonateCashActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bDonateBlood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bUpdateProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bDeleteAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bDonateCash, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bDeleteAccount, bDonateBlood, bDonateCash, bUpdateProfile});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bDonateCash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bDonateBlood, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bUpdateProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bDeleteAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bDeleteAccount, bDonateBlood, bDonateCash, bUpdateProfile});

        lRegisteredWith.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        lRegisteredWith.setText("You are registered with :");

        bRemindMe.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        bRemindMe.setText("Remind me");
        bRemindMe.setToolTipText("This will send notification to the phone number");
        bRemindMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRemindMeActionPerformed(evt);
            }
        });

        lNextBloodDonation.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        lNextBloodDonation.setForeground(java.awt.Color.blue);
        lNextBloodDonation.setText("You may Donate Blood on :");

        lLastBloodDonation.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        lLastBloodDonation.setForeground(new java.awt.Color(0, 0, 255));
        lLastBloodDonation.setText("Your Last Blood Donation was on :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lRegisteredWith)
                    .addComponent(lLastBloodDonation)
                    .addComponent(lNextBloodDonation))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(bRemindMe)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lLastBloodDonation)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNextBloodDonation)
                    .addComponent(bRemindMe))
                .addGap(18, 18, 18)
                .addComponent(lRegisteredWith)
                .addContainerGap())
        );

        lWarning.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        lWarning.setForeground(java.awt.Color.blue);
        lWarning.setText("lwarning");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(58, 58, 58)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(189, 189, 189)
                            .addComponent(lWelcome))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(71, 71, 71)
                            .addComponent(lWarning))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lWelcome)
                .addGap(47, 47, 47)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(54, 54, 54)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lWarning)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bRemindMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRemindMeActionPerformed
        JOptionPane.showConfirmDialog(this, "Notification Will be Sent to you on time","Information",JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bRemindMeActionPerformed

    private void bDonateCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDonateCashActionPerformed
                JOptionPane.showConfirmDialog(this, "We do not have any online payment option. You may pay manager direclty and get the reciept. Thak you","Thank You",JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bDonateCashActionPerformed

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
            java.util.logging.Logger.getLogger(DonorsMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DonorsMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DonorsMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DonorsMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new DonorsMainForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDeleteAccount;
    private javax.swing.JButton bDonateBlood;
    private javax.swing.JButton bDonateCash;
    private javax.swing.JButton bRemindMe;
    private javax.swing.JButton bUpdateProfile;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lLastBloodDonation;
    private javax.swing.JLabel lNextBloodDonation;
    private javax.swing.JLabel lRegisteredWith;
    private javax.swing.JLabel lWarning;
    private javax.swing.JLabel lWelcome;
    // End of variables declaration//GEN-END:variables
}
